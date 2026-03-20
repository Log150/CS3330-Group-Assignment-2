package edu.cs3330.campusquest;

public abstract class VolunteerQuest extends AbstractQuest{
	protected int hours;
	
	
	public VolunteerQuest(int id, String title, int basePoints, int hours) {
		super(id, title, basePoints);
		
		if (id <= 0) {
			throw new IllegalArgumentException("Hours cannot be negative.");
		}
		
		this.hours = hours;
	}
	
	
	public int getHours() {
		return hours;
	}
	
	
	@Override
	public int completeFor(Student s) {
		int awardedPoints = basePoints * hours;
		
		
		if (completed) {
			throw new IllegalStateException("Task already completed.");
		}
		
		completed = true;
		s.addPoints(awardedPoints);
		
		return awardedPoints;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", hours=" + hours;
	}
}
