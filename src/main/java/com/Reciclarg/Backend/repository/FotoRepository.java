
package com.Reciclarg.Backend.repository;

import com.Reciclarg.Backend.model.FotoPerfil;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FotoRepository extends JpaRepository <FotoPerfil, Long> {
    Optional<FotoPerfil> findByNombre(String name);
}
