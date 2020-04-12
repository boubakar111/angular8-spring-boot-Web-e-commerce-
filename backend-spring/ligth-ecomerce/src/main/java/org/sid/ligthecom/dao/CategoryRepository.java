package org.sid.ligthecom.dao;

import org.sid.ligthecom.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")

@RepositoryRestResource

public interface CategoryRepository  extends JpaRepository < Category, Long>{

}