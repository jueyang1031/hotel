package edu.neu.cs5200.hotel.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ORDERDATE database table.
 * 
 */
@Entity
@NamedQuery(name="Orderdate.findAll", query="SELECT o FROM Orderdate o")
public class Orderdate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date orderdate;

	//bi-directional many-to-one association to Roomtype
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rId")
	private Roomtype roomtype;

	public Orderdate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Roomtype getRoomtype() {
		return this.roomtype;
	}

	public void setRoomtype(Roomtype roomtype) {
		this.roomtype = roomtype;
	}

}