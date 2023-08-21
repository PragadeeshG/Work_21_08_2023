package com.test1;

public class Individual extends Property {
	private int unitId;
	private String name;
	private String nearByLandmark;
	private String unitType;

	public Individual() {

	}

	public Individual(int unitId, String name, String nearByLandmark, String unitType) {
		super();
		this.unitId = unitId;
		this.name = name;
		this.nearByLandmark = nearByLandmark;
		this.unitType = unitType;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNearByLandmark() {
		return nearByLandmark;
	}

	public void setNearByLandmark(String nearByLandmark) {
		this.nearByLandmark = nearByLandmark;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}
