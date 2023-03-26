
package mx.uaemex.facade;

import java.util.List;
import mx.uaemex.dao.PrestamoDao;
import mx.uaemex.dto.Prestamo;
import mx.uaemex.servicios.BibliotecaServicio;

/**
 *
 * @author HP pro
 */
public abstract class PrestamoFacade implements BibliotecaServicio {
    PrestamoDao prestamoDao = new PrestamoDao();

   
    
    @Override
    public void agregarPrestamo(Prestamo prestamo) {
       prestamoDao.agregarPrestamo(prestamo);
    }

    @Override
   public void buscarPrestamo(List lista, Prestamo prestamo) {
       prestamoDao.buscarPrestamo(1);
   }
    
 
    @Override
    public void actualizarPrestamo(List<Prestamo> lista, Prestamo prestamo) {
       prestamoDao.actualizarPrestamo(prestamo);
    }
    

  
    @Override
    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoDao.eliminarPrestamo(prestamo);
    }
}

