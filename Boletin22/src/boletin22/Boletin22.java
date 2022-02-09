/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import javax.swing.JOptionPane;
import libreriaAlex.leerDatos;

/**
 *
 * @author alex0
 */
public class Boletin22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        int filas= leerDatos.leerInt(" Número de filas: ");
        int columnas= leerDatos.leerInt(" Número de columnas: ");
        EquiposDivision obx= new EquiposDivision();
        
        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("****MENU EQUIPOS**** \n 1--> CREAR TABOA \n 2--> AMOSAR ARRAY \n 3--> EQUIPO + GOLES XORNADA \n 4--> XORNADA + GOLES \n 5--> EQUIPO E XORNADA + NUM GOLES \n 6--> SAIR"));
            switch (opcion){
                
                case 1: notas = EquiposDivision.crear(taboa);
                    break;
                
                case 2: EquiposDivision.amosar(taboa);
                    break;
                    
                case 3:int pos= EquiposDivision.sumarGoles(taboa);
                    break;
                    
                case 4:MetodosArrays.ordenar(notas);
                    break;
                    
                case 5: notas=MetodosArrays.copiarLista(notas);
                    break;
    }
    
}
