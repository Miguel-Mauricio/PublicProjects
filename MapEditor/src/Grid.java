
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Grid  {


    public static Rectangle canvas = new Rectangle(20, 20, 500, 500);

    public Grid() {

    }

    public static int getWidth() {
        return canvas.getWidth();
    }

    public static int getHeight() {
        return canvas.getHeight();
    }

    public static int getX() {
        return canvas.getX();
    }

    public static int getY() {
        return canvas.getY();
    }

    public void init() {

        canvas.draw();


        for (int i = 20; i <= canvas.getWidth(); i += (canvas.getWidth() / 25)) {


            for (int j = 20; j <= canvas.getHeight(); j += (canvas.getHeight() / 25)) {
                Rectangle rectangle1 = new Rectangle(20, 20, i, j);
                rectangle1.draw();


            }


        }
    }


}
