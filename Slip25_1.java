
import java.io.*;
class Employee
{             
                private int id;
                private String name, department;
                private float salary;

                Employee()
                {
                                id = 1;
                                name = "nived";
                                department = "bcs";
                                salary = 20000;
                }
               
                Employee(int id, String name, String department, float salary)
                {
                                this.id = id;
                                this.name = name;
                                this.department = department;
                                this.salary = salary;
                }
               
                void accept() throws IOException
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                               
                                System.out.println("Enter employee information: id, name, department, salary");
                               
                                id = Integer.parseInt(br.readLine());
                                name= br.readLine();
                                department = br.readLine();
                                salary = Float.parseFloat(br.readLine());
                }
               
                void display()
                {
                                System.out.println("\nId : "+id+"\nName : "+name+"\nDepartment : "+department+"\nSalary : "+salary);
                }
               
                float getsalary()                               
                {
                                return salary;
                }
}

class Manager extends Employee
{
                private float bonus;       
               
                Manager()
                {
                                super();
                }
               
                Manager(int id, String name, String department, float salary, float bonus)
                {
                                super(id, name, department, salary);
                                this.bonus = bonus;
                }
               
                void accept() throws IOException
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                               
                                super.accept();
                               
                                System.out.println("Enter bonus : ");
                                bonus = Float.parseFloat(br.readLine());
                }
               
                void display()
                {
                                super.display();
                                System.out.println("\nBonus : "+bonus);
                }
               
                float getbonus()
                {              return bonus;   
                }
}

class Slip25_1
{
                public static void main(String args[]) throws IOException              
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                               
                                System.out.println("Enter Number Of Employees: ");
                                int no = Integer.parseInt(br.readLine());
                               
                                Manager mn[] = new Manager[no];       
                                for(int i = 0 ; i < no; i++)
                                {
                                                mn[i] = new Manager();              
                                                mn[i].accept(); 
                                }
                               
                                calculate_salary(mn,no);
                }
               
                static void calculate_salary(Manager mn[],int n)               
                {
                                int index = 0;     
                                float sal[] = new float[n];             
                               
                                for(int i = 0; i < n; i++)               
                                {
                                                sal[i] = mn[i].getsalary() + mn[i].getbonus();
                                               
                                }
                               
                                float max = 0;
                                for(int i = 0; i<n; i++)
                                {
                                                if(sal[i] > max)
                                                {
                                                                max = sal[i];
                                                                index = i;
                                                }
                                }
                                System.out.println("Employee with max salary is: ");
                                mn[index].display();                      
                }
}
