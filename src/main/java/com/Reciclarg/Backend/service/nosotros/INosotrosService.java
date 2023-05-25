
package com.Reciclarg.Backend.service.nosotros;

import com.Reciclarg.Backend.model.nosotros.Nosotros;
import java.util.List;


public interface INosotrosService {
    public List<Nosotros> VerNosotros();
    public void SaveNosotros(Nosotros nosotros);
    public void borrarNosotros(Long id);
    public Nosotros buscarNosotrosById(Long id); 
}
