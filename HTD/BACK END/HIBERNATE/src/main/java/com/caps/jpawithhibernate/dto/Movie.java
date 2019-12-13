package com.caps.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@Column(name="movie_id")
private int mid;
	@Column(name="movie_name")
private String mname;
	@Column(name="rating")
private String ratings;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getRatings() {
	return ratings;
}
public void setRatings(String ratings) {
	this.ratings = ratings;
}

}
