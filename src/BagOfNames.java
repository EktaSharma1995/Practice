import java.util.ArrayList;

public class BagOfNames {
	private ArrayList<String> names;

	public BagOfNames() {
		names = new ArrayList<String>();
		names.add("Jill");
		names.add("Jack");
		names.add("Joe");
		names.add("John");
		names.add("Kevin");
	}

	public boolean isKnown(String name) {
		return names.contains(name);
	}

	public boolean sameLength(String name) {
		int nameLength = name.length();
		boolean match = false;

		for (int idx = 0; idx < names.size(); idx++) {
			if (nameLength == names.get(idx).length()) {
				match = true;
				break;
			}
		}
		return match;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BagOfNames bagOfNames = new BagOfNames();
			System.out.println(bagOfNames.isKnown("Mahima"));
			System.out.println(bagOfNames.isKnown("Kevin"));
			System.out.println(bagOfNames.sameLength("Juhi"));
			System.out.println(bagOfNames.sameLength("XY"));

			
	}
}

