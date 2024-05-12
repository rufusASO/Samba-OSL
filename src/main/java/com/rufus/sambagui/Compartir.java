/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rufus.sambagui;

import javax.swing.table.DefaultTableModel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.ini4j.Ini;
import org.ini4j.Wini;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/**
 *
 * @author daniel
 */
public class Compartir {
    
    int num = 0; //variable simple que me servirá para asegurarme que añado, edito y quito filas distintas
    
    //ESTOS BOTONES AÚN NO ESTÁN IMPLEMENTADOS CON SUS FUNCIONES CORRESPONDIENTES. Por ahora sólo responden a la fila seleccionada.
    public void add(DefaultTableModel modelo){ //ojo que no tiene limite de cuántas filas puedo agregar
        modelo.addRow(new String[]{"" + num,"" + num,"" + num});
        num++;
    }
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
    
    
    //ESTE MÉTODO solo era de prueba para la lectura del archivo. BORRAR CUANDO NO SEA NECESARIO.
    public  void leerArchivoConf() {
        try {
            // Cargar el archivo smb.conf
            Wini smb = new Wini(new File("/etc/samba/smb.conf"));

            // Leer una propiedad, por ejemplo, la propiedad 'workgroup' en la sección 'global'
            String comment = smb.get("recursoluis", "comment");
            System.out.println("comentario actual: " + comment);

            // Modificar el valor de 'workgroup' en la sección 'global'
            //ini.put("global", "workgroup", "NEW_WORKGROUP");

            // Guardar los cambios en el archivo
            //ini.store();

            // Verificar el cambio
            //String newWorkgroup = ini.get("global", "workgroup");
            //System.out.println("Nuevo Workgroup: " + newWorkgroup);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Este método es para leer los datos de smb.conf y ponerlos en tabla. Por ahora sólo es un método llamado por botón.
    //supuestamente debería llamarse a este método al iniciar la aplicación.
    public void leerSmb(DefaultTableModel tabla){
        try{
            //Cargo el archivo smb.conf
            Wini smb = new Wini(new File("/etc/samba/smb.conf"));
            // Obtener todas las secciones del archivo INI
            Set<String> sectionNames = smb.keySet(); //ESTO AÚN NO OBTIENE LAS SECCIONES INHABILITADAS CON #. Haré eso con lectura en texto plano.
            //Ahora llenaré la tabla con estas secciones
            llenarTabla(sectionNames, tabla);
            
            //Este sólo es un for para ver las secciones que está leyendo. Borrar cuando no se necesario.
            for (String sectionName : sectionNames) {
                System.out.println("Sección: " + sectionName);
            }
            
        }catch(IOException e){
                e.printStackTrace();
        }
    }
    //FALTA AÑADIR LOS DEMÁS DATOS. (Sólo estal las secciones)
    private void llenarTabla(Set<String> sectionNames, DefaultTableModel tabla){
        for(String sectionName : sectionNames){
            if(("global").equals(sectionName)){
                //Si la sección es la global. NO hace nada.
            }else{
                tabla.addRow(new String[]{"Enable", ""+sectionName}); //Añade las secciones a la tabla
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
