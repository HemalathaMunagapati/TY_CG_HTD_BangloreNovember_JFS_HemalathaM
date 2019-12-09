public class Bank {
	void withdraw()
	{
		System.out.println("Withrawl an amount");
	}
	void swipe()
	{
		System.out.println("Swipe the card");
	}

}
class Sbi extends Bank{
	void swipe()
{
System.out.println("swipe the sbi card");		
}
	void withdraw() {
		System.out.println("Withdrawl an amount from sbi");
	}
}
class Hdfc extends Bank{
	void swipe() {
		System.out.println("swipe the hdfc card");
	}
	void withdraw() {
		System.out.println("Withdrawl an amount from hdfc");
	}
}
