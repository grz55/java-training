package com.grz55.javatraining;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesTraining {

    public static void main(String[] args) {
        File file = new File("notes.txt");
        //File fileInSpecificDirectory = new File("D:\\notes.txt");
        try {
            System.out.println("File created? " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Creating file exception occurred");
        }
        System.out.println(file.getAbsoluteFile());
        Scanner sc = new Scanner(System.in);
        String messageToWrite = sc.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(messageToWrite);
            fileWriter.close();
            System.out.println("And now reading from file");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------\nAt the end some file information");
        System.out.println(file.getName() + " " + file.canWrite() + " " + file.canRead() + " " + file.length());

        File trash = new File("trash.txt");
        try {
            System.out.println("Trash file created? " + trash.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //folder can be deleted in the same way, it must be empty
        System.out.println("Trash file deleted? " + trash.delete());




    }

}
