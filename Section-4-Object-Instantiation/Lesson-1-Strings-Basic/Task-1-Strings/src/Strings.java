public class Strings {
    String sumOfNmbers(String add1, String add2){
        return String.valueOf(Long.valueOf(add1) + Long.valueOf(add2));
    }

    String initials(String name, String secondName) {
        return String.valueOf(name.charAt(0)) + String.valueOf(secondName.charAt(0));
    }

    boolean equity(String a, String b){
        return a.equalsIgnoreCase(b);
    }
}
