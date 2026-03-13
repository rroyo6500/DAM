package POO.Tests;

public class Main {

    public static void main(String[] args) {

        PC pc = new PC("192.168.172.15", "AB:15:A6:00:00:48", "PC_1", PC.OS.WINDOWS);
        PC pc1 = new PC("654.456.852.258", "GG:00:47:47:B1:64", "PC_2", PC.OS.MACOS);
        PC pc2 = new PC("753.951.357.159", "H5:26:49:5A:00:00", "PC_3", PC.OS.LINUX);

        System.out.println(pc);
        System.out.println(pc1);
        System.out.println(pc2);

    }

}
