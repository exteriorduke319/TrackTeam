import java.util.ArrayList;

public class TrackTeam {
    public static void main(String[] args) {
        ArrayList<Coach> coaches = new ArrayList<Coach>();
        ArrayList<Thrower> throwers = new ArrayList<Thrower>();

        Coach c1 = new Coach("Emory", "George", "Throws", false);
        Coach c2 = new Coach("John", "Jarvis", "Distance", true);

        coaches.add(c1);
        coaches.add(c2);

        System.out.println("Track Coaches: ");

        for (Coach c: coaches) {
            System.out.println(c);
            System.out.println();
        }

        Thrower t1 = new Thrower("Kayden", "Bryner", 9, 0, 0.1, 0);
        Thrower t2 = new Thrower("Jason", "Ocampo", 12, 0, 31, 97);

        throwers.add(t1);
        throwers.add(t2);

        System.out.println("Throws Team: ");

        t1.setShotPR(0.2);
        t2.setDiscusPR(100);

        for (Thrower t: throwers) {
            System.out.println(t);
            System.out.println();
        }

    }
}
