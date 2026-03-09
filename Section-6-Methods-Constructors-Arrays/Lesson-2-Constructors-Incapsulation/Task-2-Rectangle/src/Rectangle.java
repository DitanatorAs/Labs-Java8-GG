public abstract class Rectangle {
    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(25, 10);
    }

    public abstract int getSquare();
    public abstract String draw();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
