import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.incrementa();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrementa();
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
