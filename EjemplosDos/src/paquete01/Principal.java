/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete02.DatoTrabajo;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccion;
        
        double[]misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        empresa= DatoTrabajo.obtenerEmpresa();
        direccion=DatoTrabajo.obtenerDireccion();
        misNotas=DatoAcademico.obtenerNotas(4);
        promedio=DatoFinal.obtenerPromedio(misNotas);
        
        
        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciuadad: %s\n"
                + "Empresa: %s\n"
                + "Direccion: %s\n"
                + "Promedio: %.2f\n",
                nombre,apellidoRetornado,
                ciudad, empresa,direccion,promedio);
    }
    
}
