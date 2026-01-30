package Utils;

import java.io.*;

public class FileC {

    public static boolean log = true;

    // Read

    public static String readFile(String src) {
        File file = new File(src);
        return readFile(file);
    }

    public static String readFile(File file) {
        String line, text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null)
                text += line + "\n";
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: File not found [" + file.getAbsolutePath() + "]");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text.trim();
    }

    // Write

    public static void writeFile(String src, String msg) {
        writeFile(new File(src), msg, false);
    }

    public static void writeFile(String src, String msg, boolean append) {
        writeFile(new File(src), msg, append);
    }

    public static void writeFile(File file, String msg) {
        writeFile(file, msg, false);
    }

    public static void writeFile(File file, String msg, boolean append) {
        try {
            if (file.createNewFile() && log) System.out.println("File created: " + file.getName());
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, append));
            bw.write(msg);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}