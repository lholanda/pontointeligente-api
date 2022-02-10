package com.lh.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lh.pontointeligente.api.entities.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	// ajuda a melhorar performance 
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}