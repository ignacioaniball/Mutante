package com.mutante.service;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

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

			for (Integer indexColumn = 0; indexColumn < dna.length; indexColumn++) {

				adnBasedTable.put(indexRow, indexColumn, dnaCadena[indexColumn]);
			}			
		}
		
		return validateAdn(dna, flagMutant, MATCHER, adnBasedTable);
	}

	private boolean validateAdn(String[] dna, boolean flagMutant, Integer MATCHER,
			HashBasedTable<Integer, Integer, String> adnBasedTable) {
		Integer countColumn = 0;
		boolean flagColumn = false;
		boolean flagRow = false;
		Integer countRow = 0;
		boolean flagDiagonal = false;
		Integer countDiagonal = 0;
		for (Integer indexRow = 0; indexRow < dna.length; indexRow++) {
			for (Integer indexColumn = 0; indexColumn < dna.length; indexColumn++) {				
				if (dna[indexRow].contains(adnBasedTable.get(indexRow, indexColumn).repeat(MATCHER))) {
					flagRow = true;
				}
				
				for (int indexCell = 0; indexCell < adnBasedTable.column(indexColumn).size(); indexCell++) {

					if (adnBasedTable.get(indexColumn, indexRow).contains(adnBasedTable.get(indexColumn, indexCell))) {
						countColumn++;
						if (countColumn.equals(4)) {
							flagColumn = true;
						}
					} else {
						countColumn = 0;
					}
					
					if (adnBasedTable.get(indexRow, indexRow).contains(adnBasedTable.get(indexCell, indexCell))) {
						countColumn++;
						if (countColumn.equals(4)) {
							flagDiagonal = true;
						}
					} else {
						countDiagonal = 0;
					}
				}
			}
		}
		
		if (flagColumn && flagRow || flagColumn && flagDiagonal || flagDiagonal && flagRow) flagMutant = true;
		
		return flagMutant;
	}

	public Mutante saveMutante(Mutante mutante) {

		return mutante;
	}
}
