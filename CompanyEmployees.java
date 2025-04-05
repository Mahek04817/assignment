// Base class: Employee
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05;  // Default 5% bonus
    }

    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + name + " (" + jobTitle + ")");
        System.out.println("Address: " + address);
        System.out.println("Base Salary: Rs" + salary);
        System.out.println("Bonus: Rs" + calculateBonus());
        System.out.println("---------------------------");
    }

    public void manageProject() {
        System.out.println(name + " is managing general tasks.");
    }
}
class Manager extends Employee {
    private int numberOfProjects;

    public Manager(String name, String address, double salary, int numberOfProjects) {
        super(name, address, salary, "Manager");
        this.numberOfProjects = numberOfProjects;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15 + 1000;  // 15% bonus + fixed amount
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is overseeing " + numberOfProjects + " project(s).");
    }
}
class Developer extends Employee {
    private int bugsFixed;

    public Developer(String name, String address, double salary, int bugsFixed) {
        super(name, address, salary, "Developer");
        this.bugsFixed = bugsFixed;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10 + bugsFixed * 10;  // 10% salary + Rs10 per bug fixed
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is coding and collaborating on development tasks.");
    }
}
class Programmer extends Employee {
    private int linesOfCode;

    public Programmer(String name, String address, double salary, int linesOfCode) {
        super(name, address, salary, "Programmer");
        this.linesOfCode = linesOfCode;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08 + (linesOfCode / 1000) * 50;  // 8% salary + Rs50 per 1000 LOC
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is working on software implementation.");
    }
}
public class CompanyEmployees {
    public static void main(String[] args) {
        Manager mgr = new Manager("Rahul", "123 Manager St", 80000, 3);
        Developer dev = new Developer("Ram", "456 Developer Rd", 70000, 120);
        Programmer prog = new Programmer("Charlie", "789 Programmer Ln", 60000, 20000);

        // Generate reports
        mgr.generatePerformanceReport();
        dev.generatePerformanceReport();
        prog.generatePerformanceReport();

        // Project management
        mgr.manageProject();
        dev.manageProject();
        prog.manageProject();
    }
}
