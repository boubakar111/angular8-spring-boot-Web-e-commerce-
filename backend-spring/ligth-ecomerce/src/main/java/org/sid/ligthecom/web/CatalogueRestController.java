package org.sid.ligthecom.web;



import java.nio.file.Files;
import java.nio.file.Paths;

import org.sid.ligthecom.Entity.Product;
import org.sid.ligthecom.dao.ProductRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@CrossOrigin("*")
@RestController

public class CatalogueRestController {
	
	
	private ProductRepository productRepository;
	
	public CatalogueRestController(ProductRepository productRepository) {
		this.productRepository= productRepository;
	}
	
	
	@GetMapping(path="/photoProduct/{id}",produces= MediaType.IMAGE_PNG_VALUE)
	public byte[] getPhoto(@PathVariable("id") Long id) throws Exception {
		
		Product p= productRepository.findById(id).get();
		return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/product/"+p.getPhotoName()));
	}
	
	
	@PostMapping(path ="/uploadPhoto/{id}")
	public void uploadPhoto(MultipartFile file, @PathVariable long id ) throws Exception{
	
		Product p = productRepository.findById(id).get();
		p.setPhotoName(id+".png");		
		Files.write(Paths.get(System.getProperty("user.home")+"/ecom/product/"+p.getPhotoName()),file.getBytes());
		productRepository.save(p);
		
	}

}
