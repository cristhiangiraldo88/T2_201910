package model.logic;


import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import model.data_structures.Node;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.time.Clock;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;




public class MovingViolationsManager implements IMovingViolationsManager {

	
	ILinkedList<VOMovingViolations> listaViolaciones;
	
	
	public void loadMovingViolations(String movingViolationsFile){
//		listaViolaciones= new CsvToBeanBuilder(new FileReader(movingViolationsFile)).withType(VOMovingViolations.class).build().parse();
		System.out.println("ejecuto");
		try {
					listaViolaciones= new LinkedList<>();
					CSVReader reader = new CSVReader (new FileReader (movingViolationsFile));
					String [] nextLine;
					try {
						reader.readNext();
						while ((nextLine = reader.readNext()) != null) {
							

							VOMovingViolations mV =new VOMovingViolations(nextLine[0],nextLine[1],nextLine[2],nextLine[3],nextLine[4],nextLine[5],nextLine[6]
													,nextLine[7],nextLine[8],nextLine[9],nextLine[10],nextLine[11],nextLine[12],nextLine[13]
													,nextLine[14],nextLine[15],nextLine[16]);
							listaViolaciones.add(mV);
							System.out.println("mapeando");
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
						
					System.out.println("done biach"+System.currentTimeMillis());
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

		
	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByViolationCode (String violationCode) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getViolationCode().
						equals(violationCode)) {
					resp.add(listaViolaciones.get(i));
				}
			}
		}
		return resp;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		LinkedList<VOMovingViolations> resp = new LinkedList<>();
		for(int i =0; i <listaViolaciones.getCounter();i++) {
			if(listaViolaciones.get(i)
					!=null) {
				if(listaViolaciones.get(i)
						.getAccidentId().
						equals(accidentIndicator)) {
					resp.add(listaViolaciones.get(i));
				}
			}
		
		}
		return resp;
	}	


}
