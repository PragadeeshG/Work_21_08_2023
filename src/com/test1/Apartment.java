package com.test1;

public class Apartment extends Property {
	private int apartmentId;
	private String name;
	private String builderName;
	private String numberOfUnit;
	private String nearByLandmark;
	private int availableUnits;
	private String unitTypes;

	public Apartment() {

	}

	public Apartment(int apartmentId, String name, String builderName, String numberOfUnit, String nearByLandmark,
			int availableUnits, String unitTypes) {
		super();
		this.apartmentId = apartmentId;
		this.name = name;
		this.builderName = builderName;
		this.numberOfUnit = numberOfUnit;
		this.nearByLandmark = nearByLandmark;
		this.availableUnits = availableUnits;
		this.unitTypes = unitTypes;
	}

	public int getApartmentId() {
		return apartmentId;
	}

	public void setApartmentId(int apartmentId) {
		this.apartmentId = apartmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuilderName() {
		return builderName;
	}

	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}

	public String getNumberOfUnit() {
		return numberOfUnit;
	}

	public void setNumberOfUnit(String numberOfUnit) {
		this.numberOfUnit = numberOfUnit;
	}

	public String getNearByLandmark() {
		return nearByLandmark;
	}

	public void setNearByLandmark(String nearByLandmark) {
		this.nearByLandmark = nearByLandmark;
	}

	public int getAvailableUnits() {
		return availableUnits;
	}

	public void setAvailableUnits(int availableUnits) {
		this.availableUnits = availableUnits;
	}

	public String getUnitTypes() {
		return unitTypes;
	}

	public void setUnitTypes(String unitTypes) {
		this.unitTypes = unitTypes;
	}

}
