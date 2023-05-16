package com.jrpbjr.helpdesk.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrpbjr.helpdesk.domain.Chamado;
import com.jrpbjr.helpdesk.domain.Cliente;
import com.jrpbjr.helpdesk.domain.Tecnico;
import com.jrpbjr.helpdesk.domain.enums.Perfil;
import com.jrpbjr.helpdesk.domain.enums.Prioridade;
import com.jrpbjr.helpdesk.domain.enums.Status;
import com.jrpbjr.helpdesk.repositories.ChamadoRepository;
import com.jrpbjr.helpdesk.repositories.ClienteRepository;
import com.jrpbjr.helpdesk.repositories.TecnicoRepository;

@Service
public class DBservice {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private	ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Jose Roberto", "63653230268", "jrpbjr@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Maria Aparecida", "90334707056", "maria@gmail.com", "123");
		tec2.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus torvalds", "80527954780", "torvalds@mail.com", "123");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}

}
