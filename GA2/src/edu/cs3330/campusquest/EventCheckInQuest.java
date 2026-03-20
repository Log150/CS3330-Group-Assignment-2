package edu.cs3330.campusquest;

public abstract class EventCheckInQuest extends AbstractQuest{
	protected String eventName;
	
	
	public EventCheckInQuest(int id, String title, int basePoints, String eventName) {
		super(id, title, basePoints);
		
		if (eventName == null || eventName.isEmpty()) {
			throw new IllegalArgumentException("Event Name cannot be empty.");
		}
		
		this.eventName = eventName;
	}
	
	
	public String getEventName() {
		return eventName;
	}
	
	
	@Override
	public int completeFor(Student s) {
		
		if (completed) {
			throw new IllegalStateException("Task already completed.");
		}
		
		completed = true;
		s.addPoints(basePoints);
		
		return basePoints;
	}
	
	@Override
	public String toString() {
		return super.toString() + " EventCheckInQuest [event name=" + eventName + "]";
	}

	
}
