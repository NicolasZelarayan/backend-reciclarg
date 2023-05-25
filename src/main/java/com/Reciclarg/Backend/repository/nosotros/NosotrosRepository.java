
package com.Reciclarg.Backend.repository.nosotros;

import com.Reciclarg.Backend.model.nosotros.Nosotros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NosotrosRepository extends JpaRepository <Nosotros, Long> {
    
}
