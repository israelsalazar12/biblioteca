/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.dao;

import java.util.ArrayList;
import java.util.List;
import mx.uaemex.dto.Alumno;

/**
 *
 * @author eq28
 */
public class AlumnoDao {

 public  List<Alumno> alumnos = new ArrayList<>();

     
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);

    }

    public void eliminarAlumno( Alumno alumno) {
        alumnos.remove(alumno);
    }

    public Alumno buscarAlumno(int id) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a= alumnos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarAlumno(Alumno alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
          if(alumnos.get(i).getId()== alumno.getId()){
              alumnos.get(i).setNombre(alumno.getNombre());
               alumnos.get(i).setApellidoMaterno(alumno.getApellidoMaterno());
          }
            }
        }
     
    
    public void imprimirAlumno (ArrayList<Alumno> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}
