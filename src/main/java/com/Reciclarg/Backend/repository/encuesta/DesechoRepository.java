
package com.Reciclarg.Backend.repository.encuesta;

import com.Reciclarg.Backend.model.encuesta.Desecho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesechoRepository extends JpaRepository <Desecho, Long> {
    
}
