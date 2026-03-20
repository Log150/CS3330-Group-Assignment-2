package edu.cs3330.campusquest;

import java.util.Objects;

public class Student {
	private String name;
	private int points;
	
	public Student(String name, int points) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		
		if (points < 0) {
			throw new IllegalArgumentException("Points cannot be negative.");
		}
		
		this.name = name;
		this.points = points;
	}
	
	public void addPoints(int amount) {
		if (amount <= 0) {
			throw new IllegalStateException("Amount cannot be negative.");
		}
		
		
		this.points = this.points + amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", points=" + points + "]";
	}
	
	
}
