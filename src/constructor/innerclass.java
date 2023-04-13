package constructor;

public class innerclass {
	static int a=20;
		
static class out{
			public void date(){
				System.out.println(a);
				
			}
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		out myout=new innerclass.out();
		myout.date();
		
		

	}

}
