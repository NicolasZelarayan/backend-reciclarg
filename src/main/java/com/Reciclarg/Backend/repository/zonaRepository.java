
package com.Reciclarg.Backend.repository;

import com.Reciclarg.Backend.model.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface zonaRepository extends JpaRepository <Zona, Long>{
    public Zona findByNombre(String nombre);
}
