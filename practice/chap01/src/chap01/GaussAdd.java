package chap01;
import java.util.Scanner;

//가우스 덧셈을 이용해 1+2..n까지의 값을 구하시오 

public class GaussAdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("n 의 값 : ");
		int n = scan.nextInt();
		
		int gsum = 0;
		
		if(n%2 == 0) {// 입력 받은 수가 짝수라면 
			
			gsum = (1+n)*((1+n)/2);
		}
		else {
			gsum = (1+n)*((1+n)/2) - (1+n)/2;
		}
		
		
		System.out.print("1부터 " + n + "까지의 합은 : " + gsum);
		
		
	}

}
