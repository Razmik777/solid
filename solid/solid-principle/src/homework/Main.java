package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserHelper.save(user);
        UserHelper.report(user);
    }
}