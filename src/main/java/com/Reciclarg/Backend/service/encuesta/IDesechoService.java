
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Desecho;
import java.util.List;


public interface IDesechoService {
    public List<Desecho> verDesechos();
    public void SaveDesecho(Desecho desecho);    
    public Desecho BuscarDesechoById(Long id);
    public void BorrarDesechoById(Long id);
}
