import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Game Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340,370);
        setLocationRelativeTo(null);
        add(new GameField());
        setVisible(true);
        setResizable(false);
        setIconImage(getImage());
    }

    private Image getImage(){
        ImageIcon icon = new ImageIcon("snake.png");
        return icon.getImage();
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
