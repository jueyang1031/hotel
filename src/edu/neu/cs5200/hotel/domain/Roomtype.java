package edu.neu.cs5200.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ROOMTYPE database table.
 * 
 */
@Entity
@NamedQuery(name="Roomtype.findAll", query="SELECT r FROM Roomtype r")
public class Roomtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int capacity;

	private String description;

	private float price;

	private String typename;

	//bi-directional many-to-one association to Facility
	@OneToMany(mappedBy="roomtype")
	private List<Facility> facilities;

	//bi-directional many-to-one association to Orderdate
	@OneToMany(mappedBy="roomtype")
	private List<Orderdate> orderdates;

	//bi-directional many-to-one association to Hotel
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="hId")
	private Hotel hotel;

	public Roomtype() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public List<Facility> getFacilities() {
		return this.facilities;
	}

	public void setFacilities(List<Facility> facilities) {
		this.facilities = facilities;
	}

	public Facility addFacility(Facility facility) {
		getFacilities().add(facility);
		facility.setRoomtype(this);

		return facility;
	}

	public Facility removeFacility(Facility facility) {
		getFacilities().remove(facility);
		facility.setRoomtype(null);

		return facility;
	}

	public List<Orderdate> getOrderdates() {
		return this.orderdates;
	}

	public void setOrderdates(List<Orderdate> orderdates) {
		this.orderdates = orderdates;
	}

	public Orderdate addOrderdate(Orderdate orderdate) {
		getOrderdates().add(orderdate);
		orderdate.setRoomtype(this);

		return orderdate;
	}

	public Orderdate removeOrderdate(Orderdate orderdate) {
		getOrderdates().remove(orderdate);
		orderdate.setRoomtype(null);

		return orderdate;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}