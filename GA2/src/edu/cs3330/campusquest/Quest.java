package edu.cs3330.campusquest;

//public class Quest {
//
//}

interface Quest {
	int getId();
	String getTitle();
	int getBasePoints();
	boolean isCompleted();
	int completeFor(Student s);
}