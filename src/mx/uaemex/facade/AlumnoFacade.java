
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.AlumnoDao;
import mx.uaemex.dto.Alumno;
import mx.uaemex.servicios.BibliotecaServicio;


/**
 *
 * @author HP pro
 */
public abstract  class AlumnoFacade implements BibliotecaServicio  {
    
    
    AlumnoDao alumnoDao = new AlumnoDao();

 
    
    @Override
    public void agregarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.agregarAlumno(alumno);
    }

  
    
    @Override
    public void actualizarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.actualizarAlumno( alumno);
    }
    
 
    @Override
    public void eliminarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.eliminarAlumno(alumno);
    }

  
    @Override
    public void buscarAlumno(List<Alumno> lista, Alumno alumno) {
        alumnoDao.buscarAlumno(5);
    }
    
    

}
