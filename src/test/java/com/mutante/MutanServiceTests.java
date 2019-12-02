package com.mutante;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.google.api.client.json.JsonString;
import com.google.gson.Gson;
import com.mutante.controller.MutanteController;
import com.mutante.entity.Mutante;
import com.mutante.service.MutanteService;

public class MutanServiceTests {

	private final MutanteService mutanteService = new MutanteService() ;
	private final MutanteController mutanteController = new MutanteController();
	
	public String[] adnHuman = {"ATGCGA", "CAGTGC", "TTGTGT", "AGATGG", "CCATTA", "TCACTG"};
	public String[] adnMutante = {"AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA"};
	public String[] onlyOneRow = {"AAAAAA", "CAGTGC", "TTGTGT", "AGAAGG", "CCATCA", "TCACTG"};
	public String[] onlyOneColumn = {"ATGCGA", "AAGTGC", "ATGTGT", "AGAAGG", "CCATCA", "TCACTG"};
	public Gson gson = new Gson();
	public static String[] adnHumanAll =  {"ATGC", "AAGT", "GTAT", "AGAG"};
	public static Mutante human = new Mutante(); 
	@BeforeAll
	public static void SetupContext() {
		human.setAdn(adnHumanAll);
	}
	
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
	
//	@Test
//	public void checkHumanAll() {
////		assertFalse(mutanteController.postIsMutant(Human).);
//		assertEquals(false, mutanteController.postIsMutant(human));
//	}	
}
