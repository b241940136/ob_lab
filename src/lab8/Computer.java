package lab8;

public class Computer {
    private Processor processor;
    private Memory memory;
    private DisplayCard displayCard;
    private SoundCard soundCard;

    public Computer() {
        // Бодит laptop мэдээллийг ашиглана
        processor = new Processor("Intel", 10, 1.7, 12); 
        memory = new Memory(16, "DDR4", 3200, "Generic"); 
        displayCard = new DisplayCard(0, "Iris Xe", "Intel", 1400); 
        soundCard = new SoundCard(2, 48000, "Realtek", "Integrated"); 
    }

    public void showInfo() {
        processor.printInfo();
        memory.printInfo();
        displayCard.printInfo();
        soundCard.printInfo();
    }
}