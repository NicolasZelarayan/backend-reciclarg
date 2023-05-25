
package com.Reciclarg.Backend.repository.encuesta;

import com.Reciclarg.Backend.model.encuesta.Paradero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParaderoRepository extends JpaRepository <Paradero, Long> {
    
}
