public class Person {
    private final int years;

    public Person(int years) {
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public long getDays() {
      return years * 365;
    };

    public long getHours() {
        return years * 365 * 24;
    }

    public long getMinutes() {
        return years * 365 * 24 * 60;
    }

    public long getSeconds() {
        return years * 365 * 24 * 60 * 60;
    }

    public long getMilliSeconds() {
        return years * 365 * 24 * 60 * 60 * 1000;
    }

}
