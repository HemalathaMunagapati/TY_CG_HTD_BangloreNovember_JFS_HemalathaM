public class TestGeneration {
	public static void main(String[] args) {
		FirstGeneration fg=new FirstGeneration();
		fg.call();
		fg.text();
		SecondGeneration sg=new SecondGeneration();
		sg.call();
		sg.text();
		sg.radio();
		ThirdGeneration tg=new ThirdGeneration();
		tg.call();
		tg.text();
		tg.radio();
		tg.videoCalling();
		//up-casting techniques
		FirstGeneration fg1=new SecondGeneration();
		fg1.call();
		fg1.text();
		SecondGeneration sg1=new ThirdGeneration();
		sg1.call();
		sg1.text();
		sg1.radio();
		
		
	}

}
