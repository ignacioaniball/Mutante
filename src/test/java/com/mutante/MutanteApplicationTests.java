package com.mutante;

import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.mutante.entity.Mutante;

import io.restassured.RestAssured;

@SpringBootTest
class MutanteApplicationTests {
//	private static String baseUri = "http://localhost:8081/v1/";
//
//	public String[] adnHuman = {"ATGCGA", "CAGTGC", "TTGTGT", "AGATGG", "CCATTA", "TCACTG"};
//	public String[] adnMutante = {"AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA", "AAAAAA"};
//	public String[] onlyOneRow = {"AAAAAA", "CAGTGC", "TTGTGT", "AGAAGG", "CCATCA", "TCACTG"};
//	public String[] onlyOneColumn = {"ATGCGA", "AAGTGC", "ATGTGT", "AGAAGG", "CCATCA", "TCACTG"};
//	
//	@Test
//	public void whenRequestingMutantServiceWithMutantADN() {
//		
//		 String mutant = RestAssured
//				.given()
//					.baseUri(baseUri)
//					.and()
//					.queryParam("format", "json")
//					.log().all()
//					.body(adnMutante)
//				.when()
//					.post("/mutant")
//				.then()
//					.log().all()
//	                .and().assertThat().statusCode(is(equals(200)))
//	                .and().extract().body().asString();
//	}

}
