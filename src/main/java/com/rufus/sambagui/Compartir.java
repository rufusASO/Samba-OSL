/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rufus.sambagui;

//import java.io.BufferedReader; si en algún momento quiero leer la salida de comando usar esto.
import javax.swing.table.DefaultTableModel;

import org.ini4j.Wini;
import java.io.File;
import java.io.IOException;
//import java.io.InputStreamReader; //olvide qué hacía esto pero lo dejo aquí.
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Compartir {
    
    //Al terminar interfaz del botón ADD, debo pasarle parametros del nombre, path, comment, etc. que
    // serán dados por el usuario en la ventana/panel nuevo que se abrirá por este botón)
    public void add(DefaultTableModel modelo){
        try {
            // Cargar el archivo smb.conf
            File file = new File("/etc/samba/smb.conf");
            Wini smb = new Wini(file);

            // Agregar una nueva sección con algunos valores
            String newSectionName = "RecursoNetLuis";
            smb.add(newSectionName);
            smb.put(newSectionName, "comment", "Carpeta creada por Luis en dir Luissmb, compartido por Net");
            smb.put(newSectionName, "path", "/home/luissmb/creadoPorLuis");
            smb.put(newSectionName, "guest ok", "No");

            //Agrega esta nueva sección a la tabla
            agregarFilaTabla(smb, newSectionName, modelo);
            
            // Guardar los cambios en el archivo. SE SUPONE QUE ESTO NO SE HACE HASTA QUE SE CONFIRME.
            smb.store();
            reiniciarServicioSMB();
            System.out.println("Sección agregada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al modificar el archivo smb.conf: " + e.getMessage());
        }
    }
    
    //ESTOS BOTONES AÚN NO ESTÁN IMPLEMENTADOS CON SUS FUNCIONES CORRESPONDIENTES. Por ahora sólo responden a la fila seleccionada.
    public void edit(int fila, DefaultTableModel modelo){
        if(fila == -1){
         //no hace nada
        }else{
            //por ahora sólo para ver si selecciono la fila correcta
            System.out.println("Editando la fila " + fila);
        }
    }
    public void delete(int fila, DefaultTableModel modelo){
        if(fila == -1){
            //no hace nada
        }else{
            modelo.removeRow(fila);
        }
    }
    
    //Puedo refactorizar esta parte. En un futuro hacer que este método sea llamado desde el método: llenartabla()
    //  para cada sección.
    private void agregarFilaTabla(Wini smb, String newSection, DefaultTableModel tabla){
        
        String readOnly = smb.get(newSection, "read only");
        if(readOnly == null) readOnly = "Yes";
        String path = smb.get(newSection, "path");
        String guestAccess = smb.get(newSection, "guest ok");
        String comment = smb.get(newSection, "comment");
        tabla.addRow(new String[]{"Enable",readOnly,newSection,path,guestAccess,comment});
    }
    
    
    /*public  void leerArchivoConf() {
        try {
            // Cargar el archivo smb.conf
            Wini ini = new Wini(new File("/etc/samba/smb.conf"));

            // Leer una propiedad, por ejemplo, la propiedad 'workgroup' en la sección 'global'
            String workgroup = ini.get("global", "workgroup");
            System.out.println("Workgroup actual: " + workgroup);

            // Modificar el valor de 'workgroup' en la sección 'global'
            ini.put("global", "workgroup", "NEW_WORKGROUP");

            // Guardar los cambios en el archivo
            ini.store();

            // Verificar el cambio
            String newWorkgroup = ini.get("global", "workgroup");
            System.out.println("Nuevo Workgroup: " + newWorkgroup);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*///ESTE ES LA MUESTRA ORIGINAL PARA LEER EL ARCHIVO. SÓLO REFERENCIA PARA VER QUÉ HACÍA CADA COSA
    
    
    //ESTE MÉTODO solo es para probar funcionalidades. BORRAR CUANDO NO SEA NECESARIO.
    public  void botonPrueba() {
        try {
            // Cargar el archivo smb.conf
            File file = new File("/etc/samba/smb.conf");
            Wini smb = new Wini(file);

            // Agregar una nueva sección con algunos valores
            String newSectionName = "RecursoNetLuis";
            smb.add(newSectionName);
            smb.put(newSectionName, "comment", "Carpeta creada por Luis en dir Luissmb, compartido por Net");
            smb.put(newSectionName, "path", "/home/luissmb/creadoPorLuis");
            smb.put(newSectionName, "guest ok", "No");

            // Guardar los cambios en el archivo. SE SUPONE QUE ESTO NO SE HACE HASTA QUE SE CONFIRME.
            //smb.store();
            reiniciarServicioSMB();
            System.out.println("Sección agregada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al modificar el archivo smb.conf: " + e.getMessage());
        }
    }
    
    
    private void reiniciarServicioSMB(){
        String s = "";
        try{
            String comando;
            comando = "sudo service smb restart";
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
    public void leerSmb(DefaultTableModel tabla){
        try{
            //Cargo el archivo smb.conf
            Wini smb = new Wini(new File("/etc/samba/smb.conf"));
            // Llenado de tabla
            llenarTabla(smb, tabla);
            
        }catch(IOException e){
                e.printStackTrace();
        }
    }
    
    //ESTAN LOS DATOS. PERO SÓLO LEE LAS SECCIONES HABILITADAS.
    private void llenarTabla(Wini smb, DefaultTableModel tabla){
        //Esta línea obtiene las secciones.
        Set<String> sectionNames = smb.keySet(); //ESTO AÚN NO OBTIENE LAS SECCIONES INHABILITADAS CON #. Haré eso con lectura en texto plano.
        
        for(String sectionName : sectionNames){
            if(("global").equals(sectionName)){
                //Si la sección es la global. NO hace nada.
            }else{
                //LEE CADA SECCIÓN Y OBTIENE LOS VALORES DESEADOS.  (Puedo refactorizar esto, leer método agregarFilaTabla()).
                String readOnly = smb.get("" + sectionName, "read only");
                if(readOnly == null) readOnly = "yes"; //Al parecer, si no se especifica este valor por defecto = Yes. (Eso lo ví con el yast).
                readOnly = Character.toUpperCase(readOnly.charAt(0)) + readOnly.substring(1);//Esto solo coloca el primer caracter en mayuscula.
                
                String path = smb.get("" + sectionName, "path");
                if(path == null) path = ""; //Al parecer, si no se especifica este valor por defecto = "". (Eso lo ví con el yast).
                
                String guestAccess = smb.get("" + sectionName, "guest ok");
                if(guestAccess == null) guestAccess = "no"; //Al parecer, si no se especifica este valor por defecto = No. (Eso lo ví con el yast).
                guestAccess = Character.toUpperCase(guestAccess.charAt(0)) + guestAccess.substring(1);//Esto solo coloca el primer caracter en mayuscula.
                
                String comment = smb.get("" + sectionName, "comment");
                
                //AÑADE ESOS VALORES DESEADOS A LA TABLA. (en el orden de secciones que se encuentra en el mismo smb.conf)
                tabla.addRow(new String[]{"Enable",readOnly,sectionName,path,guestAccess,comment});
                
            }
        }
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
