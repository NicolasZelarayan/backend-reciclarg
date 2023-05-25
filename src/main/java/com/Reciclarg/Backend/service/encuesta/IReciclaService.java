
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Recicla;
import java.util.List;


public interface IReciclaService {
    public List<Recicla> VerReciclas();
    public void SaveRecicla(Recicla recicla);
    public void borrarRecicla(Long id);
    public Recicla buscarReciclaById(Long id); 

}
