import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {

    public Window(int width, int height, String title, Game game){
        JFrame fr = new JFrame(title);

        fr.setPreferredSize(new Dimension(width,height));
        fr.setMaximumSize(new Dimension(width,height));
        fr.setMinimumSize(new Dimension(width,height));

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setLocationRelativeTo(null);
        fr.add(game);
        fr.setVisible(true);
        game.start();

    }

}
