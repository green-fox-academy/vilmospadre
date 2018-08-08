import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        int v = 80;
        graphics.setColor(Color.GREEN);
        graphics.drawLine(v, v, v * 2, v);
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(v, v, v, v * 2);
        graphics.setColor(Color.CYAN);
        graphics.drawLine(v, v * 2, v * 2, v * 2);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(v * 2, v, v * 2, v * 2);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}