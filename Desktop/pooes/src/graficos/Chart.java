/*
 * @author fabricio@utfpr.edu.br
 */
package graficos;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Paint;
import java.awt.Shape;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.labels.XYToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.SeriesRenderingOrder;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.urls.StandardXYURLGenerator;
import org.jfree.chart.urls.XYURLGenerator;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;

public class Chart extends javax.swing.JFrame {

    public final int n_points = 1000;
    public final int defaultwidth = 800;
    public final int defaultheight = 600;
    public double[] y_of_x, x;//we will plot y(x) versus x

    /** Creates new form TesteGrafico */
    public Chart() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Gráfico de Séries");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 170, 29);

        jButton3.setText("Gráfico Torta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(190, 10, 150, 29);

        jButton4.setText("Gráfico Barras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 50, 170, 29);

        jButton5.setText("Pontos XY");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 50, 150, 29);

        jButton2.setText("Grafico Linhas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 10, 140, 29);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-503)/2, (screenSize.height-157)/2, 503, 157);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PontosXY();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GraficoBarras();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GraficoTorta();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GraficoSeries();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        double x = 0;
        double y = 0;
        double b = 5;
        for (x = -10; x <= 10; x++) {
            y = (1 * x + b);
            dataset.addValue(y, "a=1", String.valueOf(x));
            y = (30 * x + b);
            dataset.addValue(y, "a=30", String.valueOf(x));
            y = (-30 * x + b);
            dataset.addValue(y, "a=-30", String.valueOf(x));
            y = (45 * x + b);
            dataset.addValue(y, "a=45", String.valueOf(x));
            y = (-45 * x + b);
            dataset.addValue(y, "a=-45", String.valueOf(x));
            y = (90 * x + b);
            dataset.addValue(y, "a=90", String.valueOf(x));
        }
        LineChart(dataset, "line", "axis x", "axis y", true, 0, 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
public void LineChart(
            DefaultCategoryDataset dataset, 
            String title,
            String x_axis_label, 
            String y_axis_label, 
            boolean showlegend,
            float maxvalue, 
            float minvalue) {

        JFrame chartwindow = new JFrame(title);

        JFreeChart jfreechart = ChartFactory.createLineChart(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.VERTICAL,
                showlegend, // include legend
                true, // tooltips
                true // urls
                );

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.LIGHT_GRAY);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setStandardTickUnits(NumberAxis.createStandardTickUnits());

        CategoryPlot plot = (CategoryPlot) jfreechart.getPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRangeIncludesZero(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        LineAndShapeRenderer lineandshaperenderer =
                (LineAndShapeRenderer) categoryplot.getRenderer();
        lineandshaperenderer.setBaseStroke(new BasicStroke(4.0f));
        lineandshaperenderer.setShapesVisible(true);
        lineandshaperenderer.setDrawOutlines(true);
        lineandshaperenderer.setUseFillPaint(true);
        lineandshaperenderer.setFillPaint(Color.white);

        //GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.MAGENTA, 0.0f, 0.0f, Color.MAGENTA);
        //lineandshaperenderer.setSeriesPaint(0, gp1);
        //ou
        lineandshaperenderer.setSeriesPaint(0, Color.RED);

        JPanel jpanel = new ChartPanel(jfreechart);
        
        jpanel.setPreferredSize(new Dimension(800, 600));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }


    public void ScatterPlot(XYSeriesCollection dataset, String title,
            String xAxisLabel, String yAxisLabel) {
        NumberAxis xAxis = new NumberAxis(xAxisLabel);
        xAxis.setAutoRangeIncludesZero(false);
        NumberAxis yAxis = new NumberAxis(yAxisLabel);
        yAxis.setAutoRangeIncludesZero(false);
        XYToolTipGenerator toolTipGenerator = new StandardXYToolTipGenerator();
        XYURLGenerator urlGenerator = new StandardXYURLGenerator();
        XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);//(boolean lines, boolean shapes)
        renderer.setBaseToolTipGenerator(toolTipGenerator);
        renderer.setURLGenerator(urlGenerator);
        XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer);
        //plot.setDataset(dataset);
        //plot.setDomainAxis(xAxis);
        //plot.setRangeAxis(yAxis);
        //plot.setRenderer(renderer);
        plot.setOrientation(PlotOrientation.VERTICAL);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        plot.setSeriesRenderingOrder(SeriesRenderingOrder.FORWARD);
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT,
                plot, true);//true==legend
        //INVERTER AS CORES DOS PONTOS E LEGENDA.
        if (dataset.getSeriesCount() > 1) {
            Shape s0 = plot.getLegendItems().get(0).getShape();
            Shape s1 = plot.getLegendItems().get(1).getShape();
            renderer.setSeriesShape(0, s1);
            renderer.setSeriesShape(1, s0);
            Paint p0 = plot.getLegendItems().get(0).getLinePaint();
            Paint p1 = plot.getLegendItems().get(1).getLinePaint();
            renderer.setSeriesPaint(0, p1);
            renderer.setSeriesPaint(1, p0);
        }
        //FIM DA INVERSAO.

        JFrame chartwindow = new JFrame(title);
        JPanel jpanel = new ChartPanel(chart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public void PontosXY() {

        XYSeries series2 = new XYSeries("Max Value");
        series2.add(30.0, 15.0);
        series2.add(20.0, 30.0);
        series2.add(10.0, 75.0);
        series2.add(40.0, 23.0);
        series2.add(5.0, 50.0);
        series2.add(25.0, 45.0);

        XYSeries series3 = new XYSeries("Min Value");
        series3.add(10.0, 15.0);

        XYSeriesCollection series = new XYSeriesCollection();
        series.addSeries(series2);
        series.addSeries(series3);

        JFreeChart jfreechart = ChartFactory.createScatterPlot(
                "Sample XY Chart", // Title
                "Height", // X-Axis label
                "Weight", // Y-Axis label
                series, // Dataset
                PlotOrientation.VERTICAL,
                true, // Show legend
                false,
                false);
        JFrame janela = new JFrame("Example of the XY series graphic");
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);
    }

    public void GraficoSeries() {
        JFrame janela = new JFrame("Example of the series graphic");
        janela.getContentPane().setLayout(null);

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("");
        janela.getContentPane().add(jLabel1);

        y_of_x = new double[n_points];
        x = new double[n_points];

        XYSeries series1 = new XYSeries("Cos(x) versus x");
        XYSeries series2 = new XYSeries("Cos^2(x) versus x");

        for (int i = 0; i < n_points; i++) {//calculate the data to be plotted

            y_of_x[i] = Math.cos(i * Math.PI / 180);
            series1.add((double) i, y_of_x[i]);//add values to the series

            series2.add((double) i, Math.pow(y_of_x[i], 2));
        }

        XYDataset dataset1 = new XYSeriesCollection(series1);
        XYDataset dataset2 = new XYSeriesCollection(series2);

        CombinedDomainXYPlot parent = new CombinedDomainXYPlot(
                new NumberAxis("x-angle argument"));

        XYItemRenderer renderer1 = new StandardXYItemRenderer();
        XYPlot subplot1 = new XYPlot(dataset1, null, new NumberAxis("Cos(x)"),
                renderer1);
        NumberAxis axis1 = (NumberAxis) subplot1.getRangeAxis();
        axis1.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 10));
        axis1.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis1.setAutoRangeIncludesZero(false);
        parent.add(subplot1, 1);

