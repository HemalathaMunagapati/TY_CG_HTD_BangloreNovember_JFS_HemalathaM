public class AtmMachine {
void insert(Bank b)
{
	System.out.println("given card is accepted");
	b.swipe();
	b.withdraw();
}
public static void main(String[] args) {
	AtmMachine am=new AtmMachine();
	Bank b =new Bank();
	Sbi sb=new Sbi();
	Hdfc hd=new Hdfc();
	am.insert(sb);
	
}
}
