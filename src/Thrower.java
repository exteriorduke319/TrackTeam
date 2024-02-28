public class Thrower extends Athlete{
    public double shotPR;
    public double discusPR;

    public Thrower(String firstName, String lastName, int gradeLevel, int pointsEarned, double shotPR, double discusPR) {
        super(firstName, lastName, gradeLevel, pointsEarned);
        addEvent("Shot Put");
        addEvent("Discus");
        setShotPR(shotPR);
        setDiscusPR(discusPR);
    }

    public void setShotPR(double shotPR) {
        if (shotPR >= 0 && shotPR <= 80) {
            this.shotPR = shotPR;
        } else {
            this.shotPR = 0;
        }
    }

    public void setDiscusPR(double discusPR) {
        if (discusPR >= 0 && discusPR <= 230) {
            this.discusPR = discusPR;
        } else {
            this.discusPR = 0;
        }
    }

    public double getDiscusPR() {
        return discusPR;
    }

    public double getShotPR() {
        return shotPR;
    }

    public String toString() {
        return super.toString() + "\nShot PR: " + getShotPR() + "ft \nDiscus PR: " + discusPR + "ft";
    }
}
