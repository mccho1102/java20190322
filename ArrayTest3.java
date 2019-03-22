package java5;

public class ArrayTest3 {

	public static void main(String[] args) {
		//취미 리스트 5개를 넣어서 출력
		System.out.println("취미가 어떻게 되요?");
		
		String[] a = {"컴퓨터", "운동", "모바일게임", "여행", "맛집"};
		System.out.println(a.length);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	
	}

}
