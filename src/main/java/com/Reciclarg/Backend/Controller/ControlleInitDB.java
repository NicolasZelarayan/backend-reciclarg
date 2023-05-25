
package com.Reciclarg.Backend.Controller;

import com.Reciclarg.Backend.model.User;
import com.Reciclarg.Backend.model.Zona;
import com.Reciclarg.Backend.model.encuesta.Desecho;
import com.Reciclarg.Backend.model.encuesta.Encuesta;
import com.Reciclarg.Backend.model.encuesta.Motivo;
import com.Reciclarg.Backend.model.encuesta.Paradero;
import com.Reciclarg.Backend.model.encuesta.Pregunta;
import com.Reciclarg.Backend.model.encuesta.Recicla;
import com.Reciclarg.Backend.service.IUserService;
import com.Reciclarg.Backend.service.IZonaService;
import com.Reciclarg.Backend.service.encuesta.IDesechoService;
import com.Reciclarg.Backend.service.encuesta.IEncuestaService;
import com.Reciclarg.Backend.service.encuesta.IMotivoService;
import com.Reciclarg.Backend.service.encuesta.IParaderoService;
import com.Reciclarg.Backend.service.encuesta.IPreguntaService;
import com.Reciclarg.Backend.service.encuesta.IReciclaService;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inicializar")
public class ControlleInitDB {
    
    @Autowired   
    public IDesechoService desechoServ; 
    
    @Autowired   
    public IMotivoService motivoServ; 
    
    @Autowired   
    public IParaderoService paraderoServ; 
    
    @Autowired   
    public IPreguntaService preguntaServ; 
    
     @Autowired   
    public IReciclaService reciclaServ; 
     
    @Autowired   
    public IEncuestaService encuestaServ; 
       
    @Autowired   
    public IUserService userService;
    
    @Autowired   
    public IZonaService zonService;
     
     @PostMapping ("/DataBaseInnit")
     public String initOpciones(@RequestParam("clave") String clave){
         if (clave.equals("123456")) {
             try {
                 zona();
                 desechos();
                 motivos();
                 paraderos();
                 preguntas();
                 recicla();
                 userInicial();
                 return "Ingreso Ok";
             } catch (Exception e) {
                 return e.toString();
             }
             
         }else{
             return "Clave invalida";
         }
     }
     
     
     private void userInicial(){
         User userInit = new User();
         userInit.setNombre("Reciclarg");
         userInit.setApellido("Administrador");
         userInit.setUsername("admin");
         BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
         userInit.setPassword(bcrypt.encode("Chiperos"));           
         Date Now = new Date(System.currentTimeMillis());
         userInit.setAlta(Now);
         Zona zonaUser = zonService.buscarUserByName("NoZona");
         userInit.setZona(zonaUser);
         userService.SaveUsuario(userInit);
         
         
         
     }
     
     private void zona(){
         Zona zonaInit = new Zona();
         zonaInit.setNombre("NoZona");
         zonaInit.setDescripcion("NoZona");
         zonService.SaveZona(zonaInit);
         
         
     }
     private void desechos(){
       String [] Desechos = {"Plastico","Vidrio","Metal","Papel","Organico","Carton","Otro"};
       
         for (String Desecho : Desechos) {
             Desecho d = new Desecho();
             d.setTipoDesecho(Desecho);
             desechoServ.SaveDesecho(d);
         }
     }
     
     private void motivos(){
       String [] items = {"Infrestructura","Desconocimiento","Sentido","Interes","Politicas"};
       
         for (String item : items) {
             Motivo o = new Motivo();
             o.setTipoMotivo(item);
             motivoServ.SaveMotivo(o);
         }
     }
     
     private void paraderos(){
       String [] items = {"Vertederos","Cielo Abierto","Incinerado","Reciclado"};
       
         for (String item : items) {
             Paradero o = new Paradero();
             o.setTipoParadero(item);
             paraderoServ.SaveParadero(o);
         }
     }
     
      private void preguntas(){
       String [] items = {"Punto Verde","Trabaja","Vende","No Dice"};
       
         for (String item : items) {
             Pregunta o = new Pregunta();
             o.setPregunta(item);
             preguntaServ.SavePregunta(o);
         }
     }
      
      private void recicla(){
       String [] items = {"Si","No","No Dice"};
       
         for (String item : items) {
             Recicla o = new Recicla();
             o.setTipoRecicla(item);
             reciclaServ.SaveRecicla(o);
         }
     }
      
      @GetMapping ("/EncuestasInit/{clave}")
     public String initEncuesta(@PathVariable int clave){
         
          if (clave == 123456) {
              for (int i = 0; i < 1000; i++) {
              
              int idDesechos = (int)(Math.random()*7+1);
              int idMotivoss = (int)(Math.random()*5+1);
              int idParaderos = (int)(Math.random()*4+1);
              int idPreguntas = (int)(Math.random()*4+1);
              int idRecicla = (int)(Math.random()*3+1);
              
              Desecho desecho = desechoServ.BuscarDesechoById(new Long(idDesechos));
              Motivo motivo = motivoServ.buscarMotivoById(new Long(idMotivoss));
              Paradero paradero = paraderoServ.buscarParaderoById(new Long(idParaderos));
              Pregunta pregunta = preguntaServ.buscarPreguntaById(new Long(idPreguntas));
              Recicla recicla = reciclaServ.buscarReciclaById(new Long(idRecicla));
              
              Encuesta encuesta = new Encuesta();
              encuesta.setDesecho(desecho);
              encuesta.setMotivo(motivo);
              encuesta.setParadero(paradero);
              encuesta.setPregunta(pregunta);
              encuesta.setRecicla(recicla);
              
              int menos = (int)(Math.random()*30+1);
             LocalDate dateBefore30Days = LocalDate.now(ZoneId.of("Europe/Paris")).minusDays(menos);  
             Date dia = convertToDate(dateBefore30Days);
             encuesta.setDate(dia);
             encuestaServ.SaveEncuesta(encuesta);
             
            }   
              return "ingreso ok";
          }
          else{
               return "error clave";
                       }
                  
         }
     
     public Date convertToDate(LocalDate dateToConvert){
    return java.sql.Date.valueOf(dateToConvert);
    }

}
