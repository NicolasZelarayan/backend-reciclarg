
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
@Table(name = "recicla")
public class Recicla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private String tipoRecicla;
     
     
    @JsonIgnore
    @OneToMany(mappedBy = "recicla")
    private Set<Encuesta> encuesta = new HashSet<>();
}
