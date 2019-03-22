package java5;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"±è¾¾", "¹Ú¾¾", "Á¤¾¾" };
		System.out.println(friends.length);
		
		for (String f : friends) {
			System.out.println(f);
		}
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
	}

}
