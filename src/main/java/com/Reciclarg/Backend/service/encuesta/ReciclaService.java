
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Recicla;
import com.Reciclarg.Backend.repository.encuesta.ReciclaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReciclaService implements IReciclaService{
    @Autowired
    public ReciclaRepository reciclaRepo;
    
    @Override
    public List<Recicla> VerReciclas() {
        return reciclaRepo.findAll();
    }

    @Override
    public void SaveRecicla(Recicla recicla) {
        reciclaRepo.save(recicla);
    }

    @Override
    public void borrarRecicla(Long id) {
        reciclaRepo.deleteById(id);
    }

    @Override
    public Recicla buscarReciclaById(Long id) {
       return reciclaRepo.findById(id).orElse(null);    }
    
}
