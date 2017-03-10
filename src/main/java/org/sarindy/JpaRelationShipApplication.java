package org.sarindy;



import org.sarindy.OneToOne.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaRelationShipApplication implements CommandLineRunner {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(JpaRelationShipApplication.class);
	
	@SuppressWarnings("unused")
	@Autowired
	private BookRepository bookRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaRelationShipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
