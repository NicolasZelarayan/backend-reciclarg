
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Paradero;
import com.Reciclarg.Backend.repository.encuesta.ParaderoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParaderoService implements IParaderoService{
    @Autowired
    public ParaderoRepository paraderoRepo;
    
    @Override
    public List<Paradero> VerParaderos() {
        return paraderoRepo.findAll();
    }

    @Override
    public void SaveParadero(Paradero paradero) {
       paraderoRepo.save(paradero);
    }

    @Override
    public void borrarParadero(Long id) {
       paraderoRepo.deleteById(id);
    
    }

    @Override
    public Paradero buscarParaderoById(Long id) {
       return paraderoRepo.findById(id).orElse(null);
    
    }
    
}
