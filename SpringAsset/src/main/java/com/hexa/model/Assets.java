package com.hexa.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table  
public class Assets  
{  
@Id  
@Column  
private int assetid;  
@Column  
private String assetname;  
@Column  
private String brand;  
@Column  
private String color;
public int getAssetid() {
	return assetid;
}
public void setAssetid(int assetid) {
	this.assetid = assetid;
}
public String getAssetname() {
	return assetname;
}
public void setAssetname(String assetname) {
	this.assetname = assetname;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
} 

}