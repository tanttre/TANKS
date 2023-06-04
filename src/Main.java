import javax.swing.*;
import java.awt.*;

public class Main extends JPanel
{
    // 1 - UP, 2 - DOWN, 3 - LEFT, 4 - RIGHT
    int direction = 1;
    int x = 256;
    int y = 256;
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("TANKS! 1 DAY");
        frame.setMinimumSize(new Dimension(576,576));
        frame.getContentPane().add(new Main());
        frame.setLocation(0,0);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y,64,64);

        g.setColor(Color.GREEN);
        if (direction == 1)
        {
            g.fillRect(x, y, 64,64);
        }
        else if (direction == 2)
        {
            g.fillRect(x, y, 64,64);
        }
        else if (direction == 3)
        {
            g.fillRect(x, y, 64,64);
        }
        else if (direction == 4)
        {
            g.fillRect(x, y, 64,64);
        }
    }
}
