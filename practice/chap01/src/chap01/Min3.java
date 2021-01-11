package chap01;

public class Min3 {
	
	// 세 값의 최솟값을 구하는 메서드 작성
	
	public static int min3(int a, int b, int c) {
		
		int min = a;
		
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		return min;
	}

	public static void main(String[] args) {
		
		
		System.out.println("min3(1,2,3) = " +  min3(1,2,3));
		System.out.println("min3(2,1,3) = " +  min3(2,1,3));
		System.out.println("min3(3,2,1) = " +  min3(3,2,1));
		

	}

}
