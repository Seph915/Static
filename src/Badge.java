import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees;
    private String badgeIdCode;
    public Employee employee;
    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }

    Random random = new Random();
    public char createRandom(){
        int randomInt = Math.abs(random.nextInt());
        randomInt = 'a'+ (randomInt % ('z' - 'a' + 1)) ;
        char myChar = (char) randomInt;
        return myChar;
    }

    public String randomString(int lenghtNumber) {
        String a = "";
        for(int i = 0; i < lenghtNumber; i++){
            a = a + createRandom();}
        return a;
    }

    private String generateBadgeIdCode(){
        return randomString(3) + employee.getName() + employee.getSurname() + randomString(3);
    }

    public void showBadgeDetails(){
        System.out.println("Employees number: " + totalNumberOfEmployees);
        System.out.println("Info: " + employee.getEmployeeDetails());
        System.out.println("Badge Id Code: "+ badgeIdCode);
    }
    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
}