/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.uaemex.servicios;

import java.util.List;
import mx.uaemex.dto.Alumno;
import mx.uaemex.dto.Libro;
import mx.uaemex.dto.Prestamo;
import mx.uaemex.dto.Profesor;


/**
 *
 * @author HP pro
 */
public interface BibliotecaServicio {
    

    
    void agregarAlumno ( List<Alumno> lista, Alumno alumno);
    void actualizarAlumno ( List<Alumno> lista, Alumno alumno);
    void buscarAlumno ( List<Alumno> lista, Alumno alumno);
    void eliminarAlumno (List<Alumno> lista, Alumno alumno);
    
    void agregarLibro (List<Libro> lista, Libro libro);
    void actualizarLibro ( List<Libro> lista, Libro libro);
    void buscarLibro ( List<Libro> lista, Libro libro);
    void eliminarLibro (List<Libro> lista, Libro libro);
    

    void agregarPrestamo ( Prestamo prestamo);
    void actualizarPrestamo ( List<Prestamo> lista, Prestamo prestamo);
    void buscarPrestamo ( List<Prestamo> lista, Prestamo prestamo);
    void eliminarPrestamo (Prestamo prestamo);
    
    void agregarProfesor (Profesor profesor);
    void actualizarProfesor ( Profesor profesor);
    void buscarProfesor (List<Profesor> lista, Profesor profesor);
    void eliminarProfesor (Profesor profesor);
    
}
