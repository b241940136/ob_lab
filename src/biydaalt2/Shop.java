package biydaalt2;
    import java.util.ArrayList;

	public class Shop {

	    
	    private ArrayList<Product> products;
	    private String shopName;

	    public Shop(String shopName) {
	        this.shopName = shopName;
	        this.products = new ArrayList<>();
	    }

	    public void addProduct(Product p) {
	        products.add(p);
	        System.out.println("Нэмэгдлээ: " + p.getInfo());
	    }

	    public void displayAll() {
	        System.out.println("\n ---" + shopName + " — Бараа жагсаалт---");
	        for (int i = 0; i < products.size(); i++) {
	            System.out.println("[" + (i + 1) + "]");
	            products.get(i).display();   
	            printSeparator();
	        }
	    }

	    public Product findById(String id) {
	        for (Product p : products) {
	            if (p.id.equals(id)) return p;
	        }
	        System.out.println("⚠ Бараа олдсонгүй: " + id);
	        return null;
	    }

	    public double getTotalValue() {
	        double total = 0;
	        for (Product p : products) total += p.price;
	        return total;
	    }

	    private void printSeparator() {
	        System.out.println("──────────────────────");
	    }
	}


