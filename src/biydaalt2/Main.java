package biydaalt2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc   = new Scanner(System.in);
        Shop    shop = new Shop("Номин hypermarket");
        boolean running = true;

        while (running) {
            System.out.println("1. Электрон бараа нэмэх");
            System.out.println("2. Хувцас нэмэх");
            System.out.println("3. Бүх бараа харах");
            System.out.println("4. ID-аар хайх");
            System.out.println("5. Нийт үнийн дүн");
            System.out.println("0. Гарах");
            System.out.print("Сонголт: ");

            
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addElectronics(sc, shop);
                    break;
                case 2:
                    addClothing(sc, shop);
                    break;
                case 3:
                    shop.displayAll();
                    break;
                case 4:
                    System.out.print("Хайх ID: ");
                    String id = sc.nextLine();
                    Product found = shop.findById(id);
                    if (found != null) found.display();
                    break;
                case 5:
                    System.out.printf(" Нийт дүн: %.0f₮%n",
                        shop.getTotalValue());
                    break;
                case 0:
                    System.out.println("Баяртай!");
                    running = false;
                    break;
                default:
                    System.out.println(" Буруу сонголт!");
            }
        }
        sc.close();
    }

    private static void addElectronics(Scanner sc, Shop shop) {
        System.out.print("Нэр: ");
        String name = sc.nextLine();
        System.out.print("Код (ID): ");
        String id = sc.nextLine();
        System.out.print("Үнэ (₮): ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Брэнд: ");
        String brand = sc.nextLine();
        System.out.print("Баталгааны хугацаа (сараар): ");
        int warranty = sc.nextInt();
        sc.nextLine();

        shop.addProduct(new Electronics(name, id, price, brand, warranty));
    }

    private static void addClothing(Scanner sc, Shop shop) {
        System.out.print("Нэр: ");
        String name = sc.nextLine();
        System.out.print("Код (ID): ");
        String id = sc.nextLine();
        System.out.print("Үнэ (₮): ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Хэмжээ (S/M/L/XL): ");
        String size = sc.nextLine();
        System.out.print("Материал: ");
        String material = sc.nextLine();

        shop.addProduct(new Clothing(name, id, price, size, material));
    }
}

