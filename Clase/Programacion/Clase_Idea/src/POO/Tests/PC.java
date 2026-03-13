package POO.Tests;

public class PC {

    public enum OS { WINDOWS, LINUX, MACOS }

    private final String MAC;
    private String IP;
    private String NAME;
    private OS OS;

    public PC(String IP, String MAC, String NAME, OS OS) {
        this.IP = IP;
        this.MAC = MAC;
        this.NAME = NAME;
        this.OS = OS;
    }

    public String getIP() {
        return IP;
    }
    public String getMAC() {
        return MAC;
    }
    public String getNAME() {
        return NAME;
    }
    public OS getOS() {
        return OS;
    }

    public void setIP (String IP) {
        this.IP = IP;
    }
    public void setNAME (String NAME) {
        this.NAME = NAME;
    }
    public void setOS (OS OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return String.format("PC [ '%s'\t-\tSO: %s\t-\tIP: %s\t-\tMAC: %s ]", NAME, OS, IP, MAC);
    }
}
