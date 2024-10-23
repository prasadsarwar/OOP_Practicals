class Employee {
    String empName, empId, address, mailId;
    long mobileNo;
    double basicPay;

    public Employee(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public void calculateSalary() {
        double DA = 0.97 * basicPay;
        double HRA = 0.10 * basicPay;
        double PF = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = basicPay + DA + HRA;
        double netSalary = grossSalary - PF - staffClubFund;

        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

class Programmer extends Employee {
    public Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class TeamLead extends Employee {
    public TeamLead(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProjectManager extends Employee {
    public AssistantProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class ProjectManager extends Employee {
    public ProjectManager(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("John Doe", "P1001", "123 St, City", "john@example.com", 9876543210L, 50000);
        TeamLead teamLead = new TeamLead("Jane Smith", "T2001", "456 St, City", "jane@example.com", 8765432109L, 60000);
        AssistantProjectManager apm = new AssistantProjectManager("Alice Brown", "A3001", "789 St, City", "alice@example.com", 7654321098L, 70000);
        ProjectManager pm = new ProjectManager("Bob Green", "M4001", "101 St, City", "bob@example.com", 6543210987L, 80000);

        System.out.println("Programmer Pay Slip:");
        programmer.calculateSalary();

        System.out.println("\nTeam Lead Pay Slip:");
        teamLead.calculateSalary();

        System.out.println("\nAssistant Project Manager Pay Slip:");
        apm.calculateSalary();

        System.out.println("\nProject Manager Pay Slip:");
        pm.calculateSalary();
    }
}
