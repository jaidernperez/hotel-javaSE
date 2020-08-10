package co.edu.usta.hotel.utilities;

public class Validate {

    public static boolean isValidMail(String mail) {
        if (mail.isEmpty()) {
            return true;
        }
        return !mail.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
    }

    public static boolean isValidPassword(String password) {
        if (password.isEmpty()) {
            return false;
        }
        int length;
        length = password.length();
        return length >= 4 && length <= 64;
    }

    public static boolean isValidString(String data, int size) {
        if (data.isEmpty()) {
            return true;
        }
        int length;
        length = data.length();
        return length < size;
    }

    public static boolean isValidDouble(String data) {
        if (data.isEmpty()) {
            return false;
        }
        String pattern;
        pattern = "^[0-9]+(.[0-9]+)?$";
        return data.matches(pattern);
    }

    public static boolean isValidNumber(String data) {
        String pattern;
        if (data.isEmpty()) {
            return true;
        }
        pattern = "[0-9]*";
        return !data.matches(pattern);
    }

    public static boolean isValidDate(String data){
        String pattern;
        if (data.isEmpty()) {
            return false;
        }
        pattern = "^\\d{4}([\\-/.])(0?[1-9]|1[1-2])\\1(3[01]|[12][0-9]|0?[1-9])$";
        return data.matches(pattern);
    }
}
