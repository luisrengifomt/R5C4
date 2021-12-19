package Reto5;


import Reto5.mongoRepository.OrderMongoRepository;
import Reto5.mongoRepository.SupplementsMongoRepository;
import Reto5.mongoRepository.UserMongoRepository;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto5Application implements CommandLineRunner {

        @Autowired
        private SupplementsMongoRepository Supplementsrepo;
        @Autowired
        private UserMongoRepository Userrepo;
        @Autowired
        private OrderMongoRepository Orderrepo;
        
    
    
    
	public static void main(String[] args) {
		SpringApplication.run(Reto5Application.class, args);
	}
        
        
        
        @Override
        public void run(String... args) throws Exception {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Supplementsrepo.deleteAll();
        Userrepo.deleteAll();
        Orderrepo.deleteAll();
        
        }

}


