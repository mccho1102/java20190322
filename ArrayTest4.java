package java5;

public class ArrayTest4 {

	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "±è¾¾"; 
		names[1] = "¹Ú¾¾";
		names[2] = "Á¤¾¾";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
			}
}
