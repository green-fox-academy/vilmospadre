import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {

    public static void mainDraw(Graphics graphics) {
        int side = 10;
        int height = 9;
        int maxHex = 7;
        int startCoor = Math.round(maxHex * height / 2);
        makeHex(side, height, maxHex, startCoor, graphics);
    }

    public static void makeHex(int a, int b, int c, int d, Graphics graphics) {
        int y = 0;
        int x = 0;
        for (int j = 0; j < 4; j++) {


            for (int i = 0; i < 4 + x; i++) {
                int xpoints[] = {0 + y, a / 2 + y, a + a / 2 + y, 2 * a + y, a + a / 2 + y, a / 2 + y};
                int ypoints[] = {d + i * 2 * b, d - b + i * 2 * b, d - b + i * 2 * b, d + i * 2 * b, d + b + i * 2 * b, d + b + i * 2 * b};
                int npoints = 6;
                graphics.drawPolygon(xpoints, ypoints, npoints);
            }
            x += 1;
            d -= b;
            y = y + 20;

        }
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
