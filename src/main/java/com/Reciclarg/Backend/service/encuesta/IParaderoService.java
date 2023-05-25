
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Paradero;
import java.util.List;


public interface IParaderoService {
    public List<Paradero> VerParaderos();
    public void SaveParadero(Paradero paradero);
    public void borrarParadero(Long id);
    public Paradero buscarParaderoById(Long id); 

}
