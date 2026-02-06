package Ficheros.Receptor_RobertRoyo;

import Utils.Auxiliar;
import Utils.FileC;
import Utils.FileDownload;

public class ReceptorRobertRoyo {

    public static void main(String[] args) {

        String url = Auxiliar.inputString("Introduce la url del fichero");
        String path = Auxiliar.inputString("Introduce la ruta donde se guardara el fichero");

        FileDownload.descarregarFitxer(url, path);

        String msg = FileC.readFile(path).split("\n")[0];
        int key = Integer.parseInt(FileC.readFile(path).split("\n")[1]);

        System.out.println(decrypt(msg, key));

        // System.out.println(decrypt("Ryvk", 10));

    }

    public static String decrypt (String encryptedMsg, int key) {
        String decryptedMsg = "";
        for (int i = 0; i < encryptedMsg.length(); i++) {
            if (encryptedMsg.charAt(i) == ' ') {
                decryptedMsg += " ";
                continue;
            }
            char actualChar = encryptedMsg.charAt(i);
            int tmpKey = key;

            for (int j = 0; j < tmpKey; j++) {
                if (actualChar == 'a') {
                    actualChar = 'z';
                    actualChar++;
                }
                if (actualChar == 'A') {
                    actualChar = 'Z';
                    actualChar++;
                }

                actualChar--;
            }

            decryptedMsg += String.valueOf(actualChar);
        }
        return decryptedMsg;
    }

}
