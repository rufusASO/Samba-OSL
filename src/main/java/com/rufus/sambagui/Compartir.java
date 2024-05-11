/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rufus.sambagui;

import javax.swing.table.DefaultTableModel;


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
}
