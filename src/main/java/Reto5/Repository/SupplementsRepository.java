/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto5.Repository;


import Reto5.model.Supplements;
import Reto5.mongoRepository.SupplementsMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luis Rengifo
 */
@Repository
public class SupplementsRepository {
@Autowired
    private SupplementsMongoRepository repository;

    public List<Supplements> getAll() {
        return repository.findAll();
    }

    public Optional<Supplements> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Supplements create(Supplements clothe) {
        return repository.save(clothe);
    }

    public void update(Supplements clothe) {
        repository.save(clothe);
    }
    
    public void delete(Supplements clothe) {
        repository.delete(clothe);
    }
    
    public List<Supplements> getPrice(Double price){
        return repository.findByPrice(price);
    }
    
    public List<Supplements> getByDescription(String description){
        return repository.findByDescriptionContainingIgnoreCase(description);
    }
  
}

