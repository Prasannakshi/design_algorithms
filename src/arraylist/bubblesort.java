import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/**
 * Created by Prasannakshi on 1/4/2017.
 */
public class bubblesort extends Applet implements Runnable{
    Thread mythread;


    public void init() {
        setBackground(Color.BLACK);
        resize(1000,1000);
        mythread = new Thread(this);
        mythread.start();
        repaint();

    }

    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.white);

        int size = 99;
        int max = 300;
        int[] a = new int[size];
        Random generator = new Random();
        generator.nextInt(max);
        for (int i =0; i<size; i++)
        {
            a[i] = generator.nextInt(max);
        }
        g2.setColor(Color.WHITE);
        for (int i = 0; i < a.length; i++) {

            drawLine(i,a[i],g2);
        }
        BubbleSort(a, g2);
    }
    public void run(){

        try{

            while(true){
                repaint();
                Thread.sleep(10);

            }
        }
        catch(Exception e){
        }
    }

    private void drawLine(int position, int value, Graphics2D g2) {
        int buffer = 10+position*5;
        int windowHeight = this.getHeight();
        System.out.println(windowHeight);
        position+=buffer-1;
        int xaxisStart = position;
        int yaxisStart = windowHeight;
        int xaxisEnd = position;
        int yaxisEnd = 	windowHeight-value;


        // System.out.println(xStart+","+ yStart+"  "+xEnd+","+yEnd);
        g2.drawLine(xaxisStart,yaxisStart,xaxisEnd,yaxisEnd);


    }

    public  int[] BubbleSort(int[] input,Graphics2D g2) {
        int num = input.length;
        int j;


        for (int m = num; m >= 0; m--) {
            for (int i = 0; i < num-1; i++) {
                j = i + 1;
                g2.setColor(Color.GREEN);
                drawLine(i, input[i], g2);
                g2.setColor(Color.RED);
                drawLine(j, input[j], g2);

                if (input[i] > input[j]) {
                    swapNumbers(i, j, input);

                    g2.setColor(Color.black);
                    drawLine(i, this.getHeight(), g2);
                    drawLine(j, this.getHeight(), g2);



                }


                g2.setColor(Color.white);
                drawLine(i, input[i], g2);
                drawLine(j, input[j], g2);

            }
        }
        return input;
    }
    private static int[] swapNumbers(int i, int j, int[] a1) {

        int temp;
        temp = a1[i];
        a1[i] = a1[j];
        a1[j] = temp;
        return a1;
    }
}

