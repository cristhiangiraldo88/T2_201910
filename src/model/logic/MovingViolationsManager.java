package model.logic;

import com.sun.tools.javac.util.List;

import api.IMovingViolationsManager;
import model.vo.VOMovingViolations;
import model.data_structures.ILinkedList;
import model.data_structures.LinkedList;
import com.sun.*;


public class MovingViolationsManager implements IMovingViolationsManager {

	
	ILinkedList<VOMovingViolations> listaViolaciones;
	
	
	public void loadMovingViolations(String movingViolationsFile){
		List<VOMovingViolations> result = new CsvToBeanBuilder(FileReader(movingViolationsFile)).withType(VOMovingViolations.class).build().parse();
		//		List<VOMovingViolations> beans = new CsvToBeanBuilder(FileReader("yourfile.csv")).withType(Visitors.class).build().parse();
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
