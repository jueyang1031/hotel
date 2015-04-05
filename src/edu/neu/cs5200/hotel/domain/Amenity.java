package edu.neu.cs5200.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AMENITY database table.
 * 
 */
@Entity
@NamedQuery(name="Amenity.findAll", query="SELECT a FROM Amenity a")
public class Amenity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String amenityname;

	private String description;

	private int ifcharge;

	private String opentime;

	//bi-directional many-to-one association to Hotel
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hotelId")
	private Hotel hotel;

	public Amenity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmenityname() {
		return this.amenityname;
	}

	public void setAmenityname(String amenityname) {
		this.amenityname = amenityname;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIfcharge() {
		return this.ifcharge;
	}

	public void setIfcharge(int ifcharge) {
		this.ifcharge = ifcharge;
	}

	public String getOpentime() {
		return this.opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}