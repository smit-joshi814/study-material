package string;

class SortString {
	static String arr[] = { "Now", "is", "the", "for", "all", "good", "man", "to", "come", "to", "the", "aid", "of",
			"their", "country" };

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[i]) < 0) { // also compareToIgnoreCase can be used
					String t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			System.out.println(arr[i]);
		}
	}
}