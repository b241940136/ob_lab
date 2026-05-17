package biydaalt1;

public class Main {
    public static void main(String[] args) {

        
        TimeRegistration t1 = new TimeRegistration();
        t1.displayAttendanceInfo();

        TimeRegistration t2 = new TimeRegistration("Болд", "EMP101", 8, 50, 18, 0, false);
        t2.displayAttendanceInfo();

        TimeRegistration t3 = new TimeRegistration("Номин", "EMP102", 9, 15, 18, 30, false);
        t3.displayAttendanceInfo();

        TimeRegistration t4 = new TimeRegistration("Энхжин", "EMP103", 9, 45, 17, 0, true); // Чөлөөтэй
        t4.displayAttendanceInfo();

        TimeRegistration t5 = new TimeRegistration("Дөлгөөн", "EMP104", 8, 30, 17, 0, false);
        t5.displayAttendanceInfo();

        TimeRegistration t6 = new TimeRegistration("Тэмүүлэн", "EMP105", 9, 5, 18, 15, false);
        t6.displayAttendanceInfo();

        
        TimeRegistration.showSummary();
    }
}