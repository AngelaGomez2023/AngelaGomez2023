import javax.swing.JFrame;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        add(new Board());
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.setVisible(true);
    }
}
