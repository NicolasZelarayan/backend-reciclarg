
package com.Reciclarg.Backend.model.contenedores;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "marcadores")
public class Marcadores {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String latitud;
    private String longitud;
    private String title;
    private String descripcion;
    
    @Column(length = 500)
    private String url_image;
    
    
    
}