        XYItemRenderer renderer2 = new StandardXYItemRenderer();
        XYPlot subplot2 = new XYPlot(dataset2, null, new NumberAxis("Cos^2(x)"),
                renderer2);
        NumberAxis axis2 = (NumberAxis) subplot2.getRangeAxis();
        axis2.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 10));
        axis2.setLabelFont(new Font("SansSerif", Font.PLAIN, 10));
        axis2.setAutoRangeIncludesZero(false);
        parent.add(subplot2, 1);

        JFreeChart chart = new JFreeChart("Cos(x) versus x", parent);

        ChartPanel myChart = new ChartPanel(chart);
        janela.setSize(500, 600);
        janela.setContentPane(myChart);

        janela.setVisible(true);
    }

    public void StepChart(CategoryDataset dataset, String title,
            String x_axis_label, String y_axis_label, boolean showlegend,
            float maxvalue, float minvalue) {
        JFrame chartwindow = new JFrame(title);
        CategoryItemRenderer renderer = new CategoryStepRenderer(true);
        CategoryAxis domainAxis = new CategoryAxis(x_axis_label);
        ValueAxis rangeAxis = new NumberAxis(y_axis_label);
        CategoryPlot categoryplot = new CategoryPlot(dataset, domainAxis, rangeAxis, renderer);
        JFreeChart jfreechart = new JFreeChart(title, categoryplot);

        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        //NumberAxis numberaxis = (NumberAxis)categoryplot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        if (minvalue == 0 && maxvalue == 0) {
            rangeAxis.setAutoRange(true);
        } else {
            rangeAxis.setRange(minvalue, maxvalue);
        }
        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public void GraficoTorta() {
        JFrame janela = new JFrame("Exemplo de Gráfico de Torta");

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("JavaWorld", new Integer(75));
        pieDataset.setValue("Other", new Integer(25));

        JFreeChart jfreechart = ChartFactory.createPieChart(
                "Sample Pie Chart", // Title
                pieDataset, // Dataset
                true, // Show legend
                false, // Tooltips
                false // url
                );

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);

    }

    public void BarChart(DefaultCategoryDataset dataset, String title,
            String x_axis_label, String y_axis_label, boolean showlegend) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createStackedBarChart(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.HORIZONTAL,
                showlegend,
                true,
                false);

        CategoryPlot categoryplot = (CategoryPlot) jfreechart.getPlot();
        categoryplot.setBackgroundPaint(Color.white);
        categoryplot.setRangeGridlinePaint(Color.black);
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        numberaxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

        CategoryAxis domainaxis = categoryplot.getDomainAxis();
        domainaxis.setLabelFont(new Font("SansSerif", Font.BOLD, 12));

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public void Histogram(IntervalXYDataset dataset,
            String title, String x_axis_label, String y_axis_label) {
        JFrame chartwindow = new JFrame(title);
        JFreeChart jfreechart = ChartFactory.createHistogram(
                title,
                x_axis_label,
                y_axis_label,
                dataset,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        chartwindow.setContentPane(jpanel);
        chartwindow.pack();
        RefineryUtilities.centerFrameOnScreen(chartwindow);
        chartwindow.setVisible(true);
    }

    public void GraficoBarras() {
        JFrame janela = new JFrame("Exemplo de Gráfico de Barras");

        DefaultCategoryDataset defaultcategorydataset =
                new DefaultCategoryDataset();
        defaultcategorydataset.addValue(212D, "Classes", "JDK 1.0");
        defaultcategorydataset.addValue(504D, "Classes", "JDK 1.1");
        defaultcategorydataset.addValue(1520D, "Classes", "SDK 1.2");
        defaultcategorydataset.addValue(1842D, "Classes", "SDK 1.3");
        defaultcategorydataset.addValue(2991D, "Classes", "SDK 1.4");

        JFreeChart jfreechart = ChartFactory.createStackedBarChart(
                "Java Standard Class Library",
                "Release",
                "Class Count",
                defaultcategorydataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);

        JPanel jpanel = new ChartPanel(jfreechart);
        jpanel.setPreferredSize(new Dimension(defaultwidth, defaultheight));
        janela.setContentPane(jpanel);
        janela.pack();
        RefineryUtilities.centerFrameOnScreen(janela);
        janela.setVisible(true);

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Chart().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
