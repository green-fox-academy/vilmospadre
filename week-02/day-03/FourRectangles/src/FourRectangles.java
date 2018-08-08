import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics) {


        Random rnd = new Random();

            for (int i = 0; i < 4; i++){

            int a = rnd.nextInt(300);
            int b = rnd.nextInt(310);
            int c = rnd.nextInt(320);
            int d = rnd.nextInt(330);

            drawRectangle(graphics,a,b,c,d);
        }
    }

            public static void drawRectangle(Graphics graphics, int a, int b, int c, int d){

           Color color = new Color(a,b,c,d);
           graphics.setColor(Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE);

            graphics.drawRect(a, b, c, d);

        }



        //Color color = new Color(forR, forG, forB);
        //graphics.setColor(color);


    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
