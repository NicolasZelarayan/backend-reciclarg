
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Motivo;
import com.Reciclarg.Backend.repository.encuesta.MotivoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotivoService implements IMotivoService {
    @Autowired
    public MotivoRepository motivoRepo;
    
    @Override
    public List<Motivo> VerMotivos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return motivoRepo.findAll();
    }

    @Override
    public void SaveMotivo(Motivo motivo) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       motivoRepo.save(motivo);
    }

    @Override
    public void borrarMotivo(Long id) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       motivoRepo.deleteById(id);
    }

    @Override
    public Motivo buscarMotivoById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return motivoRepo.findById(id).orElse(null);
    }
    
}
