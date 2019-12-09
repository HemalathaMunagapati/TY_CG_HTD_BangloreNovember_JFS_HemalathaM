	class Cars extends Vehicle{
		int cost=10000;
		void carDetails()
		{
			int cost=50000;
			System.out.println("Cost of the car:"+cost);
			System.out.println("Cost of the car1:"+this.cost);
			System.out.println("cost of the car2:"+super.cost);
		}
		public static void main(String[] args) {
			Cars c=new Cars();
			c.carDetails();
		}
	}



