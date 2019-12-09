public class Chips {
	void open()
	{
		System.out.println("open the pack");
	}
	void eat() {
		System.out.println("eat the chips");
	}

}
class Lays extends Chips{
	void open() {
		System.out.println("Open the lays pack");
	}
	void eat() {
		System.out.println("eat the lays");
	}
}
class Kurkure extends Chips{
	void open() {
		System.out.println("open the kurkure pack");
	}
	void eat() {
		System.out.println("eat the kurkure");
	}
}
class Bingo extends Chips{
	void open() {
		System.out.println("open the Bingo pack");
	}
	void eat() {
		System.out.println("eat the bingo");
	}
}
