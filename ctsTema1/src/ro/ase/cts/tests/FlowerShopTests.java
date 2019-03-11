package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.exceptions.FlowerTypeNotSupportedException;
import ro.ase.cts.exceptions.InvalidNoOfFlowersException;
import ro.ase.cts.exceptions.InvalidPriceException;
import ro.ase.cts.model.FlowerShop;
import ro.ase.cts.model.FlowerType;

public class FlowerShopTests {

	@Test
	public void testPriceForLily() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Lily,5,5);
			try {
				assertEquals(25f, fp.computeBouquetPrice(), 0.001);
			} catch (FlowerTypeNotSupportedException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			} catch (InvalidNoOfFlowersException e) {
				e.printStackTrace();
			}
	}
	
	@Test
	public void testPriceForRose() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Rose,20,6);
			try {
				assertEquals(120f, fp.computeBouquetPrice(), 0.001);
			} catch (FlowerTypeNotSupportedException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			} catch (InvalidNoOfFlowersException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test
	public void testPriceForJasmine() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Jasmine,25,4);
			try {
				assertEquals(100f, fp.computeBouquetPrice(), 0.001);
			} catch (FlowerTypeNotSupportedException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			} catch (InvalidNoOfFlowersException e) {
				e.printStackTrace();
			}
	}
	
	
	@Test
	public void testPriceForDaisy() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Daisy,15,2);
			try {
				assertEquals(30f, fp.computeBouquetPrice(), 0.001);
			} catch (FlowerTypeNotSupportedException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			} catch (InvalidNoOfFlowersException e) {
				e.printStackTrace();
			}
	}
		
	
	
	@Test
	public void testPriceForDahlia() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Dahlia,10,3);
			try {
				assertEquals(30f, fp.computeBouquetPrice(), 0.001);
			} catch (FlowerTypeNotSupportedException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPriceException e) {
				System.out.println(e.getMessage());
			} catch (InvalidNoOfFlowersException e) {
				e.printStackTrace();
			}
	}

	
	
	@Test
	public void testPriceForLiliac() {
		FlowerShop fp = new FlowerShop("Teilor", FlowerType.Liliac,100,5);
		try {
			fp.computeBouquetPrice();
			fail("The method should not work with the specified title");
		} catch(FlowerTypeNotSupportedException ex) {
			System.out.println(ex.getMessage());
		} catch(InvalidPriceException ex) {
			System.out.println(ex.getMessage());
		} catch (InvalidNoOfFlowersException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testNegativePrice() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Rose,-10,4);
		try {
			fp.computeBouquetPrice();
			fail("The method should not support negative values for the price!");
		} catch (FlowerTypeNotSupportedException | InvalidPriceException | InvalidNoOfFlowersException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	@Test
	public void testNegativeFlowerNo() {
		FlowerShop fp = new FlowerShop("Teilor",FlowerType.Jasmine,10,-5);
		try {
			fp.computeBouquetPrice();
			fail("The method should not support negative values for the number of flowers!");
		} catch (FlowerTypeNotSupportedException | InvalidPriceException | InvalidNoOfFlowersException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testSetterForNoOfFlowers() throws Exception {
		FlowerShop fp = new FlowerShop();
		System.out.println("Test display => " + fp.display());
		
		try {
			fp.setNoOfFlowers(-2);
			fail("setNoOfFlowers accepts negative values - it MUST NOT");
		} catch (Exception ert) {

		}
	}
	
	@Test
	public void testSetterForPrice() throws Exception {
		FlowerShop fp = new FlowerShop();
		System.out.println("Test display => " + fp.display());
		
		try {
			fp.setPrice(-10);
			fail("setPrice accepts negative values - it MUST NOT");
		} catch (Exception ert) {

		}
	}
	
}
