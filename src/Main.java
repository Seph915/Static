public class Main {
    public class Main {
        public static void main(String[] args) {

            Employee employee1 = new Employee("Francesco", "Rossi", "via pagano");
            Employee employee2 = new Employee("Marco", "verdi", "corso verdi" );

            Badge employeeBadge1 = new Badge(employee1);
            Badge employeeBadge2 = new Badge(employee2);

            employeeBadge1.showBadgeDetails();
            employeeBadge2.showBadgeDetails();


        }
    }
}
