
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.LibroDao;
import mx.uaemex.dto.Libro;
import mx.uaemex.servicios.BibliotecaServicio;

/**
 *
 * @author HP pro
 */
public abstract class LibroFacade implements BibliotecaServicio {
    LibroDao libroDao = new LibroDao();

   
     
    @Override
    public void agregarLibro(List<Libro> lista, Libro libro) {
       libroDao.agregarLibro( libro);
    }

  
    
    
    @Override
    public void actualizarLibro(List<Libro> lista, Libro libro) {
        libroDao.actualizarLibro( libro);
    }
    


    @Override
    public void eliminarLibro(List<Libro> lista, Libro libro) {
        libroDao.eliminarLibro( libro);
    }

   
     
    @Override
    public void buscarLibro(List<Libro> lista, Libro libro) {
        libroDao.buscarLibro(2);
    }
        
}
