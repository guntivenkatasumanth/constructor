package constructor;

public class Shopoperation {
	public float buy(Shop s,int price) {
		if(price>1000 && price<1500) {
			System.out.println("buy prduct");
			return price;
		}
		else {
			return 0;
		}
	}
	public void sell(int amount){
		if(amount>500) {
			System.out.println("sell product");
		}
		else {
			System.out.println("add more to the cart");
		}		
	}
	public String product(Shop s) {
	if(s.size=="L") {
		return s.size;
	}
	else {
		return null;
	}
	}
}
