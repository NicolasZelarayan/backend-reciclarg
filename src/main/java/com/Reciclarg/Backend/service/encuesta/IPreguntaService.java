
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Pregunta;
import java.util.List;


public interface IPreguntaService {
    public List<Pregunta> VerPreguntas();
    public void SavePregunta(Pregunta pregunta);
    public void borrarPregunta(Long id);
    public Pregunta buscarPreguntaById(Long id); 

}
