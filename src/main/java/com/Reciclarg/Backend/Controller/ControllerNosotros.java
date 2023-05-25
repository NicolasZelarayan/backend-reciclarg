
package com.Reciclarg.Backend.Controller;

import com.Reciclarg.Backend.model.FotoPerfil;
import com.Reciclarg.Backend.model.nosotros.Nosotros;
import com.Reciclarg.Backend.repository.nosotros.NosotrosRepository;
import com.Reciclarg.Backend.service.nosotros.NosotrosService;
import com.Reciclarg.Backend.util.ImageUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("nosotros")
public class ControllerNosotros {
    @Autowired
    public NosotrosService nosotrosRepo;
    
    @PostMapping (path ="/newNosotros", consumes = {MULTIPART_FORM_DATA_VALUE})
    public String nuevoNosotros(@RequestPart("nosotros")  Nosotros nosotros, @RequestPart("image") MultipartFile file){
        
        try {
             if (file != null) { // si envia foto la guardamos
                FotoPerfil foto = new FotoPerfil();
                foto = FotoPerfil.builder()
                    .id(0)
                    .nombre(nosotros.getApellido()+"_" +nosotros.getNombre()+ "_FotoPerfil")
                    .type(file.getContentType())
                    .photo(ImageUtil.compressImage(file.getBytes())).build();
                nosotros.setFotoPerfil(foto);                  

                }
            nosotrosRepo.SaveNosotros(nosotros);
            return "Ingreso Ok";
        } catch (Exception e) {
            return e.toString();
        }
    
    }
        
    @GetMapping ("/listNosotros")
    @ResponseBody
    public List<Nosotros> listaNosotros(){
        return nosotrosRepo.VerNosotros();
    }
    
    @GetMapping ("/Nosotros/{id}")
    @ResponseBody
    public Nosotros listaNosotros(@PathVariable Long id){
        return nosotrosRepo.buscarNosotrosById(id);
    }
    
    @GetMapping ("/borrarNosotros/{id}")
    @ResponseBody
    public String borrarNosotros(@PathVariable Long id){
        try {
               nosotrosRepo.borrarNosotros(id);
               return "Registro eliminado";
        } catch (Exception e) {
            return e.toString();
        }
    }
    
    
}
