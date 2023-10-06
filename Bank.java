class Bank 
{
	private String acno, acHolderName, ifsc,branch, phoneNo;
	double balance;

	
	Bank(String accno,String acname,String ifscode,String branch,String phno,double bal)
	{
		this.acno = accno;//r
		this.acHolderName = acname;
		this.ifsc = ifscode;//r
		this.branch = branch;
		this.phoneNo = phno;
		this.balance = bal;
	}
	public String getAccNo()
	{
		return acno;
	}
	public String getAcHolderName()
	{
		return acHolderName;
	}
	public String getIfsc()
	{
		return ifsc;
	}
	public String getBranch()
	{
		return branch;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public double getBalance()
	{
		return balance;
	}

	 
	public void setAccHolderName(String acHolderName)
	{
		this.acHolderName = acHolderName;
	}
	public void setBranch(String branch)
	{
		this.branch = branch;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	public void setBalance(double balance)
	{
		this.balance += balance;
	}


	public void details()
	{
		System.out.println("The Bank details -" +ifsc+ ", "+branch);
		System.out.println("The account details are " +acHolderName+ "-"+acno+ "," +phoneNo);
		System.out.println("The balance in this account "+balance);
	}


	public static void main(String[] args) 
	{
		Bank b1 = new Bank("ac123455","Sam","SBT000671","Cnagar","67890567",10000);
		b1.details();
		b1.setPhoneNo("7878787878");
		b1.setBalance(2000);
		b1.details();
					
	}
}
