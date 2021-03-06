// 2-D graphing program. Written by Ian Waldschmidt for EECS 233.
// See main method for examples of using "graph" and "display" methods.
// Notes: (1) "graph" must be called for all data before "display".
//        (2) import java.awt.* to use the Color class in other programs.

import java.util.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
import java.text.*; // For DecimalFormat

public class Grapher extends JPanel {
    JFrame f = new JFrame();
    private ArrayList<int[]> xdatas = new ArrayList<int[]>();
    private ArrayList<int[]> ydatas = new ArrayList<int[]>();
    private ArrayList<Color> colors = new ArrayList<Color>();

    final int PAD = 30;

    public void graph(int[] xdata, int[] ydata, Color color){
        if(xdata.length != ydata.length){
            System.out.println("Input arrays must be the same length");
            return;
        }

        this.xdatas.add(xdata);
        this.ydatas.add(ydata);
        this.colors.add(color);
    }

    public void display(){
        f.add(this);
        f.setSize(400,400);
        f.setLocation(200,200);
        f.setVisible(true);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        //Draw ordinate
        g2.draw(new Line2D.Double(PAD, PAD, PAD, h-PAD));
        //Draw abcissa
        g2.draw(new Line2D.Double(PAD, h-PAD, w-PAD, h-PAD));
        //Draw labels
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();
        //Write x axis values
        double[] xaxis = new double[5];
        xaxis[0] = 0;
        xaxis[4] = getMax(xdatas);
        xaxis[1] = xaxis[4] / 4;
        xaxis[2] = xaxis[4] / 2;
        xaxis[3] = xaxis[1] * 3;
        int xcoord = PAD - 4;
        int ycoord = h - (PAD/4);
        for(int i = 0; i < 5; i++){
   DecimalFormat form = new DecimalFormat("0.#");
            String value = form.format(xaxis[i]) + "";
            g2.drawString(value, xcoord, ycoord);
            xcoord += (w - 2*PAD)/5 + font.getStringBounds(value, frc).getWidth();
        }
        //Write y axis values
        double[] yaxis = new double[5];
        yaxis[0] = 0;
        yaxis[4] = getMax(ydatas);
        yaxis[1] = yaxis[4] / 4;
        yaxis[2] = yaxis[4] / 2;
        yaxis[3] = yaxis[1] * 3;
        xcoord = PAD/4;
        ycoord = h - PAD + 4;
        for(int i = 0; i < 5; i++){
   DecimalFormat form = new DecimalFormat("0.#");
            String value = form.format(yaxis[i]) + "";
            g2.drawString(value, xcoord, ycoord);
            ycoord -= (h - 2*PAD)/5 + font.getStringBounds(value, frc).getHeight();
        }
        //Draw data
        double xScale = (double)(w - 2*PAD)/getMax(xdatas);
        double yScale = (double)(h - 2*PAD)/getMax(ydatas);
        for(int j = 0; j < xdatas.size(); j++){
            int[] xdata = this.xdatas.get(j);
            int[] ydata = this.ydatas.get(j);
            Color color = this.colors.get(j);
            //Draw lines for each data set
            g2.setPaint(color);
            for(int i = 0; i < xdata.length-1; i++) {
                double x1 = PAD + xScale*xdata[i];
                double y1 = h - PAD - yScale*ydata[i];
                double x2 = PAD + xScale*xdata[i+1];
                double y2 = h - PAD - yScale*ydata[i+1];
                g2.draw(new Line2D.Double(x1, y1, x2, y2));
            }
            //Draw points for each data set
            g2.setPaint(color);
            for(int i = 0; i < xdata.length; i++) {
                double x = PAD + xScale*xdata[i];
                double y = h - PAD - yScale*ydata[i];
                g2.fill(new Ellipse2D.Double(x-2, y-2, 4, 4));
            }
        }
    }

    private int getMax(ArrayList<int[]> data){
        int max = -Integer.MAX_VALUE;
        for(int j = 0; j < data.size(); j++){
            for(int i = 0; i < data.get(j).length; i++){
                if(data.get(j)[i] > max){
                    max = data.get(j)[i];
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        Grapher grapher = new Grapher(); // Create single Grapher for all lines

  // 1st line data
        int[] xdata1 = {1,2,3,4,5,6};
        int[] ydata1 = {18,82,146,156,164,171};
        grapher.graph(xdata1, ydata1, Color.BLUE);

  // 2nd line data
        int[] xdata2 = {1,2,3,4,5,6};
        int[] ydata2 = {63,130,429,790,1043,1336};
        grapher.graph(xdata2, ydata2, Color.RED);

  // 3rd line data
        int[] xdata3 = {1,2,3,4,5,6};
        int[] ydata3 = {72,368,692,970,1242,1564};
        grapher.graph(xdata3, ydata3, Color.GREEN);

        grapher.display(); // Display all lines when ready
    
        Grapher grapher2 = new Grapher(); // Create single Grapher for all lines

  // 1st line data
        int[] x2data1 = {40,41,42,43,44,45};
        int[] y2data1 = {1045,1053,1063,1125,1136,1144};
        grapher2.graph(x2data1, y2data1, Color.BLUE);

  // 2nd line data
        int[] x2data2 = {5,6,7,8,9,10};
        int[] y2data2 = {1043,1336,1599,1932,2185,2467};
        grapher2.graph(x2data2, y2data2, Color.RED);

  // 3rd line data
        int[] x2data3 = {5,6,7,8,9,10};
        int[] y2data3 = {1242,1564,1841,2135,2424,2771};
        grapher2.graph(x2data3, y2data3, Color.GREEN);

        grapher2.display(); // Display all lines when ready
    }
}