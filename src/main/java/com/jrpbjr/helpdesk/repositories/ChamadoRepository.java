package com.jrpbjr.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jrpbjr.helpdesk.domain.Chamado;


public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	
	

}
