package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;

private String item;
private Integer amount;
@JsonFormat(pattern = "yyyy-MM-dd")
private Date date = new Date();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public User(int id, String item, Integer amount, Date date) {
	super();
	this.id = id;
	this.item = item;
	this.amount = amount;
	this.date = date;
}
public User() {}
@Override
public String toString() {
	return "User [id=" + id + ", item=" + item + ", amount=" + amount + ", date=" + date + "]";
}

}