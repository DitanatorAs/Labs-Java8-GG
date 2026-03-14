public class ClassMap {
    String[][] desks;

    public ClassMap(int rows, int columns) {
        desks = new String[rows][columns];
    }

    public String setDesk(String name) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < desks.length; i++){
            for(int j = 0; j < desks[i].length; j++){
                if(desks[i][j] == null){
                    desks[i][j] = name;
                    sb.append(i).append("_").append(j);
                    return sb.toString();
                }
            }
        }
        return "свободное место не найдено";
    }

    public String setDesk(String name, int row, int col) {
        StringBuilder sb = new StringBuilder();
        if (desks[row][col] == null) {
            desks[row][col] = name;
            sb.append(row).append("_").append(col);
            return sb.toString();
        }
        return "место занято";
    }

    public String searchDesk(String name) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < desks.length; i++){
            for(int j = 0; j < desks[i].length; j++){
                if(desks[i][j] == name){
                    sb.append(i).append("_").append(j);
                    return sb.toString();
                }
            }
        }
        return "ученик не найден";
    }

    public String[][] getDesks() {
        return desks;
    }
}
