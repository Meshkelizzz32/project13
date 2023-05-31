package project1;

@ExtractInterface("IDivider")
public class Divider {
	public int divide(int x, int y) throws ArithmeticException{
		if(y==0)
			throw new ArithmeticException("Devide by 0");
		int diff=substract(x,y);
		if(diff<0)
			return 0;
		if(diff==0)
			return 1;
		int total=0;
		while(diff>=0) {
			total++;
			diff=substract(diff,y);
		}
		return total;
	 }
		  private int substract(int x, int y) { return x - y; }
		  
	public static void main(String[] args) {
		Divider  d = new Divider ();
	    System.out.println("1100/10 = " + d.divide(1100, 10));
	  }

}
