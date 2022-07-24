package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {
	
	@Test
	public void costructorShouldCreateObjectWhenValidData() {
		
		// arrange
		
		// action
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// assert
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	
	@Test
	public void costructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		//arrange
		
		//action
		
		//assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			FinancingFactory.creatNewFinancing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// action
		financing.setTotalAmount(90000.0);
		
		// assert
		Assertions.assertEquals(90000.0, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		//arrange
		
		//action
		
		//assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
			financing.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// action
		financing.setIncome(2100.0);;
		
		// assert
		Assertions.assertEquals(2100.0, financing.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		//arrange
		
		//action
		
		//assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
			financing.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		
		// arrange
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// action
		financing.setMonths(85);
		
		// assert
		Assertions.assertEquals(85, financing.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		//arrange
		
		//action
		
		//assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
			financing.setMonths(75);
		});
	}
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		
		// arrange
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// action
		
		// assert
		Assertions.assertEquals(20000.0, financing.entry());
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		
		// arrange
		Financing financing = FinancingFactory.creatNewFinancing(100000.0, 2000.0, 80);
		
		// action
		
		// assert
		Assertions.assertEquals(1000.0, financing.quota());
	}
}
