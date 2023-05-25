
package com.Reciclarg.Backend.service.marcadores;
import com.Reciclarg.Backend.model.contenedores.Marcadores;
import com.Reciclarg.Backend.repository.marcadores.MarcadoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarcadoresService implements IMarcadoresService{
    
    @Autowired
    public MarcadoresRepository marcadoresRepo;
    
    @Override
    public List<Marcadores> VerMarcadores() {
        return marcadoresRepo.findAll();
    }

    @Override
    public void SaveMarcadores(Marcadores marcadores) {
        marcadoresRepo.save(marcadores);
    }

    @Override
    public void borrarMarcadores(Long id) {
        marcadoresRepo.deleteById(id);
    }

    @Override
    public Marcadores buscarMarcadoresById(Long id) {
        return marcadoresRepo.findById(id).orElse(null);
    }
    
}
