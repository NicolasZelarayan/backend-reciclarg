
package com.Reciclarg.Backend.Controller;

import com.Reciclarg.Backend.model.Zona;
import com.Reciclarg.Backend.service.IZonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zona")
public class ControllerZona {
    
    @Autowired   
    public IZonaService zonService;
    
    @PostMapping ("/newzona")
    public String newZona(@RequestBody Zona zonaNew){
        
        //Zona zona = new Zona();
       // zona.setNombre(nombre);
       // zona.setDescripcion(descripcion);
        try {
            zonService.SaveZona(zonaNew);
            return "Zona Ingresada";
        } catch (Exception e) {
            System.out.println(e.toString());
            return "Zona No Ingresada";
        }
        
    }
    
    @GetMapping ("/listarzonas")
    @ResponseBody
    public List<Zona> ListPerso(){
        return zonService.VerZonas();
        
    }
    

}
