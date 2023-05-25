
package com.Reciclarg.Backend.model.encuesta;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "pregunta")
public class Pregunta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String pregunta;
     
         @JsonIgnore
    @OneToMany(mappedBy = "pregunta")
    private Set<Encuesta> encuesta = new HashSet<>();
}
