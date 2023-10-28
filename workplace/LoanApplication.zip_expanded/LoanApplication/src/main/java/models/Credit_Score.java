package models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Credit_Score {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pan")
	//primary key
	private String pan;
	
	@Column(name="score")
	private int score;
	
	

	//constructor
	public Credit_Score(String pan, int score) {
		super();
		this.pan = pan;
		this.score = score;
	}
	
	//default constructor
	public Credit_Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter for pan
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	//getter and setter for score
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Credit_Score [pan=" + pan + ", score=" + score + "]";
	}

}
