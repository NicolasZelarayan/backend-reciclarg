
package com.Reciclarg.Backend.model.encuesta;

import com.Reciclarg.Backend.model.Zona;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.security.Timestamp;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "encuesta")
public class Encuesta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    @ManyToOne
    @JoinColumn(name = "desecho_id")
    private Desecho desecho; 
    
    @ManyToOne
    @JoinColumn(name = "motivo_id")
    private Motivo motivo; 
    
    @ManyToOne
    @JoinColumn(name = "paradero_id")
    private Paradero paradero; 
    
    @ManyToOne
    @JoinColumn(name = "pregunta_id")
    private Pregunta pregunta; 
    
    @ManyToOne
    @JoinColumn(name = "recicla_id")
    private Recicla recicla; 
}
