import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
public class Handler implements KeyboardHandler {
    private Cursor cursor;

    private Keyboard keyboard;

    public Handler(Cursor cursor) {
        this.cursor = cursor;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }


    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKey(KeyboardEvent.KEY_D);
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventRight);
        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKey(KeyboardEvent.KEY_A);
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventLeft);
        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKey(KeyboardEvent.KEY_S);
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventDown);
        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKey(KeyboardEvent.KEY_W);
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventUp);
        KeyboardEvent keyboardEventPaintRed = new KeyboardEvent();
        keyboardEventPaintRed.setKey(KeyboardEvent.KEY_R);
        keyboardEventPaintRed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPaintRed);
        KeyboardEvent keyboardEventPaintBlue = new KeyboardEvent();
        keyboardEventPaintBlue.setKey(KeyboardEvent.KEY_B);
        keyboardEventPaintBlue.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPaintBlue);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_D:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_A:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_S:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_W:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_R:
                cursor.paintRed();
                break;
            case KeyboardEvent.KEY_B:
                cursor.paintBlue();
                break;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}

