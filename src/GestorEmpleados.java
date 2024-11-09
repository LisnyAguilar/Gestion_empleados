/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package com.mycompany.empleado;

import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private List<Empleado> empleados;

    public GestorEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public void mostrarEmpleados() {
        System.out.println("Detalles de los empleados:");
        for (Empleado empleado : empleados) {
            empleado.imprimirInformacion();
        }
    }
}
