package biydaalt2;
public class Clothing extends Product {

    private String size;
    private String material;

    public Clothing(String name, String id, double price,
                   String size, String material) {
        super(name, id, price);
        this.size     = size;
        this.material = material;
    }

    private String getSizeLabel() {
        switch (size.toUpperCase()) {
            case "S":  return "S (жижиг)";
            case "M":  return "M (дунд)";
            case "L":  return "L (том)";
            case "XL": return "XL (маш том)";
            default:  return size;
        }
    }

    private String getMaterialInfo() {
        if (material.contains("Торго"))  return material + " (дээд зэрэглэл)";
        if (material.contains("Хөвөн")) return material + " (тав тухтай)";
        return material;
    }

    
    public void display() {
        System.out.println("=== Хувцас ===");
        System.out.println("Бараа   : " + getInfo());
        System.out.println("Хэмжээ  : " + getSizeLabel());
        System.out.println("Материал: " + getMaterialInfo());
        System.out.printf("20%% хөнгөлөлт: %.0f₮%n", applyDiscount(20));
    }
}
