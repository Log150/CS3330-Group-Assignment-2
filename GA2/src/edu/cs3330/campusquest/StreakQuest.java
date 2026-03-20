package edu.cs3330.campusquest;

public abstract class StreakQuest extends AbstractQuest{
	protected int days;
	
	
	public StreakQuest(int id, String title, int basePoints, int days) {
		super(id, title, basePoints);
		
		if (id <= 0) {
			throw new IllegalArgumentException("Days cannot be negative.");
		}
		
		this.days = days;
	}
	
	
	public int getDays() {
		return days;
	}
	
	
	@Override
	public int completeFor(Student s) {
		int awardedPoints = basePoints + (days * 2);
		// linear bonus approach chosen
		
		if (completed) {
			throw new IllegalStateException("Task already completed.");
		}
		
		completed = true;
		s.addPoints(awardedPoints);
		
		return awardedPoints;
	}
	
	@Override
	public String toString() {
		return super.toString() + " StreakQuest [Days=" + days + "]";
	}
}
