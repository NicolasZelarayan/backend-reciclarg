
package com.Reciclarg.Backend.repository.encuesta;

import com.Reciclarg.Backend.model.encuesta.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncuestaRepository extends JpaRepository <Encuesta, Long>{
    
}
