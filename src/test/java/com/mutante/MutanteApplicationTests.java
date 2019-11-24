package com.mutante;

import static org.mockito.Mockito.when;

import java.security.cert.CertPathChecker;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito.Then;
import org.springframework.boot.test.context.SpringBootTest;

import com.mutante.service.MutanteService;

@SpringBootTest
class MutanteApplicationTests {

	MutanteService mutanteService;
//	String[] adnMutante = new ArrayList<String>()["ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"];
	@Test
	void contextLoads() {
	}
	
	@Test
	public void checkMutante() {
//		when(mutanteService.isMutant(dna)) Then<T>
	}	
}
