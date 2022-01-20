package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name="tbl_customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Long age;
	
	private String location;
	
	@CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
	
	
	public String getName() {
        return name;
    }
	
	public Long getAge() {
        return age;
    }
	
	public String getLocation() {
        return location;
    }
	
	public void setName(String name) {
	    this.name = name;
	}
	 
	public void setLocation(String location) {
	    this.location = location;
	}
	 
	public void setAge(Long age) {
	    this.age = age;
	}
}
