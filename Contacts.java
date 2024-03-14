import java.util.*;
class Contacts
{
	Scanner sc=new Scanner(System.in);
	static String contact[]=new String[100];
	static int n=0;
	static String fname[]=new String[100];
	static String lname[]=new String[100];
	void AddContact()
	{
		System.out.print("Enter first name:");
		fname[n]=sc.next();
		System.out.print("Enter last name:");
		lname[n]=sc.next();
		boolean contactCheck=false;
		while(contactCheck==false)
		{
			System.out.print("Enter number:");
			contact[n]=sc.next();
			if(contact[n].length()==10 && (contact[n].startsWith("9") ||contact[n].startsWith("8")||contact[n].startsWith("7")))
			{
				n++;
				contactCheck=true;
			}
		}
	}
	void DisplayAll()
	{
		if(n==0)
		{
			System.out.println("NO DATA!!");
		}
		else
		{
			System.out.println("**********CONTACT LIST**********");
			for(int i=0;i<n;i++)
			{
				System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
			}
			System.out.println("********************************");
		}
	}
	void EditContact()
	{
		if(n==0)
		{
			System.out.println("NO DATA!!");
		}
		else
		{
			System.out.println("What do you want to update??");
			System.out.println("1.Name");
			System.out.println("2.Number");
			System.out.print("Enter your choice:");
			int c=sc.nextInt();
			if(c==2)
			{
				System.out.print("Enter current firstname:");
				String sfname=sc.next();
				sfname=sfname.trim();
				System.out.print("Enter current lastname:");
				String slname=sc.next();
				slname=slname.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(sfname.equalsIgnoreCase(fname[i]) && slname.equalsIgnoreCase(lname[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						System.out.print("Do you want to update?(Y/N):");
						char choice=sc.next().charAt(0);
						if(choice=='y' || choice=='Y')
						{
							System.out.print("Enter updated contact:");
							contact[i]=sc.next();
							System.out.println("Updated successfully!!");
						}
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else if(c==1)
			{
				System.out.print("Enter contact:");
				String scontact=sc.next();
				scontact=scontact.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(scontact.equalsIgnoreCase(contact[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						System.out.print("Do you want to update?(Y/N):");
						char choice=sc.next().charAt(0);
						if(choice=='y' || choice=='Y')
						{
							System.out.print("Enter updated firstname:");
							fname[i]=sc.next();
							System.out.print("Enter updated lastname:");
							lname[i]=sc.next();
							System.out.println("Updated successfully!!");
						}
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else
			{
				System.out.println("Invalid choice!!");
			}
		}
	}
	void SearchContact()
	{
		if(n==0)
		{
			System.out.println("NO DATA!!");
		}
		else
		{
			System.out.println("How do you want to search??");
			System.out.println("1.By name");
			System.out.println("2.By number");
			System.out.print("Enter your choice:");
			int c=sc.nextInt();
			if(c==1)
			{
				System.out.print("Enter firstname:");
				String sfname=sc.next();
				sfname=sfname.trim();
				System.out.print("Enter lastname:");
				String slname=sc.next();
				slname=slname.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(sfname.equalsIgnoreCase(fname[i]) && slname.equalsIgnoreCase(lname[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else if(c==2)
			{
				System.out.print("Enter contact:");
				String scontact=sc.next();
				scontact=scontact.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(scontact.equalsIgnoreCase(contact[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else
			{
				System.out.println("Invalid choice!!");
			}
		}
	}
	void DeleteContact()
	{
		if(n==0)
		{
			System.out.println("NO DATA!!");
		}
		else
		{
			System.out.println("How do you want to search??");
			System.out.println("1.By name");
			System.out.println("2.By number");
			System.out.print("Enter your choice:");
			int c=sc.nextInt();
			if(c==1)
			{
				System.out.print("Enter firstname:");
				String sfname=sc.next();
				sfname=sfname.trim();
				System.out.print("Enter lastname:");
				String slname=sc.next();
				slname=slname.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(sfname.equalsIgnoreCase(fname[i]) && slname.equalsIgnoreCase(lname[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						System.out.print("Do you want to delete?(Y/N):");
						char choice=sc.next().charAt(0);
						if(choice=='Y' || choice=='y')
						{
							for(int j=i;j<n;j++)
							{
								fname[j]=fname[j+1];
								lname[j]=lname[j+1];
								contact[j]=contact[j+1];
							}
						}
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else if(c==2)
			{
				System.out.print("Enter contact:");
				String scontact=sc.next();
				scontact=scontact.trim();
				int flag=0;
				for(int i=0;i<n;i++)
				{
					if(scontact.equalsIgnoreCase(contact[i]))
					{
						flag=1;
						System.out.println("Contact found successfully!!");
						System.out.println("********************************");
						System.out.println(fname[i]+" "+lname[i]+"-->"+contact[i]);
						System.out.println("********************************");
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NO DATA!!");
				}
			}
			else
			{
				System.out.println("Invalid choice!!");
			}
		}
	}
	void DeleteAll()
	{
		this.DisplayAll();
		System.out.print("Do you want to delete all?(Y/N):");
		char choice=sc.next().charAt(0);
		if(choice=='Y' || choice=='y')
		{
			for(int i=0;i<n;i++)
			{
				fname[i]="";
				lname[i]="";
				contact[i]="";
			}
			System.out.println("All contacts deleted successfully!!");
		}
	}
	// void Alphabetical()
	// {
		
	// }
}
class Run
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Contacts c=new Contacts();
		boolean mloop=true;
		while(mloop==true)
		{
			System.out.println("**********MENU**********");
			System.out.println("1.Add contact");
			System.out.println("2.Delete contact");
			System.out.println("3.Edit contact");
			System.out.println("4.Search contact");
			System.out.println("5.Display all contacts");
			System.out.println("6.Delete all contacts");
			// System.out.println("7.Display in alphabetical order");
			System.out.println("7.Exit");
			System.out.print("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1: c.AddContact();break;
				case 2: c.DeleteContact();break;
				case 3: c.EditContact();break;
				case 4: c.SearchContact();break;
				case 5: c.DisplayAll();break;
				case 6: c.DeleteAll();break;
				// case 7: c.Alphabetical();break;
				case 7: mloop=false;break;
				default: System.out.println("\nINVALID ENTRY!!");
			}
		}
	}
}