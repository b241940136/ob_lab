package biydaalt1;

public class TimeRegistration {

    private String employeeName;
    private String employeeId;
    private int arrivalHour;   
    private int arrivalMinute; 
    private int departureHour;
    private int departureMinute; 
    private boolean isExcused; 

   
    private static int totalRecords = 0;
    private static int totalLateEmployees = 0;

    
    public TimeRegistration() {
        this.employeeName = "Тодорхойгүй";
        this.employeeId = "ID000";
        this.arrivalHour = 0;
        this.arrivalMinute = 0;
        this.departureHour = 0;
        this.departureMinute = 0;
        this.isExcused = false;
        totalRecords++;
    }

   
    public TimeRegistration(String employeeName, String employeeId,
                            int arrivalHour, int arrivalMinute,
                            int departureHour, int departureMinute, boolean isExcused) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.arrivalHour = arrivalHour;
        this.arrivalMinute = arrivalMinute;
        this.departureHour = departureHour;
        this.departureMinute = departureMinute;
        this.isExcused = isExcused;
        
        totalRecords++;
       
        if (arrivalHour >= 9 && arrivalMinute > 0 && !isExcused) {
            totalLateEmployees++;
        }
    }

    
    private double calculateWorkHours() {
        int startMinutes = (arrivalHour * 60) + arrivalMinute;
        int endMinutes = (departureHour * 60) + departureMinute;
        int totalMinutes = endMinutes - startMinutes;
        return totalMinutes / 60.0; 
    }

    
    private String checkAttendanceStatus() {
        if (isExcused) return "Чөлөөтэй";
        
        if (arrivalHour < 9 || (arrivalHour == 9 && arrivalMinute == 0)) {
            return "Цагтаа ирсэн";
        } else {
            int lateMinutes = ((arrivalHour - 9) * 60) + arrivalMinute;
            return "Хоцорсон (" + lateMinutes + " минут)";
        }
    }

    public void displayAttendanceInfo() {
        System.out.println("\n--- Цаг бүртгэлийн мэдээлэл ---");
        System.out.println("Ажилтны нэр: " + employeeName + " (ID: " + employeeId + ")");
        System.out.println("Ирсэн цаг: " + String.format("%02d:%02d", arrivalHour, arrivalMinute));
        System.out.println("Явсан цаг: " + String.format("%02d:%02d", departureHour, departureMinute));
        System.out.println("Төлөв: " + checkAttendanceStatus());
        System.out.println("Нийт ажилласан: " + String.format("%.2f", calculateWorkHours()) + " цаг");
    }

   
    public static void showSummary() {
        System.out.println("\n------------------------------");
        System.out.println("Өдрийн нэгдсэн тайлан:");
        System.out.println("Нийт бүртгэгдсэн ажилчид: " + totalRecords);
        System.out.println("Хоцорсон ажилчдын тоо: " + totalLateEmployees);
        System.out.println("------------------------------");
    }
}
   

       
		
    