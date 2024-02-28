public class Coach extends Person{
    private String expertise;
    private boolean headCoach;

    public Coach(String firstName, String lastName, String expertise, boolean headCoach) {
        super(firstName, lastName);
        setExpertise(expertise);
        this.headCoach = headCoach;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public void setHeadCoach(boolean headCoach) {
        this.headCoach = headCoach;
    }

    public String getExpertise() {
        return expertise;
    }

    public boolean getHeadCoach() {
        return headCoach;
    }

    public String toString() {
        String s = "";
        s += super.toString() + "\nExpertise: " + getExpertise();

        if(getHeadCoach()) {
            s += "\nHead Coach";
        } else {
            s += "\nAssistant Coach";
        }
         return s;
    }
}
