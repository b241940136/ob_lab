package lab8;

public class SoundCard {
    private int channels;
    private int sampleRate; // Hz
    private String brand;
    private String interf; // Interface type

    public SoundCard(int channels, int sampleRate, String brand, String interf) {
        this.channels = channels;
        this.sampleRate = sampleRate;
        this.brand = brand;
        this.interf = interf;
    }

    public void printInfo() {
        System.out.println("SoundCard: " + brand + ", " + channels + " channels, " 
                           + sampleRate + "Hz, Interface: " + interf);
    }
}