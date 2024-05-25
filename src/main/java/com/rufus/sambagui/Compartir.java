/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rufus.sambagui;

import javax.swing.table.DefaultTableModel;

import org.ini4j.Wini;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import javax.swing.JTable;

/**
 *
 * @author daniel
 */
public class Compartir {
    
    //Vamos a tener para cualquier método un sólo Archivo a modificar: El smb.conf
    //File fsmb;
    Wini smb;
    
    
    
    public Compartir(Wini smbCopia){
        this.smb = smbCopia;
    }
    
    
    
    //Al terminar interfaz del botón ADD, debo pasarle parametros del nombre, path, comment, etc. que
    // serán dados por el usuario en la ventana/panel nuevo que se abrirá por este botón)
    public void addSeccion(String[] datos, DefaultTableModel modeloTabla){
        try {
            // Agregar una nueva sección con algunos valores
            //Orden: 0:ReadOnly , 1:Nombre , 2:Path , 3:Guest Access , 4:Comentario.
            String newSectionName = datos[1];
            smb.add(newSectionName);
            smb.put(newSectionName, "comment", datos[4]);
            smb.put(newSectionName, "path", datos[2]);
            smb.put(newSectionName, "guest ok", datos[3]);
            smb.put(newSectionName, "read only", datos[0]);
            
            
            //Agrega esta nueva sección a la tabla
            agregarFilaTabla(newSectionName, modeloTabla);
            
            // Guardar los cambios en el archivo.
            smb.store();
            reiniciarServicioSMB();
            System.out.println("Sección agregada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al modificar el archivo smb.conf: " + e.getMessage());
        }
    }
    
    public void editSeccion(int fila, JTable tablaDatos){
        
        String seccionAEditar = (String) tablaDatos.getValueAt(tablaDatos.getSelectedRow(), 2);
        System.out.println("Editando la sección " + seccionAEditar);
        
    }
    
    public void deleteSeccion(int fila, JTable tabla, String seccionAEliminar){
        try {
            // Eliminar la sección
            if (smb.remove(seccionAEliminar) != null) {
                System.out.println("Sección eliminada exitosamente.");
            } else {
                System.out.println("La sección no fue encontrada.");
            }

            // Guardar los cambios en el archivo
            smb.store();
            
            DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
            modeloTabla.removeRow(fila);
            reiniciarServicioSMB();
        } catch (IOException e) {
            System.err.println("Error al modificar el archivo INI: " + e.getMessage());
        }
    }
    
    private void agregarFilaTabla(String newSection, DefaultTableModel modeloTabla){
        
        String readOnly = smb.get(newSection, "read only");
        if(readOnly == null) readOnly = "Yes"; //Si no se especifica, es = Yes
        readOnly = Character.toUpperCase(readOnly.charAt(0)) + readOnly.substring(1);//Esto solo coloca el primer caracter en mayuscula.
        
        String path = smb.get(newSection, "path");
        if(path == null) path = ""; //Al parecer, si no se especifica este valor por defecto = "". (Eso lo ví con el yast).
        
        String guestAccess = smb.get(newSection, "guest ok");
        if(guestAccess == null) guestAccess = "no"; //Al parecer, si no se especifica este valor por defecto = No. (Eso lo ví con el yast).
        guestAccess = Character.toUpperCase(guestAccess.charAt(0)) + guestAccess.substring(1);//Esto solo coloca el primer caracter en mayuscula.
        
        String comment = smb.get(newSection, "comment");
        
        modeloTabla.addRow(new String[]{"Enable",readOnly,newSection,path,guestAccess,comment});
    }
    
    
    /*
            // Modificar el valor de 'workgroup' en la sección 'global'
            smb.put("global", "workgroup", "NEW_WORKGROUP");
            path : /home/luissmb/creadoPorLuis
            
    */
    
    
    
    public void reiniciarServicioSMB(){
        String s = "";
        try{
            String comando;
            comando = "sudo service smb restart";
            System.out.println("Servicio REINICIADO");
            //Ejecución del comando
            Process p = Runtime.getRuntime().exec(comando);
            //BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            //BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            
            //leemos la salida del comando
            //System.out.println("Ésta es la salida standar del comando: \n");
            //while((s = stdInput.readLine()) != null){
            //    System.out.println(s);
            //}
            //Leemos los errores si los hubiera
            //System.out.println("Ésta es la salida standar de error del comando (si la hay): \n");
            //while((s = stdError.readLine()) != null){
            //    System.out.println(s);
            //}
        }catch(IOException e){
            System.out.println("Excepción: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
    
    //Este método es para leer los datos de smb.conf y ponerlos en tabla. Por ahora sólo es un método llamado por botón.
    //supuestamente debería llamarse a este método al iniciar la aplicación.
    public void leerSmb(DefaultTableModel modeloTabla){
            //Esta línea obtiene las secciones.
            Set<String> sectionNames = smb.keySet(); //ESTO AÚN NO OBTIENE LAS SECCIONES INHABILITADAS CON #. Haré eso con lectura en texto plano.
            for(String sectionName : sectionNames){
                if(("global").equals(sectionName)){
                    //Si la sección es la global. NO hace nada.
                }else{
                    agregarFilaTabla(sectionName, modeloTabla);
                }
            }
    }
    
    public Map<String,String> getValoresSeccion(String nombreSeccion){
        return smb.get(nombreSeccion);
    }
    
    public void cambiarSmb(Wini nuevoSmb){ //Este método sólo lo uso para mi botoncito lindo de editar
        this.smb = nuevoSmb;
    }
    /*//ESTO DE AQUÍ ES UN EJEMPLO PARA COLOCAR ## Y DESHABILITAR UNA SECCIÓN DEL ARCHIVO. AÚN NO LO PROBÉ.
    public  void inhabilitar() {
        try {
            // Cargar el archivo smb.conf
            Wini ini = new Wini(new File("/etc/samba/smb.conf"));

            // Supongamos que queremos comentar toda la sección 'global'
            if (ini.containsKey("global")) {
                // Obtenemos todas las claves de la sección 'global'
                for (String key : ini.get("global").keySet()) {
                    // Obtenemos el valor actual
                    String value = ini.get("global", key);
                    // Cambiamos la clave a una versión comentada
                    ini.put("global", "#" + key, value);
                    // Eliminamos la clave original
                    ini.remove("global", key);
                }
            }

            // Guardar los cambios en el archivo
            ini.store();

            System.out.println("Sección 'global' comentada exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

 
    
    
}
