package com.coreProject;

import java.util.Scanner;

public class ATM 
{
	private String[] userName;
	private String[] password;
	private  float totalAmount;
	private long phone;
	Scanner sc;
	
	public ATM() {
		userName= new String[]{"java", "react", "html", "javaScript"};
		password = new String[]{"1234","4321","2341","3214"};
		totalAmount = 2500f;
		phone= 9874563210l;
		sc = new Scanner(System.in);
	}
	
	public void checkLogin(String userName, String password)
	{
		boolean isAuthenticated = false;
		for(int i=0;i<this.userName.length;i++)
		{
			if(this.userName[i].equals(userName) && this.password[i].equals(password))
			{
//				System.out.println("login Done");
				isAuthenticated = true;
			}
		}
		if (isAuthenticated) {
            System.out.println("Login Done");
            displayOption();
        } else {
            System.out.println("Invalid username/password is incorrect");
        }
	}
	
	public void creditAmount()
	{
		System.out.println("Enter Amout to deposit: ");
		float deposit = sc.nextFloat();
		totalAmount += deposit;
		countNotes(deposit);
		System.out.println("Deposit Amount : "+deposit+" \tUpdate Amount : "+totalAmount);
	}
	
	public void debitAmount()
	{
		System.out.println("Enter Amount to withdraw : ");
		float withDraw = sc.nextFloat();
		
		if(withDraw > totalAmount)
		{
			System.out.println("Insufficent Balance, Avail Balance : "+totalAmount);
			creditAmount();
		}else {
			totalAmount -= withDraw;
			countNotes(withDraw);
			System.out.println("WithDraw Amount : "+withDraw+" \tUpdate Amount : "+totalAmount);
		}
	}
	
	public void viewBalance(float totalAmount)
	{
		System.out.println("Available Balance : "+this.totalAmount);
	}
	
	public void updatePin(String password[])
	{
		sc.nextLine();
		System.out.println("Enter Pin :");
		String pin = sc.nextLine();
		
		int f=0;
		for(int i=0;i<this.password.length;i++)
		{
			if(this.password[i].equals(pin))
			{
				int n = 3;
				while(n>0)
				{
					System.out.println("Enter new Pin : ");
					String npin = sc.nextLine();
					System.out.println("re-type Pin : ");
					String rpin = sc.nextLine();
					
					if(npin.equals(rpin))
					{
						this.password[i] = npin;
						System.out.println("Password update succesfully");
						break;
					}else {
						System.out.println("pin does not match! left chances "+(--n));
					}
				}
				f=1;
			}
		}
		if(f==0)
		{
			System.out.println("pin does not match with existing pin!");
//			System.exit(0);
		}
	}
	
	public void updatePhoneNumber(long phone)
	{
		System.out.println("Enter existing phone number : ");
		long ph = sc.nextLong();
		if(phone==ph)
		{
			int n = 3;
			while(n>0)
			{
				System.out.println("Enter new phoneNumber : ");
				long nphone = sc.nextLong();
				System.out.println("re-type phoneNumber : ");
				long rphone = sc.nextLong();
				
				if(nphone==rphone)
				{
					this.phone = nphone;
					System.out.println("phone number updated");
					break;
				}else {
					System.out.println("phone number does not match! left chances "+(--n));	
				}
			}
		}else {
			System.out.println("phone number does not match with existing phone number!");
		}
	}
	
	public void countNotes(float amount)
	{
		float two_k=0, five_k=0, two_h=0, one_h=0;
		
		if(amount>=2000)
		{
			two_k = amount/2000;
			amount %= 2000;
		}
		if(amount>=500)
		{
			five_k = amount/500;
			amount %= 500;
		}
		if(amount>=200)
		{
			two_h = amount/200;
			amount %= 200;
		}
		if(amount >= 100)
		{
			one_h = amount/100;
			amount %= 100;
		}
		System.out.println("2000 notes are : "+(int) two_k);
		System.out.println("500 notes are : "+(int) five_k);
		System.out.println("200 notes are : "+(int) two_h);
		System.out.println("100 notes are : "+(int) one_h);		
	}
	
	
	
	public void displayOption()
	{
		try {
			Thread.sleep(2000);
			int ch;
		do {
			System.out.println("1. Credit Amount \t2. Debit Amount \t3. View Balance \n4. Pin Changed \t5. Phone Number Update \t6. Exit");
			System.out.println("Enter Option to perform operation : ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 : creditAmount();
				break;
				case 2 : debitAmount();
				break;
				case 3 : viewBalance(totalAmount);
				break;
				case 4 : updatePin(password);	
				break;
				case 5 : updatePhoneNumber(phone);
				break;
				case 6 : System.out.println("Thank You!");
					System.exit(0);
				break;
				default :System.out.println("Choose Wrong Option! try again");
				break;
			}
		} while (ch!=6);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		ATM a = new ATM();
		System.out.print("Enter username: ");
	    String userName = a.sc.next();
	    System.out.print("Enter password: ");
	    String password = a.sc.next();
		a.checkLogin(userName, password);
		
	}
}
