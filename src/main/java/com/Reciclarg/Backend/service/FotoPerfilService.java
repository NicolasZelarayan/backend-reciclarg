
package com.Reciclarg.Backend.service;


import com.Reciclarg.Backend.model.FotoPerfil;
import com.Reciclarg.Backend.repository.FotoRepository;
import com.Reciclarg.Backend.util.ImageUtil;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FotoPerfilService implements IFotoPerfilService {
    @Autowired
    private FotoRepository fotoRepo;
    
      public String uploadImage(MultipartFile file, String username) throws IOException {

        fotoRepo.save(FotoPerfil.builder()
                .nombre(username + file.getOriginalFilename())
                .type(file.getContentType())
                .photo(ImageUtil.compressImage(file.getBytes())).build());

        return "Image uploaded successfully: " +
                file.getOriginalFilename();

    }

    @Override
    public void SaveFotoPerfil(MultipartFile file, String username, Long id) {
        try {
            fotoRepo.save(FotoPerfil.builder()
                    .id(id)
                    .nombre(username + file.getOriginalFilename())
                    .type(file.getContentType())
                    .photo(ImageUtil.compressImage(file.getBytes())).build());
        } catch (IOException ex) {
            Logger.getLogger(FotoPerfilService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public FotoPerfil BuscarFotoPerfilByNombre(String nombre) {
        Optional<FotoPerfil> dbImage = fotoRepo.findByNombre(nombre);

        return FotoPerfil.builder()
                .nombre(dbImage.get().getNombre())
                .type(dbImage.get().getType())
                .photo(ImageUtil.decompressImage(dbImage.get().getPhoto())).build();
    
    }

    @Override
    public FotoPerfil BuscarFotoPerfilById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
    }

    @Override
    public void BorrarFotoPerfilById(Long id) {
       fotoRepo.deleteById(id);
    }
}
