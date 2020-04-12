package org.sid.ligthecom.dao;

import org.sid.ligthecom.Entity.Order;
import org.sid.ligthecom.Entity.Payement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource

public interface  PayementRepository extends JpaRepository <Payement , Long> {

}
