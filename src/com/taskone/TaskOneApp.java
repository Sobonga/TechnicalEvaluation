package com.taskone;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TaskOneApp {
    private JPanel panelMain;
    private JButton buttonCurrentDate;
    private JButton currentDateButton;
    private JButton daysBeforeChristmasButton;
    private JButton loadCSVButton;
    private JTable csvTable;
    private JTextArea csvFile;
    Timer timer;

    public long daysBeforeXmas(Date one, Date two){
        long difference = (one.getTime()-two.getTime())/86400000;
        return Math.abs(difference);
    }

    public TaskOneApp() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
                String time = timeFormat.format(date);
                buttonCurrentDate.setText("Current Time:: "+time);

                //Current Date
                Date date1 = new Date();
                DateFormat timeFormat1 = new SimpleDateFormat("dd/MM/yyyy");
                String time1 = timeFormat1.format(date1);
                currentDateButton.setText("Today's Date:: "+time1);

                //Days before Christmas
                Date today = new Date();
                Calendar myNextCalender = Calendar.getInstance();
                myNextCalender.set(2019,11,25);
                Date xmasD = myNextCalender.getTime();
                TaskOneApp myObj = new TaskOneApp();
                long days = myObj.daysBeforeXmas(today,xmasD);

                DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                daysBeforeChristmasButton.setText("Days until Christmas:: "+days);

                //Load CSV File
                String filepath = "C:/Users/Documents/Sobz/1500000 Sales Records.csv";
                File file = new File(filepath);

                try {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    //get the first line
                    //get the column name from the csv file
                    String firstLine = br.readLine().trim();
                    String[] columnsName = firstLine.split(",");

                    DefaultTableModel model = (DefaultTableModel)csvTable.getModel();
                    model.setColumnIdentifiers(columnsName);

                    //get each line from the csv filr
                    Object[] tableLines = br.lines().toArray();

                    //get data from each line
                    //set data to table model
                    for(int i =0; i< tableLines.length; i++){
                        String line = tableLines[i].toString().trim();
                        String[] dataRows = line.split(",");
                        model.addRow(dataRows);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };

        timer = new Timer(1000,actionListener);
        timer.setInitialDelay(0);
        timer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaskOneApp");
        frame.setContentPane(new TaskOneApp().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
