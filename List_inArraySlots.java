public class List_inArraySlots{

	private Object[] elements;
	private int filledElements;

	private static final int INITIAL_CAPACITY = 10;
	
	public List_inArraySlots() {
		elements = new Object[INITIAL_CAPACITY];
	}
	
	public String toString() {
		String s = "[";
		for(Object obj : elements) {
			s += obj + ", ";
		}
		return s + "]";
	}
	
	public int size() {
		return filledElements;
	}
	
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

	public void expand() {
		Object[] dummyArr = new Object[elements.length * 2];
		for(int index = 0; index < filledElements; index++) {
			dummyArr[index] = elements[index];
		}
		elements = dummyArr;
	}
	
	public Object get(int index) {
		return elements[index];
	}
	
	
}
