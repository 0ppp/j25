import java.io.*;


class employee {
	
	public int id;
String dept; double salary;


public employee()
{
	id=0;
	dept="intial";
	salary=0;
}
	
	public employee(int xid, String xdept, double xsalary)
	{
			id=	xid;
	dept=xdept;
	salary=xsalary;
		
	}
	
 void accept() throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter id");
		id=Integer.parseInt(br.readLine());

		System.out.println("Dept");
		dept=br.readLine();
		System.out.println("salary");
		salary=Double.parseDouble(br.readLine());
		
	}
	
		 void display() throws IOException
	{
		
			System.out.println("id: "+id);
			System.out.println("dept: "+dept);
			System.out.println("salary: "+salary);
		
	}
	
	
		
}

class manager extends employee
{
	
	private double bonus;
	
	manager()
	{
		super();
	bonus=0;
	}
	
manager(int xid, String xdept, double xsalary,double xbonus)
	{
		super(xid,xdept,xsalary);
		bonus=xbonus;
	}
	void accept()throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		super.accept();	
		System.out.println("Enter bonus");
		bonus=Double.parseDouble(br.readLine());
		
	}
	
		void display()throws IOException
	{
	
		super.display();	
		System.out.println("bonus: "+bonus);

		
	}
	
	double getbonus()
	{
		return bonus;
	}
}

class s25
{
	
	public static void main(String []args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter n");
int	n=Integer.parseInt(br.readLine());
	manager m[]= new manager[n];
	
	for(int i=0;i<n;i++)
	{
		m[i]= new manager();
		m[i].accept();
	}	
	System.out.println("Accepting Finished.......");	
	for(int i=0;i<n;i++)
	{
		m[i].display();
	}	
	System.out.println("Displaying Finished.......");		
	
	max_sal_manager(m);
		
	}
	
	static void max_sal_manager(manager m[])throws IOException
	{
		
		int max=0; double maxs=m[max].salary+m[max].getbonus();
		
		for(int i=1;i<m.length;i++)
		{
			if(  (m[i].salary+m[i].getbonus())>maxs)
			{
				maxs=m[i].salary+m[i].getbonus();
				max=i;
			}
			
		}
		m[max].display();
	}
	
}