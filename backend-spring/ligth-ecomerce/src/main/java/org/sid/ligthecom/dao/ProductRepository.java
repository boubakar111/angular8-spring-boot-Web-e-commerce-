package org.sid.ligthecom.dao;

import java.util.List;

import org.sid.ligthecom.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	@RestResource(path="/selectedProducts")	
	public List<Product> findBySelectedIsFalse();
	
	
	@RestResource(path="/productsByKeyword")	
	public List<Product> findByNameContains( @Param("mc") String mc);
	
	@RestResource(path="/promoProducts")	
	public List<Product> findByPromotionIsTrue();
	
	
	@RestResource(path="/dispoProducts")	
	public List<Product> findByAvailableIsTrue();
	
	
	

}
