package com.test1;

public class Property {
	private int propertyId;
	private String propertyType;
	private String area;
	private int areacode;

	public Property() {

	}

	public Property(int propertyId, String propertyType, String area, int areacode) {
		super();
		this.propertyId = propertyId;
		this.propertyType = propertyType;
		this.area = area;
		this.areacode = areacode;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAreacode() {
		return areacode;
	}

	public void setAreacode(int areacode) {
		this.areacode = areacode;
	}

}
