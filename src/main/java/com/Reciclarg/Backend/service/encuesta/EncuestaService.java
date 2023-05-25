
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Encuesta;
import com.Reciclarg.Backend.repository.encuesta.EncuestaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncuestaService implements IEncuestaService{
    
    @Autowired
    public EncuestaRepository encuestarepo;
    
    @Override
    public List<Encuesta> verEncuestas() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return encuestarepo.findAll();
    }

    @Override
    public void SaveEncuesta(Encuesta encuesta) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        encuestarepo.save(encuesta);
    }

    @Override
    public Encuesta BuscarEncuestaById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return encuestarepo.findById(id).orElse(null);
    }

    @Override
    public void BorrarEncuestaById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        encuestarepo.deleteById(id);
    }
    
}
