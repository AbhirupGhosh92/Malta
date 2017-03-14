import Exceptions.ElementNotFoundException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new ElementNotFoundException("test");
		} catch (ElementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("adasd");
	}

}
