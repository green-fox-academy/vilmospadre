import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hex {
    public static void mainDraw(Graphics graphics) {
        int levels = 15;
        int x = 0;
        int width = 20;
        int offsetY = (int) ((Math.sqrt(3)) * width);
        int offsetX = (int)(1.5*width);

        int yCounterUP = levels-1;
        int yCounterDown = 1;

        for (int i = 1; i <= levels ; i++) {
            int y = 0;
            for (int j = 0; j < levels + i-1; j++) {
                drawHexa(x, y, width, yCounterUP, graphics);
                y += offsetY;
            }
            yCounterUP--;
            x+=offsetX;
        }

        for (int k = levels-1; k >0 ; k--) {
            int y = 0;
            for (int l = levels+k-1; l > 0 ; l--) {
                drawHexa(x, y, width, yCounterDown, graphics);
                y += offsetY;
            }
            yCounterDown++;
            x+=offsetX;
        }
    }

    public static void drawHexa(int x, int y, int a, int yCounter, Graphics graphics) {

        int hexaHeight = (int) ((Math.sqrt(3) / 2) * a);
        int[] basicHexagonX = {0,  a / 2,  (int) (1.5 * a),  2 * a, (int) (1.5 * a),  a / 2};
        int[] basicHexagonY = {hexaHeight, 0, 0, hexaHeight, 2 * hexaHeight, 2 * hexaHeight};

        for (int i = 0; i < basicHexagonY.length; i++) {
            basicHexagonY[i] += y + hexaHeight*yCounter;
        }
        for (int j = 0; j < basicHexagonX.length; j++) {
            basicHexagonX[j] += x;
        }

        int points = basicHexagonX.length;
        graphics.drawPolygon(basicHexagonX, basicHexagonY, points);
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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