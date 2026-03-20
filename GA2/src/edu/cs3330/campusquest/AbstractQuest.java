package edu.cs3330.campusquest;

public abstract class AbstractQuest implements Quest{
	protected int id;
	protected String title;
	protected int basePoints;
	protected boolean completed;
	
	
	public AbstractQuest(int id, String title, int basePoints) {
		if (id <= 0) {
			throw new IllegalArgumentException("Id cannot be negative.");
		}
		
		if (title == null || title.isEmpty()) {
			throw new IllegalArgumentException("Title cannot be empty.");
		}
		
		if (basePoints <= 0) {
			throw new IllegalArgumentException("Points cannot be negative.");
		}
		
		this.id = id;
		this.title = title;
		this.basePoints = basePoints;
		this.completed = false;
	}
	
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public String getTitle() {
		return title;
	}
	
	@Override
	public int getBasePoints() {
		return basePoints;
	}
	
	@Override
	public boolean isCompleted() {
		return completed;
	}
	
	@Override
	public String toString() {
		return "AbstractQuest [id=" + id + ", title=" + title + ", basePoints=" + basePoints + ", completed="
				+ completed + "]";
	}

}