package java5;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] friends = {"�达", "�ھ�", "����" };
		System.out.println(friends.length);
		
		for (String f : friends) {
			System.out.println(f);
		}
		
		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
	}

}
