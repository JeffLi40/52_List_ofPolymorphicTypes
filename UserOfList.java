public class UserOfList{

	public static void main(String[] args) {
		
		List_inArraySlots list = new List_inArraySlots();
		test(list, "empty list");
		
		list.add("element zero");
		list.add(1);
		list.add(3.14);
		list.add(false);
		test(list, "after adding a string, int, double, and boolean");
		
		for(int elemIndex = list.size(); elemIndex < 15; elemIndex++) {
			if (list.size() == 10) System.out.println("expansion expected");
			list.add(-elemIndex);
			test(list, "");
		}
		
	}
		private static void test(List_inArraySlots list, String description) {
		System.out.println( "number of elements: " + list.size() );
        System.out.println( description + ": " + list);
	}
	
}