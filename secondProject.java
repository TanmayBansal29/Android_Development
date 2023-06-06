import java.util.*;

class Employee {
    int EmpID;
    String name;
    int age;
    long phnno;
    String designation;
    String emailid;
    String country;
    String region;
    float salary;

    Employee(int id, String name, int age, long phnno, String designation, String emailid, String country,
            String region, float salary) {
        this.EmpID = id;
        this.name = name;
        this.age = age;
        this.phnno = phnno;
        this.designation = designation;
        this.emailid = emailid;
        this.country = country;
        this.region = region;
        this.salary = salary;
    }

    public int getemployeeid() {
        return this.EmpID;
    }

    public String getemployeename() {
        return this.name;
    }

    public int getemployeeage() {
        return this.age;
    }

    public long getemployeephnno() {
        return this.phnno;
    }

    public String getemployeedesignation() {
        return this.designation;
    }

    public String getemployeeemailid() {
        return this.emailid;
    }

    public String getemployeecountry() {
        return this.country;
    }

    public String getemployeeregion() {
        return this.region;
    }

    public float getemployeesalary() {
        return this.salary;
    }

}

class Userlist {
    public static void main(String args[]) {
        ArrayList<Employee> empdetails = new ArrayList<Employee>();
        empdetails.add(new Employee(101, "Emp 1", 28, 7649563653L, "SDE1", "emp1@gmail.com", "India", "North", 85000));
        empdetails.add(new Employee(102, "Emp 2", 25, 9769352946L, "Intern", "emp2@gmail.com", "India", "North", 55000));
        empdetails.add(new Employee(103, "Emp 3", 32, 8365497486L, "Manager", "emp3@gmail.com", "India", "South", 95000));
        empdetails.add(new Employee(104, "Emp 4", 29, 7976482364L, "HR", "emp4@gmail.com", "India", "North", 65000));
        empdetails.add(new Employee(105, "Emp 5", 30, 7647354327L, "Finance", "emp5@gmail.com", "Canada", "South", 80000));
        empdetails.add(new Employee(106, "Emp 6", 35, 6284512874L, "SDE3", "emp6@gmail.com", "Australia", "North", 155000));
        empdetails.add(new Employee(107, "Emp 7", 42, 7898647324L, "CEO", "emp7@gmail.com", "India", "West", 285000));
        empdetails.add(new Employee(108, "Emp 8", 31, 9987647325L, "SDE2", "emp8@gmail.com", "India", "North", 125000));
        empdetails.add(new Employee(109, "Emp 9", 29, 9463245364L, "SDE1", "emp9@gmail.com", "America", "North", 85000));
        empdetails.add(new Employee(110, "Emp 10", 23, 7235472342L, "Intern", "emp10@gmail.com", "India", "East", 55000));

        Iterator<Employee> itr = empdetails.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().getemployeeid());
            System.out.println(itr.next().getemployeename());
            System.out.println(itr.next().getemployeeage());
            System.out.println(itr.next().getemployeephnno());
            System.out.println(itr.next().getemployeedesignation());
            System.out.println(itr.next().getemployeeemailid());
            System.out.println(itr.next().getemployeecountry());
            System.out.println(itr.next().getemployeeregion());
            System.out.println(itr.next().getemployeesalary());
        }
    }
}
