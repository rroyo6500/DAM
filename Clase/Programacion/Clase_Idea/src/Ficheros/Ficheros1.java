package Ficheros;

import java.nio.file.FileSystems;

public class Ficheros1 {

    public static void main(String[] args) {

        String path = FileSystems.getDefault().getPath("").toAbsolutePath().toString();

        System.out.println(path);

    }

}
