package com.jrpbjr.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrpbjr.helpdesk.domain.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
