
package com.Reciclarg.Backend.service;

import com.Reciclarg.Backend.model.FotoPerfil;
import org.springframework.web.multipart.MultipartFile;


public interface IFotoPerfilService {
    public void SaveFotoPerfil(MultipartFile file, String username, Long id);
    public FotoPerfil BuscarFotoPerfilByNombre(String nombre);
    public FotoPerfil BuscarFotoPerfilById(Long id);
    public void BorrarFotoPerfilById(Long id);
}
