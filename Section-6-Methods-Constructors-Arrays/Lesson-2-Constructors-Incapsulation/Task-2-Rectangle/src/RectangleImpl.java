public class RectangleImpl extends Rectangle{
    public RectangleImpl(int width, int height) {
        super(width, height);
    }
    public RectangleImpl() {
        super();
    }
    @Override
    public int getSquare() {
        return width * height;
    }
    @Override
    public String draw() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
