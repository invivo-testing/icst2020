package cz.martykan.forecastie.activities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import cz.martykan.forecastie.utils.ConfigTimePrinter;

public class TimePrinter {

    private static TimePrinter timePrinter = new TimePrinter();
    private Integer counter = new Integer(0);
    private static File logFile;
    private static BufferedWriter bufferedWriter;

/*    private TimePrinter(String logFileName) {
        logFile = new File("/sdcard/Download/" + logFileName + ".csv");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(logFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    private TimePrinter() {
        logFile = new File("/mnt/sdcard/Download/test.csv"); // + Calendar.getInstance().getTime() +".csv");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(logFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TimePrinter getInstance() {
        return timePrinter;
    }

    public static TimePrinter getInstance(String logFileName) {
        return timePrinter;
    }

    public void log(String s) {
        increment();
        System.out.println(counter + ": " + s); // + " " + s1);
        writeLog(counter + ", " + s); // + " " + s1);
    }

    private void writeLog(String s) {
        if(!logFile.exists()){
            try {
                logFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println("writing on file");
            // BufferedWriter
            bufferedWriter = new BufferedWriter(new FileWriter(logFile));
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void increment(){
        if (counter == ConfigTimePrinter.TIMES) {
            counter = 0;
        }
        counter++;
    }

    public void close(){
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void heading(String s) {
        try {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

