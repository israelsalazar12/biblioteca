/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;

/**
 *
 * @author eq28
 */
public class Biblioteca1 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(2);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("numeros");
        libro2.setIsbn(3221);
        libro2.setStock(4);
        
        Libro libro3 = new Libro();
        libro3.setId(3);
        libro3.setNombre("la epistemologia");
        libro3.setCategoria("filosofia");
        libro3.setEditorial("filosofando");
        libro3.setIsbn(8563);
        libro3.setStock(1);
        
        Libro libro4 = new Libro();
        libro4.setId(4);
        libro4.setNombre("materia");
        libro4.setCategoria("ciencias");
        libro4.setEditorial("Alfaomega");
        libro4.setIsbn(7567);
        libro4.setStock(2);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        
        List<Libro> listaLibros1 = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        
        List<Libro> listaLibros2 = new ArrayList<>();
        listaLibros.add(libro4);
        listaLibros.add(libro3);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Minina");
        alumno1.setApellidoMaterno("Hernandez");
        alumno1.setNumeroCuenta(2227234);
        
        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("fernando");
        alumno2.setApellidoPaterno("minino");
        alumno2.setApellidoMaterno("Cruz");
        alumno2.setNumeroCuenta(2022556);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        
        Prestamo prestamo2 = new Prestamo();
        Date fechaIni1 = new Date();
        prestamo2.setId(2);
        prestamo2.setFolio(134);
        prestamo2.setFechainicio(fechaIni1);
        prestamo2.setLibros(listaLibros1);
        prestamo2.setPersona(alumno2);


        Test1 test1 = new Test1();
        test1.testCrearLibro(libro1);
        test1.testCrearLibro(libro2);
        test1.testCrearAlumno(alumno1);
        test1.testCrearPrestamo(prestamo1);
        test1.testCrearPrestamo(prestamo2);

        test1.consultarTodos();
        test1.consultarPrestamo();

    }

}
