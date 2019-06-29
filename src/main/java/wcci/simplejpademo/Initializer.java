package wcci.simplejpademo;

import java.util.Optional;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(Initializer.class);

	@Resource
	private CustomerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// save a couple of customers
		repository.save(new Customer("Jack", "Bauer"));
		repository.save(new Customer("Chloe", "O'Brian"));
		repository.save(new Customer("Kim", "Bauer"));
		repository.save(new Customer("David", "Palmer"));
		repository.save(new Customer("Michelle", "Dessler"));

//		// fetch all customers
//		log.info("Customers found with findAll():");
//		log.info("-------------------------------");
//		for (Customer customer : repository.findAll()) {
//			log.info(customer.toString());
//		}
//		log.info("");
//
//		// fetch an individual customer by ID
//		Optional<Customer> customer = repository.findById(1L);
//		log.info("Customer found with findOne(1L):");
//		log.info("--------------------------------");
//		log.info(customer.get().toString());
//		log.info("");
//
//		// fetch customers by last name
//		log.info("Customer found with findByLastName('Bauer'):");
//		log.info("--------------------------------------------");
//		for (Customer bauer : repository.findByLastName("Bauer")) {
//			log.info(bauer.toString());
//		}
//		log.info("");
//
//		// fetch all customers and order by last name
//		log.info("Customers found with findAll() and sorted by last name:");
//		log.info("-------------------------------");
//		for (Customer customerSorted : repository.findAllByOrderByLastNameAsc()) {
//			log.info(customerSorted.toString());
//		}
//		log.info("");
//
//		// fetch first 3 customers and order by last name
//		log.info("First 3 customers found with findAll() and sorted by last name:");
//		log.info("-------------------------------");
//		for (Customer customerSorted : repository.findFirst3ByOrderByLastNameAsc()) {
//			log.info(customerSorted.toString());
//		}
//		log.info("");
	}

}