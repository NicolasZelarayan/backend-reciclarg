
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Motivo;
import java.util.List;


public interface IMotivoService {   
    public List<Motivo> VerMotivos();
    public void SaveMotivo(Motivo motivo);
    public void borrarMotivo(Long id);
    public Motivo buscarMotivoById(Long id); 
}
