package com.mutante.service;

import java.util.HashMap;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.HashBasedTable;
import com.mutante.entity.Mutante;
import com.mutante.entity.MutanteRepositoryImpl;

@Service
public class MutanteService {

	@Autowired
	MutanteRepositoryImpl daoMutanteRepository;
	
	public boolean isMutant(String[] dna) {
		
		boolean flagMutant = false;
		Integer MATCHER = 4;
		HashBasedTable<Integer, Integer, String> adnBasedTable = HashBasedTable.create(); 
		
		for (Integer indexRow = 0; indexRow < dna.length; indexRow++) {
			
			String[] dnaCadena = dna[indexRow].split("");
			boolean flagRow = false;
			
			Integer countRow = 0;
			for(Integer indexColumn = 0; indexColumn < dna.length; indexColumn++) {
				
			adnBasedTable.put(indexRow, indexColumn, dnaCadena[indexColumn]);
				
			}
					for(Integer indexColumn = 0; indexColumn < dna.length; indexColumn++) {
						
						String rowString = adnBasedTable.row(indexRow).values().toString();
						if(rowString.contains(adnBasedTable.get(indexRow, indexColumn))) {
							countRow++;
							if(countRow.equals(4)) {								
								flagRow = true;							
							}else {
								countRow = 0;
							}
						}
//				if(countRow >= MATCHER) {
//					flagRow = true;
//				}
			}
//			
//			String[] dnaColumn = dna[indexRow+1].split("");
//			boolean flagColumn = false;
//				
//				Integer countColum = 0;
//				if(dnaCadena[indexRow].equals(dnaColumn[indexRow])) {
//					countColum++;
//				}
//				
//				if(countColum >= MATCHER) {
//					flagRow = true;
//				}
//				
//				if (flagColumn && flagRow) {
//					
//					flagMutant = true;
//				}
			
		}
		return flagMutant;
	}
	
	public Mutante saveMutante(Mutante mutante) {
		
		return mutante;
	}
}
