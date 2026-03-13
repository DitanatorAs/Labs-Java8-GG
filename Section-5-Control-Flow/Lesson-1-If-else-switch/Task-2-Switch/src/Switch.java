public class Switch {
    public String dayOfWeek(int day) {
        switch (day){
            case (1):
                return "Понедельник";
            case (2):
                return "Вторник";
            case (3):
                return "Среда";
            case (4):
                return "Четверг";
            case (5):
                return "Пятница";
            case (6):
                return "Суббота";
            case (7):
                return "Воскресенье";
            default:
                return "Ошибка данных";
        }
    }

    public int numOfPlanet(String planet) {
        switch (planet){
            case ("Меркурий"):
                return 1;
            case ("Венера"):
                return 2;
            case ("Земля"):
                return 3;
            case ("Марс"):
                return 4;
            case ("Юпитер"):
                return 5;
            case ("Сатурн"):
                return 6;
            case ("Уран"):
                return 7;
            case ("Нептун"):
                return 8;
            default:
                return -1;
        }
    }
}
