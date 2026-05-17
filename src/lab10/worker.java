package lab10;
     public class worker extends person {

	    private String code;
	    private String branch;
	    private String hireDate;

	    public worker(String ovog, String ner, String register, String birthday,
	                  String code, String branch, String hireDate) {

	        super(ovog, ner, register, birthday);

	        this.code = code;
	        this.branch = branch;
	        this.hireDate = hireDate;
	    }
	    public void info() {
	        super.info();

	        System.out.println("Ажилтны код: " + code);
	        System.out.println("Салбар: " + branch);
	        System.out.println("Ажилд орсон огноо: " + hireDate);
	    }
	}


