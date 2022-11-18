package csd.uoc.gr.A24;

import java.io.*;


public class FileStats {
    static int files = 0;
    //If I want to count the directory I start I initialize directories with 1.
    static int directories = 0;

    public static void listFilesForFolder(File folder) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                directories++;
                listFilesForFolder(fileEntry);
            } else {
                files++;
                try {
                    //open a printWriter in append mode.
                    PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\temp\\images.html", true));
                    //System.out.println(fileEntry.getAbsolutePath());
                    //append the html file.
                    //writer.println("<img src=\"file:\\C:\\temp\\images\\coffee_card.png\" alt=\"aa\" height=\"100\">");
                    writer.println("<img src=\"file:\\" + fileEntry.getAbsolutePath() + "\" alt=\"aa\" height=\"100\">");
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        //File folder = new File("C:\\temp\\");
        File folder = new File(Utils.selectAFolderDialog(1)); //JFileChooser.DIRECTORIES_ONLY is mode 1.

        try {
            PrintWriter writer = new PrintWriter("C:\\temp\\images.html", "UTF-8");
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<h1>My super cool header</h1>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<p>The file with images you selected contains these images. </p>");
            listFilesForFolder(folder);
            writer.println("</body");
            writer.println("</html");
            writer.close();
        } catch (Exception e) {
            System.out.println("Problem: " + e);
        }
        System.out.println("Files counter: " + files);
        System.out.println("Directory counter: " + directories);
    }
}