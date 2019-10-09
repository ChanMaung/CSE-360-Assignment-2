package cse360assign2;

public class AddingMachine {

	private int total;
	private String history = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	/**
	 *  Add the parameter to the variable total.
	 *  
	 *  @param	value	the value to add.
	 */
	public void add (int value) {
		
		total = value + total;
		history = history + " + " + value; 
		
	}
	
	/**
	 *  Subtract the parameter from the variable total.
	 *  
	 *  @param	value	the value to subtract.
	 */
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value; 
		
	}
	
	/**
	 *  Return a list of operations in order stored in String history.
	 */	
	public String toString () {
		System.out.println(history);
		return history;
	}

	public void clear() {
		
		total = 0;
		history = "0";
	
	}
	
	


public static void main (String[] args) {
	
	AddingMachine test = new AddingMachine();
	test.add(4);
	test.subtract(2);
	test.add(5);
	test.toString();
	}
}



