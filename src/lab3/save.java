package lab3;

public class save {
	private String hadgalamjiin_ner;
	private char hadgalamjiin_walyut;
	private double jiliin_huu;
	private int hadgalamjiin_hugatsaa_saraar;
	private double ehnii_uldegdel;
	
		public save(String hadgalamjiin_ner, char hadgalamjiin_walyut, double jiliin_huu, int hadgalamjiin_hugatsaa_saraar, double ehnii_uldegdel) {
		    this.hadgalamjiin_ner = hadgalamjiin_ner;
		    this.hadgalamjiin_walyut = hadgalamjiin_walyut;
		    this.jiliin_huu = jiliin_huu;
		    this.hadgalamjiin_hugatsaa_saraar = hadgalamjiin_hugatsaa_saraar;
		    this.ehnii_uldegdel = ehnii_uldegdel;
		}
		private double savingscalcaccrued() {
			return (ehnii_uldegdel*(jiliin_huu/12)*hadgalamjiin_hugatsaa_saraar)/100;
		}
		
		private double savingscalc() {
			return savingscalcaccrued()+ ehnii_uldegdel;
		}
		
		public void savingsreport() {
		    System.out.printf(
		        "\nТа \"%s\" хадгаламж-д %.0f -ийг %d сарын хугацаатай, жилийн %.0f%%-ийн хүүтэй хадгалуулбал:\n",
		        hadgalamjiin_ner, ehnii_uldegdel, hadgalamjiin_hugatsaa_saraar, jiliin_huu
		    );

		    System.out.printf("Сүүлийн үлдэгдэл: %.2f %c\n", savingscalc(), hadgalamjiin_walyut);
		}
}