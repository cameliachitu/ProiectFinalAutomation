package staticKeyword;

public class User {

    private static String user = "standard_user";
    private static String password = "secretsauce";


    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        User.user = user;
    }
}