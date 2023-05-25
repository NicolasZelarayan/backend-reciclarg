
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Pregunta;
import com.Reciclarg.Backend.repository.encuesta.PreguntaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaService implements IPreguntaService {
    @Autowired
    public PreguntaRepository preguntaRepo;
    
    @Override
    public List<Pregunta> VerPreguntas() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     return preguntaRepo.findAll();
    
    }

    @Override
    public void SavePregunta(Pregunta pregunta) {
       preguntaRepo.save(pregunta);
    }

    @Override
    public void borrarPregunta(Long id) {
        preguntaRepo.deleteById(id);
    }

    @Override
    public Pregunta buscarPreguntaById(Long id) {
        return preguntaRepo.findById(id).orElse(null);
    }
    
}
