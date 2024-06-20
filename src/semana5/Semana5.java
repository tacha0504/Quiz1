/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana5;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Solicitud de número de empleados y de salario de cada uno */
 /*Declaración de variables */
        int empleados;
        int salarios;
        int sum = 0;
        double abono = 0;
        double sem = 0;
        double ivm = 0;
        /*Se solicita la cantidad N de empleados y el salario de cada uno */
        empleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite la cantidad de empleados"));
        for (int i = 0; i < empleados; i++) {
            salarios = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el salario de cada empleado"));
            System.out.println("El salario ingresado es: " + salarios);
            sum += salarios;
            /*Con la suma de todos los salarios se saca el Seguro de Enfermedad y Maternidad (SEM)y el de Invalidez, Vejez y Muerte (IVM) */
            sem = sum * 0.0925;
            ivm = sum * 0.0508;
            abono = sem + ivm;
            /*Se muestra al final el abono que se tiene que dar a la CCSS por IVM y SEM */
            JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de: " + abono + "por concepto de SEM y IVM");

        }

    }
}
