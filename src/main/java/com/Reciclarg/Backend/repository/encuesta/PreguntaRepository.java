
package com.Reciclarg.Backend.repository.encuesta;

import com.Reciclarg.Backend.model.encuesta.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRepository extends JpaRepository <Pregunta, Long>{
    
}
