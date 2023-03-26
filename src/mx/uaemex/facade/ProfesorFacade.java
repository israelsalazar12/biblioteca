
package mx.uaemex.facade;

import mx.uaemex.dao.ProfesorDao;
import mx.uaemex.dto.Profesor;
import mx.uaemex.servicios.BibliotecaServicio;

/**
 *
 * @author HP pro
 */
public abstract class ProfesorFacade implements BibliotecaServicio  {
    ProfesorDao profesorDao= new ProfesorDao();
	
 
    @Override
	public void agregarProfesor(Profesor profesor) {
		profesorDao.agregarProfesor(profesor);
	}
	
	public void leerProfesor() {
		profesorDao.MostrarLista();
	}
	
    
    @Override
	public void actualizarProfesor(Profesor profesor) {
		profesorDao.actualizarProfesor(profesor);
	}
	
    
    @Override
	public void eliminarProfesor(Profesor profesor) {
		profesorDao.eliminarProfesor(profesor);
	}
}
