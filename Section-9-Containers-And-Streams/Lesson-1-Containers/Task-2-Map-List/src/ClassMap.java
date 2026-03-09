import java.util.Map;

public class ClassMap {
   Map<String, String> desks;

    public ClassMap(int rows, int columns) {
        //TODO инициализация массива desks
    }

    public String setDesk(String name) {
        //TODO требуется реализация
        return "свободное место не найдено";
    }

    public String setDesk(String name, int row, int col) {
        //TODO требуется реализация
        return "место занято";
    }

    public String searchDesk(String name) {
        //TODO требуется реализация
        return "ученик не найден";
    }

    public Map<String, String> getDesks() {
        return desks;
    }
}
