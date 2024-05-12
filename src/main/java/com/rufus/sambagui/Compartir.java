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

/**
 *
 * @author daniel
 */
public class Compartir {
    
    int num = 0; //variable simple que me servirá para asegurarme que añado, edito y quito filas distintas
    
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
    
    

    /*
    public void leerArchivoConf(){
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("/etc/samba/smb.conf")) {
            // Load a properties file
            prop.load(input);
            // Get the value of the property "key"
            String value = prop.getProperty("comment");
            System.out.println("Value: " + value);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*///Este método usa la clase PROPERTIES, pero no es muy util, porque sólo se queda con el último valor leído.
    

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
    }*/
    public  void leerArchivoConf() {
        try {
            // Cargar el archivo smb.conf
            Wini ini = new Wini(new File("/etc/samba/smb.conf"));

            // Leer una propiedad, por ejemplo, la propiedad 'workgroup' en la sección 'global'
            String comment = ini.get("recursoluis", "comment");
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



 
    
    
}
