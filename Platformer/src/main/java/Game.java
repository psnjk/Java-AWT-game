import java.awt.*;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 1280, HEIGHT = WIDTH / 16*9;
    private Thread thread;

    public Game(){
        new Window(WIDTH,HEIGHT,"New Game",this);
    }

    public synchronized void start(){

    }

    public void run(){

    }

    public static void main(String[] args) {
        new Game();
    }

}
