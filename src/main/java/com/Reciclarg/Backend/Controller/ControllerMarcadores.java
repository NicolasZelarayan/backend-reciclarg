
package com.Reciclarg.Backend.Controller;

import com.Reciclarg.Backend.model.FotoPerfil;
import com.Reciclarg.Backend.model.contenedores.Marcadores;
import com.Reciclarg.Backend.service.marcadores.IMarcadoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("markers")
public class ControllerMarcadores {
    
    @Autowired   
    public IMarcadoresService marcadoresService;
    
    @GetMapping ("/vermarcadores")    
    @ResponseBody
    public List<Marcadores> VerMaracdores(){
       
          return marcadoresService.VerMarcadores();
        
    }
          
    @GetMapping ("/vermarcador/{id}")
    @ResponseBody
    public Marcadores VerMaracdores(@PathVariable Long id){
    
        return marcadoresService.buscarMarcadoresById(id);
        
    }
    
    @PostMapping ("/newmarcador")
    public String NuevoMarcador(@RequestBody Marcadores marcador){
        
        try {
            marcadoresService.SaveMarcadores(marcador);
            return "Marcador ingresado";
        } catch (Exception e) {
            return e.toString();
        }
    }
    
     @GetMapping ("/eliminarmarcador/{id}")
        public String deleteMaracdores(@PathVariable Long id){
            try {
             marcadoresService.borrarMarcadores(id);
             return "Marcador eliminado";
         } catch (Exception e) {
             return e.toString();
         }       
        
    }
}
