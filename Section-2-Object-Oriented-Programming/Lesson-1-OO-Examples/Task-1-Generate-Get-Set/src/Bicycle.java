public class Bicycle {
    private int cadence = 0; // состояние – текущий шаг педалей
    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }
    private int speed = 0; // состояние – текущая скорость движения
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int gear = 1; // состояние – текущая передача
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
    
}
