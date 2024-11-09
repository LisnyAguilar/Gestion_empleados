/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package com.mycompany.empleado;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        
        Empleado emp1 = new Empleado("Lisny Aguilar", 25, 30000);
        Empleado emp2 = new Empleado("Maynor Iglesias", 27, 35000);
        
        gestor.agregarEmpleado(emp1);
        gestor.agregarEmpleado(emp2);
        
        gestor.mostrarEmpleados();
    }
}