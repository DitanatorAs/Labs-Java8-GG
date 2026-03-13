public class RectangleFactoryImpl extends RectangleFactory{
    @Override
    public Rectangle getRectangle() {
        return new RectangleImpl();
    }

    @Override
    public Rectangle getRectangle(int width, int height) {
        return new RectangleImpl(width, height);
    }
}
