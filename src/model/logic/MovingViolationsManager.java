package model.logic;

import com.sun.tools.javac.util.List;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Time;
import java.time.Clock;

import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;


public class MovingViolationsManager implements IMovingViolationsManager {

	
	ILinkedList<VOMovingViolations> listaViolaciones;
	
	
	public void loadMovingViolations(String movingViolationsFile){
//		listaViolaciones= new CsvToBeanBuilder(new FileReader(movingViolationsFile)).withType(VOMovingViolations.class).build().parse();
		System.out.println("ejecuto");
		try {
					System.out.println("empexando"+System.currentTimeMillis());
					List<VOMovingViolations> beans = (List<VOMovingViolations>) new CsvToBeanBuilder(new FileReader(new File ("data/Moving_Violations_Issued_in_January_2018.csv"))).withType(VOMovingViolations.class).build().parse();
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedList <VOMovingViolations> getMovingViolationsByAccident(String accidentIndicator) {
		// TODO Auto-generated method stub
		return null;
	}	


}
