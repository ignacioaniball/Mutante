package com.mutante;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.mutante.service.MutanteService;

public class MutanServiceTests {

	private final MutanteService mutanteService = new MutanteService() ;
	
	public String[] adnHuman = {"ATGCGA", "CAGTGC", "TTGTGT", "AGATGG", "CCATTA", "TCACTG"};
	public String[] adnMutante = {"AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA"};
	public String[] onlyOneRow = {"AAAAAA", "CAGTGC", "TTGTGT", "AGAAGG", "CCATCA", "TCACTG"};
	public String[] onlyOneColumn = {"ATGCGA", "AAGTGC", "ATGTGT", "AGAAGG", "CCATCA", "TCACTG"};

	@Test
	public void checkMutante() {
		assertTrue(mutanteService.isMutant(adnMutante));		
		assertEquals(true, mutanteService.isMutant(adnMutante));		
	}	
	@Test
	public void checkHuman() {
		assertFalse(mutanteService.isMutant(adnHuman));
		assertEquals(false, mutanteService.isMutant(adnHuman));
	}	
	@Test
	public void onlyOnceRowMach() {
		assertFalse(mutanteService.isMutant(onlyOneRow));
		assertEquals(false, mutanteService.isMutant(onlyOneRow));
	}
	@Test
	public void onlyOnceColumnMach() {
		assertFalse(mutanteService.isMutant(onlyOneColumn));
		assertEquals(false, mutanteService.isMutant(onlyOneColumn));
	}
}
