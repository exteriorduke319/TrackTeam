import java.util.ArrayList;

public class Athlete extends Person{
    private int gradeLevel;
    private int pointsEarned;
    private ArrayList <String> events = new ArrayList<String>();

    public Athlete(String firstName, String lastName, int gradeLevel, int pointsEarned) {
        super(firstName, lastName);
        setGradeLevel(gradeLevel);
        setPointsEarned(pointsEarned);
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel >= 9 && gradeLevel <= 12) {
            this.gradeLevel = gradeLevel;
        } else {
            this.gradeLevel = 9;
        }
    }

    public void setPointsEarned(int pointsEarned) {
        if (pointsEarned >= 0) {
            this.pointsEarned = pointsEarned;
        } else {
            this.pointsEarned = 0;
        }
    }

    public void addPoints(int points) {
        if (points >= 0) {
            pointsEarned += points;
        }
    }
    public void addEvent(String event) {
        events.add(event);
    }

    public void removeEvent(int indexOfEvent) {
        if(indexOfEvent >= 0 && indexOfEvent < events.size()) {
            events.remove(indexOfEvent);
        }
    }

    public void clearEvents() {
        events.clear();
    }

    // getters
    public int getGradeLevel() {
        return gradeLevel;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public ArrayList <String> getEvents() {
        return events;
    }

    public String toString() {
        return super.toString() + "\nGrade Level: " + getGradeLevel() + "\nPoints Earned: " + getPointsEarned() + "\nEvents: " + getEvents();
    }
}
