
package com.Reciclarg.Backend.service.encuesta;

import com.Reciclarg.Backend.model.encuesta.Desecho;
import com.Reciclarg.Backend.repository.encuesta.DesechoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesechoService implements IDesechoService{

    @Autowired
    public DesechoRepository deschoRepo;
    
    @Override
    public List<Desecho> verDesechos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return deschoRepo.findAll();
    }

    @Override
    public void SaveDesecho(Desecho desecho) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        deschoRepo.save(desecho);
    }
    
  

    @Override
    public void BorrarDesechoById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        deschoRepo.deleteById(id);
    }

    @Override
    public Desecho BuscarDesechoById(Long id) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return deschoRepo.findById(id).orElse(null);
    }
    
}
