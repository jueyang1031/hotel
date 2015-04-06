package edu.neu.cs5200.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SURROUNDING database table.
 * 
 */
@Entity
@NamedQuery(name="Surrounding.findAll", query="SELECT s FROM Surrounding s")
public class Surrounding implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private float distance;

	private String surroundingname;

	private String type;

	//bi-directional many-to-one association to Hotel
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hId")
	private Hotel hotel;

	public Surrounding() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDistance() {
		return this.distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public String getSurroundingname() {
		return this.surroundingname;
	}

	public void setSurroundingname(String surroundingname) {
		this.surroundingname = surroundingname;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}