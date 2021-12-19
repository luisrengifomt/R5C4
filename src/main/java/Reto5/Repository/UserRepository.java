/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto5.Repository;


import Reto5.model.User;
import Reto5.mongoRepository.UserMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Rengifo
 */
@Repository
public class UserRepository {

    @Autowired
    /**
     * User MOngo repository
     */
    private UserMongoRepository userCrudRepository;
    /**
     * Metoso User get all
     * @return 
     */
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }
    
    /**
     * Metodo user findvyID
     * @param id
     * @return 
     */

    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
    /**
     * meodo create User 
     * @param user
     * @return 
     */

    public User create(User user) {
        return userCrudRepository.save(user);
    }
    /**
     * Metodo Update user 
     * @param user 
     */
    
    public void update(User user) {
        userCrudRepository.save(user);
    }
    /**
     * Metodo Delete usr
     * @param user 
     */
    
    public void delete(User user) {
        userCrudRepository.delete(user);
    }
    
    /**
     * Metodo exisxtencia email
     * @param email
     * @return 
     */

    public boolean emailExists(String email) {
        Optional<User> usuario = userCrudRepository.findByEmail(email);
        
        return !usuario.isEmpty();
    }
    
    /**
     * Metodo que autentica los usuarios 
     * @param email
     * @param password
     * @return 
     */
    
    public Optional<User> authenticateUser(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
    
    /**
     * metodo que valida el siguiente usuaris 
     * @return 
     */
    
    public Optional<User> lastUserId(){
        return userCrudRepository.findTopByOrderByIdDesc();
    }
    
    /**
     * Metodo que genera el mes del cumpleadon 
     * @param monthBirthtDay
     * @return 
     */
    
    public List<User> getByMonthBirthtDay(String monthBirthtDay){
        return userCrudRepository.findByMonthBirthtDay(monthBirthtDay);
    }
    
   
}
