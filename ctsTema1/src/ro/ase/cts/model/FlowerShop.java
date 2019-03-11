package ro.ase.cts.model;

import ro.ase.cts.exceptions.FlowerTypeNotSupportedException;
import ro.ase.cts.exceptions.InvalidNoOfFlowersException;
import ro.ase.cts.exceptions.InvalidPriceException;

public class FlowerShop {
	private String shopName;
	private FlowerType flowerType;
	private float pricePerFlower;
	private int noOfFlowers;
	
	public FlowerShop() {
		//this.shopName="Generic";
		//this.flowerType=flowerType.Daisy;
		//this.pricePerFlower = 2.2f;
		//this.noOfFlowers=2;
	}
	
	public FlowerShop(String shopName, FlowerType flower, float price, int noOfFlowers) {
		this.shopName=shopName;
		this.flowerType=flower;
		this.pricePerFlower=price;
		this.noOfFlowers=noOfFlowers;
	}
	
	//getters and setters
public String getShopName() {
	return this.shopName;
}

public void setShopName(String shopName) {
	this.shopName = shopName;
}

public FlowerType getFlowerType() {
	return this.flowerType;
}

public void setFlowerType(FlowerType flower) {
	this.flowerType = flower;
}

public float getPrice() {
	return this.pricePerFlower;
}

public void setPrice(float price) throws Exception {
	if(price<0)
		throw new Exception("Only positive numbers");
	this.pricePerFlower = price;
}

public int getNoOfFlowers() {
	return this.noOfFlowers;
}

public void setNoOfFlowers(int no) throws Exception {
	if(no<0)
		throw new Exception("Only positive numbers");
	this.noOfFlowers=no;
}


public String display() {
	return new String("Flower Shop - Type Flower - "  + " No of flowers: -  " +this.noOfFlowers + " - Price per flower: " +this.pricePerFlower);
	
}

//function that computes the bouquet price for each type of flower
public float computeBouquetPrice() throws FlowerTypeNotSupportedException, InvalidPriceException, InvalidNoOfFlowersException {
	float bouquet = 0;
	if(this.pricePerFlower<0) 
		throw new InvalidPriceException("The price for the flower can't be negative!");
	if(this.noOfFlowers<0)
		throw new InvalidNoOfFlowersException("You must have at least 1 flower in your bouquet");
switch(this.flowerType) {
   case Lily:
	   //bouquet = this.pricePerFlower + 0.5f*noOfFlowers;
	   bouquet = this.pricePerFlower * this.noOfFlowers;
	   break;
   case Dahlia:
	   bouquet = this.pricePerFlower * this.noOfFlowers;
	   break;
   case Rose:
	   bouquet = this.pricePerFlower * this.noOfFlowers;
	   break;
   case Jasmine:
	   bouquet = this.pricePerFlower * this.noOfFlowers;
	   break;
   case Daisy:
	   bouquet = this.pricePerFlower * this.noOfFlowers;
	   break;
   default:
	throw new FlowerTypeNotSupportedException("Please implement the logic for " + this.flowerType.toString());
		}
		return bouquet;
	}
}
