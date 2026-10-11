package com.endeavour.main;

public class Laptop {

	private String brand;
	private String model;
	private String operatingSystem;
	
	public void laptopSpecification() {
		System.out.println("Following are the laptop specification : \n"+brand +"\n"+model+ "\n"+operatingSystem);
	}
	
	public Laptop(String brand, String model, String operatingSystem) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
	}
	
	
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}


	static class Mouse {
		private String mouseBrand;
		
		
		public Mouse(String mouseBrand) {
			super();
			this.mouseBrand = mouseBrand;
			
		}
		public void mouseInfo() {
			System.out.println("displaying mouseBrand :: "+ mouseBrand);
		}
		
		
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", operatingSystem=" + operatingSystem + "]";
	}
	
	
	
}
