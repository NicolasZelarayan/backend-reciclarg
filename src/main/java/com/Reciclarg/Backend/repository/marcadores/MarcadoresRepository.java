
package com.Reciclarg.Backend.repository.marcadores;

import com.Reciclarg.Backend.model.contenedores.Marcadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcadoresRepository extends JpaRepository <Marcadores, Long> {
    
}
