package biydaalt2;
	public class Electronics extends Product {

	    private String brand;
	    private int    warrantyMonths;

	    public Electronics(String name, String id, double price,
	                       String brand, int warrantyMonths) {
	        super(name, id, price);
	        this.brand          = brand;
	        this.warrantyMonths = warrantyMonths;
	    }

	    private String getWarrantyLabel() {
	        if (warrantyMonths < 12) return warrantyMonths + " сар";
	        return (warrantyMonths / 12) + " жил";
	    }

	    private String calcWarrantyCost() {
	        if (warrantyMonths >= 24) return "үнэгүй баталгаа";
	        return "нэмэлт баталгаа авах боломжтой";
	    }

	    public void display() {
	        System.out.println("=== Электрон бараа ===");
	        System.out.println("Бараа   : " + getInfo());
	        System.out.println("Брэнд   : " + brand);
	        System.out.println("Баталгаа: " + getWarrantyLabel() + " / " + calcWarrantyCost());
	        System.out.printf("10%% хөнгөлөлт: %.0f₮%n", applyDiscount(10));
	    }
	}


