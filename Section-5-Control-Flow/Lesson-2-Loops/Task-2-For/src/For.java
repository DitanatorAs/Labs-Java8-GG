public class For {
    String count(int length, int step) {
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= length; i++ ){
            sb.append(num + " ");
            num = num + step;
        }
        return sb.toString().trim();
    };
}
