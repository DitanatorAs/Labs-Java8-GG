public class VacationScale {
    private int vacationDays[] = {10, 15, 15, 15, 20, 20, 25};

    public int getVacationDays(int years) {
        if (years >= vacationDays.length) {
            return vacationDays[vacationDays.length - 1];
        } else if (years < 0) {
            return vacationDays[0];
        } else {
            return vacationDays[years];
        }
    }
}