import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleFactoryImplTest {

    @Test
    public void getRectangle() {
        RectangleFactory factory = new RectangleFactoryImpl();
        Rectangle r = factory.getRectangle();
        assertEquals(25, r.getWidth());
        assertEquals(10, r.getHeight());
        assertEquals(250, r.getSquare());
        assertEquals(
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n", r.draw()
        );
    }

    @Test
    public void getRectangle1() {
        RectangleFactory factory = new RectangleFactoryImpl();
        Rectangle r = factory.getRectangle(25, 10);
        assertEquals(25, r.getWidth());
        assertEquals(10, r.getHeight());
        assertEquals(250, r.getSquare());
        assertEquals(
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n" +
                "*************************\n", r.draw()
        );
    }

    @Test
    public void getRectangle2() {
        RectangleFactoryImpl factory = new RectangleFactoryImpl();
        Rectangle r = factory.getRectangle(5, 3);
        assertEquals(5, r.getWidth());
        assertEquals(3, r.getHeight());
        assertEquals(15, r.getSquare());
        assertEquals(
                "*****\n" +
                "*****\n" +
                "*****\n"
                , r.draw()
        );
    }
}