
package com.Reciclarg.Backend.model.encuesta;

import com.Reciclarg.Backend.model.User;
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
@Table(name = "desecho")
public class Desecho {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String tipoDesecho;
     
     @JsonIgnore
    @OneToMany(mappedBy = "desecho")
    private Set<Encuesta> encuesta = new HashSet<>();
}
