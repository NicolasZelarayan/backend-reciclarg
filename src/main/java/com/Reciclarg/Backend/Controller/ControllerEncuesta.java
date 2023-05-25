
package com.Reciclarg.Backend.Controller;

import com.Reciclarg.Backend.model.encuesta.Encuesta;
import com.Reciclarg.Backend.service.encuesta.IEncuestaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("encuesta")
public class ControllerEncuesta {
    
    @Autowired   
    public IEncuestaService encuestaService;
    
     @GetMapping ("/listencuesta")
     @CrossOrigin(origins = "http://127.0.0.1:5500")
     public List<Encuesta> ListarEncuestas(){
         
         return encuestaService.verEncuestas();
     }
     
     @PostMapping ("/addencuesta")
     public void nuevaEncuesta(@RequestBody Encuesta encuesta){
            encuestaService.SaveEncuesta(encuesta);
     }
      @GetMapping ("/deleteEncuesta/{id}")
      public void borrarEncuesta(@PathVariable Long id){
          encuestaService.BorrarEncuestaById(id);
      }
      
      @GetMapping ("/getencuesta/{id}")
      public Encuesta traerEncuesta(@PathVariable Long id){
          return encuestaService.BuscarEncuestaById(id);
      }
}
