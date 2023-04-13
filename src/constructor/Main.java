package constructor;

public class Main {

	public static void main(String[] args) {
		Shop s=new Shop("sumanth","sumanth@gmail.com",1000.0f,"L");
		Shopoperation sp=new Shopoperation();
		
		sp.sell(1400);
		System.out.println(sp.buy(s, 1400));
		System.out.println(sp.product(s));
		
		
		
		

	}

}
