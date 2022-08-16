public class Bank
{
	private int minimumBalance = 2500;

	public int getMinimumBalance()
	{
		return this.minimumBalance;
	}
	public void setMinimumBalance(int value)
	{
		if (value>2500)
		this.minimumBalance=value;
		else
		System.out.println("Entered value is should be greater than minimumBalance");
	}
}
class AccountHolder
{

	public static void main(String[] args)
	{
		Bank bb=new Bank();
		//System.out.println("Original Balance "+bb.minimumBalance);

		//bb.minimumBalance = 5000; //We can reassign
		//System.out.println("Reassigned value "+bb.minimumBalance);

		int min = bb.getMinimumBalance();
		System.out.println(min);

		bb.setMinimumBalance(2000);
		int mini = bb.getMinimumBalance();
		System.out.println(mini);
		

	}

}