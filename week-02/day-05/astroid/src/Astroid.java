import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Astroid {


    public static void mainDraw(Graphics graphics) {

        // Canvas cnvs = new Canvas();
        // cnvs.setSize(500, 500);
        // cnvs.getBackground(Color.BLACK);

        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);


        for (int i = 0; i < 26; i += 1) {

            graphics.setColor(Color.green);

            graphics.drawLine(WIDTH / 2, 1 + (i * 10), WIDTH / 2 + (i * 10), HEIGHT / 2);

            graphics.drawLine(WIDTH / 2, 1 + (i * 10), WIDTH / 2 - (i * 10), HEIGHT / 2);

            graphics.drawLine(WIDTH / 2, HEIGHT / 2 + (i * 10), 1 + (i * 10), HEIGHT / 2);

            graphics.drawLine(WIDTH / 2, HEIGHT / 2 + (i * 10), WIDTH - (i * 10), HEIGHT / 2);
        }

    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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