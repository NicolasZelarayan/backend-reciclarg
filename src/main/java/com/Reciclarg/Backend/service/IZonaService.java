
package com.Reciclarg.Backend.service;

import com.Reciclarg.Backend.model.Zona;
import java.util.List;


public interface IZonaService {
    public Zona buscarUserByName(String nombre);
    public List<Zona> VerZonas();
    public void SaveZona(Zona zona);
    public void borrarZona(Long id);
    public Zona buscarZonaById(Long id); 
}
