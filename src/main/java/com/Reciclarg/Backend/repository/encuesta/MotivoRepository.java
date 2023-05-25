
package com.Reciclarg.Backend.repository.encuesta;

import com.Reciclarg.Backend.model.encuesta.Motivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRepository extends JpaRepository <Motivo, Long>{
    
}
