import java.util.Scanner;

public class Employee {

    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details of Employee 1");
        System.out.print("Employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name: ");
        String name1 = sc.nextLine();

        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();

        System.out.println("\nEnter Details of Employee 2");
        System.out.print("Employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Employee Name: ");
        String name2 = sc.nextLine();

        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, salary1);
        Employee e2 = new Employee(id2, name2, salary2);

        System.out.println("\nEmployee Details");
        e1.displayEmployee();
        System.out.println();
        e2.displayEmployee();

        sc.close();
    }
}