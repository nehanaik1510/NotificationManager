/**
 * 
 */
package com.target.model;

import java.io.Serializable;



/**
 * @author Neha D Naik
 *
 */
public class Notification implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3023639074385038992L;
	
	private int id;

	public Notification() {
		// TODO Auto-generated constructor stub
	}

	public Notification(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + "]";
	}

}
