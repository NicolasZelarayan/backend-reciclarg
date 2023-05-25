
package com.Reciclarg.Backend.service.marcadores;

import com.Reciclarg.Backend.model.contenedores.Marcadores;
import java.util.List;

public interface IMarcadoresService {
    public List<Marcadores> VerMarcadores();
    public void SaveMarcadores(Marcadores marcadores);
    public void borrarMarcadores(Long id);
    public Marcadores buscarMarcadoresById(Long id); 
}
