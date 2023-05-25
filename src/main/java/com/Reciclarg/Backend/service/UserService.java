
package com.Reciclarg.Backend.service;

import com.Reciclarg.Backend.model.User;
import com.Reciclarg.Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired 
    public UserRepository UserRepo;
    
    
 
    @Override
    public User buscarUserByName(String username) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return UserRepo.findByUsername(username);
    }

    @Override
    public void SaveUsuario(User user) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    UserRepo.save(user);
    }

    @Override
    public void borrarUsuario(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       UserRepo.deleteById(id);
    }

    @Override
    public User buscarUserById(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return UserRepo.findById(id).orElse(null);
    }
    
}
