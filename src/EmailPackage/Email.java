package EmailPackage;

import java.util.Scanner;

public class Email {
    private String Email;
	private String fristName;
	private String lastName;
	private String department;
	private String Password;
	private int mailBoxCapacity = 500;
	private String alternativeEmail;
	private int defaultPasswordLength =10;
	private String companySuffix = "sse.org";
	//Creating Constructer For reaciving fristname and last name;
	public Email(String fristName,String lastName)
	{
		this.fristName = fristName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED " + this.fristName + "  " + this.lastName);
		this.department = setDepartment();
		System.out.println("Department Name :" + this.department);
		this.Password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is:" + this.Password);
		
		Email = fristName.toLowerCase() + "." + lastName.toLowerCase()	+"@" + department + companySuffix;
			System.out.println("Your Email is" + Email);
	}
	//Ask for Department
	private String setDepartment() {
		
		
		System.out.print("Enter the department \n1.CSE \n2.ECE \n3.EEE \n4.CIVIL \n5.MECH");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		System.out.println("Deperment Choice : " + depChoice);
		if(depChoice == 1) {
			return "cse";
		}
		else if(depChoice == 2) {
			return "ece";
		}
		else if(depChoice == 3) {
			return "eee";
		}
		else if(depChoice == 4) {
			return "civil";
		}
		else if(depChoice == 5) {
			return "mech";
		}
		else {
			return " ";
			}
	}
	//TO Generate A random Password
	private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678910!@#$%^&*()";
	char[] password = new char[length];
	for(int i = 0;i<length;i++) {
	int rand=(int) (Math.random() * passwordSet.length());
	password[i]=passwordSet.charAt(rand);
	}
      return new String(password);
      }
	
	
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	public void setMailBoxCapacity(int mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}
	
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	public void setAlternativeEmail(String alternativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}
	
	
	@Override
	public String toString() {
		return "Display Name: " + fristName + " " + lastName + " Company Email: " + Email +
				" Mail Box Capacity : " + mailBoxCapacity + " mb ";
	}
	
	
}

