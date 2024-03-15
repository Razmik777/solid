package homework;

public class UserHelper {
    public static void save(User user) {
        Persister persister = new Persister(user);
        persister.save();
    }

    public static void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
