/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto5.mongoRepository;



import Reto5.model.Supplements;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Luis Rengifo
 */
public interface SupplementsMongoRepository extends MongoRepository<Supplements, String> {
    List<Supplements> findByPrice(Double price);
    List<Supplements> findByDescriptionContainingIgnoreCase(String description);
    
}
