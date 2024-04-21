
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Color;
public class Cursor {

    private Rectangle cursor;

    public Cursor(Rectangle cursor) {
        this.cursor = cursor;


    }

    public void fill() {
        cursor.fill();
    }

    public void moveRight() {
        if (cursor.getX() <= (Grid.canvas.getWidth() - 20)) {

            cursor.translate(20, 0);


        }
        if (cursor.getX() >= (Grid.canvas.getWidth() - 20)) {

            cursor.translate(0, 0);
        }


    }

    public void moveLeft() {
        if (cursor.getX() <= 40) {

            cursor.translate(0, 0);


        }
        if (cursor.getX() >= 40) {

            cursor.translate(-20, 0);
        }
    }

    public void moveUp() {
        if (cursor.getY() <= 40) {

            cursor.translate(0, 0);


        }
        if (cursor.getY() >= 40) {

            cursor.translate(0, -20);
        }

    }

    public void moveDown() {
        if (cursor.getY() <= (Grid.canvas.getHeight() - 20)) {

            cursor.translate(0, 20);


        }
        if (cursor.getY() >= (Grid.canvas.getHeight() - 20)) {

            cursor.translate(0, 0);
        }


    }

    public void paintRed() {


        Rectangle rectangle = new Rectangle(cursor.getX(), cursor.getY(), cursor.getWidth(), cursor.getHeight());
        rectangle.setColor(Color.RED);
        rectangle.draw();
        rectangle.fill();


    }


    public void paintBlue() {

        Rectangle rectangle = new Rectangle(cursor.getX(), cursor.getY(), cursor.getWidth(), cursor.getHeight());
        rectangle.setColor(new Color(0, 0, 250));
        rectangle.draw();
        rectangle.fill();


    }



    public void delete() {

    }


}

