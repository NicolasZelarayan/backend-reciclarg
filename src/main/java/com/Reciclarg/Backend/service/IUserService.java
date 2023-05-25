
package com.Reciclarg.Backend.service;
import com.Reciclarg.Backend.model.User;



public interface IUserService {
    public User buscarUserByName(String username);
    //ublic List<User> VerUsuarios();
    public void SaveUsuario(User user);
    public void borrarUsuario(Long id);
    public User buscarUserById(Long id);
}
