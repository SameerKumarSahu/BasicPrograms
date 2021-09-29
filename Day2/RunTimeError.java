package Day2;

class NoSuchMethodError {

    public void printer(String myString)
    {
          System.out.println(myString);
    }
}

public class RunTimeError {

	public static void main(String[] args) {
		// Creating object of class NoSuchMethodError
        NoSuchMethodError obj = new NoSuchMethodError();
  
        // Now calling print() method which is not present
        obj.printer("Hello World");
		

	}

}
