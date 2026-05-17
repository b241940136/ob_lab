package lab9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        clock myClock = new clock();       
        System.out.println(" ЦАГИЙН СИСТЕМ (Clock System)");
        System.out.println("\nЦаг тохируулах аргаа сонгоно уу:");
        System.out.println("  1. Гар аргаар тохируулах (setClock)");
        System.out.println("  2. Автоматаар тохируулах (autoSetClock)");
        System.out.print("Сонголт (1 эсвэл 2): ");

        int clockChoice = scanner.nextInt();

        if (clockChoice == 1) {        
            System.out.println("\n--- Гар аргаар цаг оруулах ---");
            System.out.print("Он (жишээ: 2025): ");
            int y = scanner.nextInt();
            System.out.print("Сар (1-12): ");
            int mon = scanner.nextInt();
            System.out.print("Өдөр (1-31): ");
            int d = scanner.nextInt();
            System.out.print("Цаг (0-23): ");
            int h = scanner.nextInt();
            System.out.print("Минут (0-59): ");
            int min = scanner.nextInt();
            System.out.print("Секунд (0-59): ");
            int s = scanner.nextInt();

            myClock.setClock(y, mon, d, h, min, s);
        } else if (clockChoice == 2) {
          myClock.autoSetClock();
        } else {
            System.out.println("Буруу сонголт. Автомат тохируулга хийгдэнэ.");
            myClock.autoSetClock();
        }

        System.out.println("\nТаймер ажиллуулах аргаа сонгоно уу:");
        System.out.println("  1. 1000 секундийн турш ажиллуулах (tickClock)");
        System.out.println("  2. Тодорхой хугацааны турш ажиллуулах (tickClock(int tick))");
        System.out.print("Сонголт (1 эсвэл 2): ");

        int tickChoice = scanner.nextInt();

        if (tickChoice == 1) {
           
            myClock.tickClock();
        } else if (tickChoice == 2) {
            
            System.out.print("Хэдэн секунд ажиллуулах вэ? ");
            int tick = scanner.nextInt();
            myClock.tickClock(tick);
        } else {
            System.out.println("Буруу сонголт. 1000 секунд ажиллуулна.");
            myClock.tickClock();
        }

        scanner.close();
        System.out.println("\nПрограмм дууслаа.");
    }
}