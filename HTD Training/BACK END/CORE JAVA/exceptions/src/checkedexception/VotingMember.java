package checkedexception;

public class VotingMember {
	public static void main(String[] args) {
		Election e1=new Election();
		try {
			e1.vote(17);
		} catch (AgeLimitException e) 
		{
            System.out.println(e.getMessage());		
        }
	}

}
