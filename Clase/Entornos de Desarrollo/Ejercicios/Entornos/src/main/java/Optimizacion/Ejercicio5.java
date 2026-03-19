package Optimizacion;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio5 {

    static {
        System.setOut(new PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, java.nio.charset.StandardCharsets.UTF_8));
    }

    private static final Scanner in = new Scanner(System.in);

    // Country | Capital
    private static final Map<String, String> countries = new HashMap<>();

    public static void main(String[] args) {

        for (var e : DataFileUtil.readDataFile("src/main/java/Optimizacion/CountriesData.data").entrySet())
            countries.put(e.getKey().toLowerCase(), e.getValue());
        showCountries(countries);

        try {
            String country = readString("Introduce el nombre de un pais de entre los anteriores");

            if (!countries.containsKey(country.toLowerCase()))
                throw new IllegalArgumentException("ERROR: Country not found");

            System.out.println("Pais: " + country + " | Capital: " + countries.get(country));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Show the countries of the map
     * @param map The map to show (String, String)
     */
    public static void showCountries (Map<String, String> map) {

        System.out.println("Country");
        System.out.println("----------------------------------------");
        for (var e : map.entrySet()) {
            System.out.printf("%-15s%n", e.getKey());
        }
        System.out.println("----------------------------------------\n");

    }

    public static String readString (String prompt) {
        System.out.print(prompt + ": ");
        return in.nextLine();
    }

}

/**
 * The FileUtilHandler interface provides utility methods for reading from and writing to files.
 * It includes functions to handle file operations such as reading file contents, writing to files,
 * and appending data to files.
 *
 * Methods in this interface handle validation of input parameters (e.g., file existence, readability,
 * and writability) and throw appropriate exceptions when invalid arguments are provided.
 *
 * @author _rroyo65_
 */
final class FileUtilHandler {

    private FileUtilHandler(){}

    private static boolean logging = true;

    public static void setLogging(boolean logging) {
        FileUtilHandler.logging = logging;
    }

    /**
     * Reads the entire content of the specified file and returns it as a String.
     *
     * @param file The file to read. It must not be null, must exist, must not be a directory,
     *             must be a regular file, and must be readable.
     * @return The content of the file as a String. The returned string is trimmed of any trailing whitespace.
     * @throws IllegalArgumentException if the file is null, does not exist, is a directory,
     *                                  is not a regular file, or cannot be read.
     */
    public static String readFile(File file) {
        if (file == null) throw new IllegalArgumentException("File cannot be null");
        if (!file.exists()) throw new IllegalArgumentException("File does not exist");
        if (file.isDirectory()) throw new IllegalArgumentException("File cannot be a directory");
        if (!file.isFile()) throw new IllegalArgumentException("File is not a regular file");
        if (!file.canRead()) throw new IllegalArgumentException("File cannot be read");

        String line;
        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null)
                text.append(line).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text.toString().trim();
    }

    /**
     * Writes a message to the specified file. If the file does not exist, it will be created.
     * The message will overwrite any existing content in the file.
     *
     * @param file The file where the message will be written. It must not be null and must not be a directory.
     * @param msg The message to be written to the file. It must not be null.
     * @throws IllegalArgumentException if the file is null or is a directory.
     * @throws RuntimeException if an I/O error occurs during the file operation.
     */
    public static void writeFile(File file, String msg) {
        writeFile(file, msg, false);
    }

    /**
     * Writes a message to the specified file. If the file does not exist, it will be created.
     * Optionally appends the message to the file if the append flag is set to true.
     * The file must not be null or a directory.
     *
     * @param file The file where the message will be written. It must not be null and must not be a directory.
     * @param msg The message to be written to the file. It must not be null.
     * @param append A flag indicating whether the message should be appended to the file.
     *               If false, the existing content of the file (if any) will be overwritten.
     * @throws IllegalArgumentException if the file is null or is a directory.
     * @throws RuntimeException if an I/O error occurs during the file operation.
     */
    public static void writeFile(File file, String msg, boolean append) {
        if (file == null) throw new IllegalArgumentException("File cannot be null");
        if (file.isDirectory()) throw new IllegalArgumentException("File cannot be a directory");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))) {
            if (file.createNewFile() && logging) System.out.println("File created: " + file.getName());
            bw.write(msg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

/**
 * Utility class for reading and writing data using a custom text-based file format.
 * This class provides methods to parse and generate files containing key-value pairs,
 * where a specific format is required to store the data.
 *
 * The custom format follows these rules:
 * - `¡` is used as a section separator.
 * - `:` separates keys from their values.
 * - `^` marks the start of a value.
 * - `~` marks the end of a value.
 * - Comments within the files are enclosed between `\*Comment*\`.
 *
 * This class is intended for static use and cannot be instantiated.
 *
 * Thread Safety:
 * This class is thread-safe as it contains only static, stateless methods.
 */
final class DataFileUtil {

    /*
    ¡<key>:
    ^<value>~

    \*Comment*\
    \*
    ¡   -> Section Separator
    :   -> Key - Value Separator
    ^   -> Value Start
    ~   -> Value End
    *\
     */

    private DataFileUtil(){}

    /**
     * Parses the given data string and extracts key-value pairs based on specific delimiters
     * and formatting rules. The method removes comments, trims the content, and validates
     * the structure of the data before constructing the output map.
     *
     * @param data The input string containing the raw data to be parsed. This string
     *             must follow the expected format where each key-value pair is separated
     *             by specific delimiters. It must not be null or blank.
     * @return A map containing the parsed key-value pairs as strings. The keys and values
     *         are trimmed and validated before being added to the map.
     * @throws IllegalArgumentException If the input data is null, blank, or does not
     *                                  conform to the expected formatting rules.
     */
    public static Map<String, String> readData(String data) {
        if (data == null || data.isBlank()) throw new IllegalArgumentException("Data cannot be blank");

        String[] splittedContent = data.replaceAll("(?s)\\\\\\*.*?\\*\\\\", "")
                .trim()
                .split("(?s)\\s*¡(?=(?:[^\\^~]*\\^[^~]*~)*[^\\^~]*$)");

        Map<String, String> out = new HashMap<>();

        for (String s : splittedContent) {
            s = s.trim();
            if (s.isEmpty()) continue;

            int endT = s.indexOf(':');
            int startV = (endT >= 0) ? s.indexOf('^', endT + 1) : -1;
            int endV = s.lastIndexOf('~');

            if (endT < 0 || startV < 0 || endV < 0 || endV <= startV)
                throw new IllegalArgumentException("Data file error");

            String key = s.substring(0, endT).trim();
            String value = s.substring(startV + 1, endV).trim();

            if (key.isEmpty()) throw new IllegalArgumentException("Data file error");

            out.putIfAbsent(key, value);
        }

        return out;
    }

    /**
     * Reads the content of the specified file and parses it to extract key-value pairs based on
     * specific delimiters and formatting rules. The method internally utilizes the `readFile`
     * method from `FileUtilHandler` to read the file contents as a string and the `readData`
     * method to process and return the key-value mappings.
     *
     * @param file The file to read and parse. It must not be null, must exist, must
     *             not be a directory, and must be readable.
     * @return A map containing the parsed key-value pairs from the file. Both keys and values
     *         are strings, trimmed of any unnecessary white spaces.
     * @throws IllegalArgumentException If the input file is null, does not exist,
     *                                  is a directory, or cannot be read.
     */
    public static Map<String, String> readDataFile (File file) {
        String content = FileUtilHandler.readFile(file);
        return readData(content);
    }

    /**
     * Reads the content of the file at the specified path and parses it to extract key-value pairs
     * based on specific delimiters and formatting rules. This method internally invokes the
     * overloaded {@code readDataFile(File file)} method to perform the processing.
     *
     * @param path The path to the file to read and parse. It must not be null, must not be blank,
     *             must point to a valid file, and the file must be readable.
     * @return A map containing the parsed key-value pairs from the file. Both keys and values
     *         are strings, trimmed of any unnecessary white spaces.
     * @throws IllegalArgumentException If the path is null, blank, does not point to a valid file,
     *                                  or the file cannot be read.
     */
    public static Map<String, String> readDataFile (String path) {
        if (path == null || path.isBlank()) throw new IllegalArgumentException("Path cannot be blank");
        return readDataFile(new File(path));
    }

}
