
package com.Reciclarg.Backend.service.nosotros;

import com.Reciclarg.Backend.model.nosotros.Nosotros;
import com.Reciclarg.Backend.repository.nosotros.NosotrosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NosotrosService implements INosotrosService{
    @Autowired
    public NosotrosRepository nosotrosRepo;

    @Override
    public List<Nosotros> VerNosotros() {
               
         return nosotrosRepo.findAll();
    }

    @Override
    public void SaveNosotros(Nosotros nosotros) {
        nosotrosRepo.save(nosotros);
    }

    @Override
    public void borrarNosotros(Long id) {
        
       nosotrosRepo.deleteById(id);
    }

    @Override
    public Nosotros buscarNosotrosById(Long id) {
        return nosotrosRepo.findById(id).orElse(null);
    }
    
}
