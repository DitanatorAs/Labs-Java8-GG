public class While {
    String count(int length, int step) {
        int num = 0;
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        while (counter <= length){
            sb.append(num + " ");
            num = num + step;
            counter++;
        }
        return sb.toString().trim();
    };
}
