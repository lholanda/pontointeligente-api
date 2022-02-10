package com.lh.pontointeligente.api.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.lh.pontointeligente.api.entities.Empresa;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
//@TestPropertySource(locations = "classpath:application-test.properties")
public class EmpresaRepositoryTest {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	private static final String CNPJ = "06860085000164";

	@BeforeEach
	public void setUp() throws Exception{
		Empresa empresa = new Empresa();
		
		empresa.setCnpj(CNPJ);
		empresa.setRazaoSocial("SoftSoft Ltda");
		
		System.out.println("incluindo empresa - teste da empresa nnnn" + empresa.getCnpj() );
		this.empresaRepository.save(empresa);
		
	}
	
	@AfterEach
	public void cleanAll()
	{
		System.out.println("limpando toda a tabela...");
		this.empresaRepository.deleteAll();
	}
	
	@Test
	public void testBuscaPorCnpj() {
		Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);
		
		System.out.println("pesquisando - teste da empresa --- " + empresa);
		
		assertEquals(CNPJ, empresa.getCnpj());
		
	}
	
	
}
