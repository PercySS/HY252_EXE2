package csd.uoc.gr.A24;


import javax.swing.*;
import java.io.File;

class Utils {
    /**
     * Dialog for selecting a folder
     * mode: JFileChooser.DIRECTORIES_ONLY,
     * @return the filePath of the file/folder
     */
    public static String selectAFolderDialog(int mode) {
        String filePath ="";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(mode); // JFileChooser.DIRECTORIES_ONLY
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePath= selectedFile.getAbsolutePath();
            System.out.println("Selected file/folder: " + filePath);
        }
        return filePath;
    }
}

