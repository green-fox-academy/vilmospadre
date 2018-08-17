import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class main extends JComponent {

    private static int MAX_DEPTH = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 500;
        int y0 = 500;
        int width = 400;

        Graphics2D graphics = (Graphics2D) g;

        int strokeWidth = 30;

        drawSquare(graphics, x0, y0, width, 0, strokeWidth);

    }

    private void drawSquare(Graphics2D g, int x0, int y0, int width, int depth, float strokeWidth) {
        if (depth > MAX_DEPTH) {
            return;
        }

        g.setStroke(new BasicStroke(strokeWidth));

        g.drawRect(x0 - width / 2, y0 - width / 2, width, width);

        g.drawRect(x0 - width / 2, y0 - width / 2, width / 2, depth + 1);
        g.drawRect(x0 + width / 2, y0 - width / 2, width / 2, depth + 1);
        g.drawRect(x0 - width / 2, y0 + width / 2, width / 2, depth + 1);
        g.drawRect(x0 + width / 2, y0 + width / 2, width / 2, depth + 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        main main = new main();
        main.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(main);

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MAX_DEPTH++;
                main.repaint();
            }
        });

        timer.start();

        frame.pack();
        frame.setVisible(true);
    }
}