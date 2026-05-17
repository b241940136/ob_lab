package lab10;
public class person {

    protected String ovog;
    protected String ner;
    protected String register;
    protected String birthday;

    public person(String ovog, String ner, String register, String birthday) {
        this.ovog = ovog;
        this.ner = ner;
        this.register = register;
        this.birthday = birthday;
    }

    protected String getFullName(String ovog, String ner) {
        return ovog.charAt(0) + "." + ner;
    }

    protected int getYear(String date) {
        return Integer.parseInt(date.substring(0, 4));
    }

    protected int getMonth(String date) {
        return Integer.parseInt(date.substring(5, 7));
    }

    protected int getDay(String date) {
        return Integer.parseInt(date.substring(8, 10));
    }

    protected void info() {
        System.out.println("Овог нэр: " + getFullName(ovog, ner));
        System.out.println("Регистр: " + register);
        System.out.println("Төрсөн өдөр: " + birthday);
    }
}

