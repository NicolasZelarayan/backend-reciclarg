
package com.Reciclarg.Backend.model.nosotros;

import com.Reciclarg.Backend.model.FotoPerfil;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "nosotros")
public class Nosotros {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String nombre;
    private String apellido;
    
    private String linkedin;
    private String github;
    private String twitter;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foto_id")
    private FotoPerfil fotoPerfil;
}
