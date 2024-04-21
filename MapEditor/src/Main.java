

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
public class Main {


    public static void main(String[] args) {

        Grid grid = new Grid();
        Rectangle rectangle = new Rectangle(20, 20, 20, 20);
        rectangle.draw();

        Cursor cursor = new Cursor(rectangle);
        cursor.fill();
        new Handler(cursor);

        grid.init();

    }
}