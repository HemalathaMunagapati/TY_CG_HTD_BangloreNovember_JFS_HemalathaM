package checkedexception;

public class Election {
	void vote(int age) throws AgeLimitException {
		if(age<18) {
			System.out.println("cannot have an eligibility to vote");
			throw new AgeLimitException();
			}
		else
		{
			System.out.println("yes...you are eligible to vote");
		}
	}

}
