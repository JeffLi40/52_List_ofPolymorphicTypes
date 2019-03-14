public class List_inArraySlots{

	private Object[] elements;
	private int filledElements; //Number of elements in list

	private static final int INITIAL_CAPACITY = 10;
	
	//Construct list with small initial capacity
	public List_inArraySlots() {
		elements = new Object[INITIAL_CAPACITY];
	}
	
	//@return string representation of list in [a, b, c, ] format
	public String toString() {
		String s = "[";
		for(Object obj : elements) {
			s += obj + ", ";
		}
		return s + "]";
	}
	
	//@return the number of elements in the list
	public int size() {
		return filledElements;
	}
	
	//adds a value to the end of the list
	//@return true
	public boolean add(Object obj){
		if (elements.length == filledElements) expand();
		elements[filledElements] = obj;
		filledElements++;
		return true;
	}
	
	public boolean add(int n){
		return add(new Integer(n));
	}
	
	public boolean add(double d){
		return add(new Double(d));
	}
	
	public boolean add(boolean b){
		return add(new Boolean(b));
	}

	//Doubles the capacity of the list
	public void expand() {
		Object[] dummyArr = new Object[elements.length * 2];
		for(int index = 0; index < filledElements; index++) {
			dummyArr[index] = elements[index];
		}
		elements = dummyArr;
	}
	
	//@return element of specified index of the list
	public Object get(int index) {
		return elements[index];
	}
	
	
}
