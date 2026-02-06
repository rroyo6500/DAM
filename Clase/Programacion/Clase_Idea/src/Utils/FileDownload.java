package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDownload {

    public static void descarregarFitxer(String enllacWeb, String rutaFitxerLocal) {
        try {
            InputStream in = new URL(enllacWeb).openStream();
            Files.copy(in, Paths.get(rutaFitxerLocal), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Fitxer descarregat correctament: " + rutaFitxerLocal);
        } catch (IOException e) {
            System.out.println("Error descarregant: " + e.getMessage());
        }
    }

}
