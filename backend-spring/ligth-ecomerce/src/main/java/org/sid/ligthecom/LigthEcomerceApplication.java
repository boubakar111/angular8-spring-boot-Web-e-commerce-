package org.sid.ligthecom;

import java.util.Random;

import org.sid.ligthecom.Entity.Category;
import org.sid.ligthecom.Entity.Product;
import org.sid.ligthecom.dao.CategoryRepository;
import org.sid.ligthecom.dao.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class LigthEcomerceApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRpository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private  RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(LigthEcomerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		repositoryRestConfiguration.exposeIdsFor(Product.class, Category.class);
//		categoryRepository.save(new Category(null, "Computres", null, "hp5120", null));
//		categoryRepository.save(new Category(null, "Printers", null, "canon720", null));
//		categoryRepository.save(new Category(null, "SmartPhone", null, "galaxy500", null));
//         
//		Random rnd = new Random();
//		categoryRepository.findAll().forEach(c -> {
//			for (int i = 0; i < 10; i++) {
//				Product p = new Product();
//				p.setName(RandomString.make(18));
//				p.setCurrentPrice(100 + rnd.nextInt(1000));
//				p.setDescription("blablabla");
//				p.setAvailable(rnd.nextBoolean());
//				p.setPromotion(rnd.nextBoolean());
//				p.setCatigory(c);
//				p.setPhotoName("unknown.png");
//				productRpository.save(p);
//
//			}
//
//		});
	}

}
