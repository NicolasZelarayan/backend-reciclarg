
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Encuesta;
import java.util.List;


public interface IEncuestaService {
    public List<Encuesta> verEncuestas();
    public void SaveEncuesta(Encuesta encuesta);    
    public Encuesta BuscarEncuestaById(Long id);
    public void BorrarEncuestaById(Long id);
}
