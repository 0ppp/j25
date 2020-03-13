import java.io.*;
class Employee
{

private int eid;
private String ename,department;
private double salary;

public Employee()
{
}

Employee(int eid,String ename,String department,double salary)
{
this.eid=eid;
this.ename=ename;
this.department=department;
this.salary=salary;
}
void accept()
{ 
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter the employee ID:");
eid=Integer.parseInt(br.readLine());
System.out.println("Enter the employee name:");
ename=br.readLine();
System.out.println("Enter the employee department:");
department=br.readLine();
System.out.println("Enter the employee salary:");
salary=Double.parseDouble(br.readLine());
}
catch(Exception e)
                {
                        System.out.println(e);
                }
}
int getid()
{
return eid;
}

String getname()
{
return ename;
}

String getdept()
{
return department;
}

double getsal()
{
return salary;
}

void display()
{
System.out.println("Employee ID\t Employee name\t Employee department \tEmployee salary:");
System.out.println("\t"+eid+"\t\t"+ename+"\t\t"+department+"\t\t"+salary);
}

}


class Manager extends Employee
{
private double bonus;
Manager(){}
Manager(int eid,String name,String department,double salary,double b)
{
super(eid,name,department,salary);
bonus=b;
}
double getbonus()
{
return bonus;
}
void accept()
{ 
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

super.accept();
System.out.println("Enter the manager bonus::");
bonus=Double.parseDouble(br.readLine());
}
catch(Exception e)
                {
                        System.out.println(e);
                }
}

void display()
{
super.display();
System.out.println("bonus="+bonus);
}

static void maxsal(Manager m[])
{	
	int num=m.length;
	double max=0;
	double total;
	int temp=0;
	for(int i=0;i<num;i++)
	{
	total=(m[i].getbonus())+(m[i].getsal());
	if(total>max)
	{
	max=total;
	temp=i;
	}
	}
	System.out.println("Employee with maximum salary:");
	m[temp].display();
}
}

class Empdemo
{
public static void main(String args[]) 
{
	try
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter the number of employees:\n");
	int n=Integer.parseInt(br.readLine());
	Manager m[]=new Manager[n];
	for(int i=0;i<n;i++)
	{
	m[i]=new Manager();
	m[i].accept();
	}
	Manager.maxsal(m);
}
catch(Exception e)
                {
                        System.out.println(e);
                }

}
}
