import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.print("출력할 구구단 숫자 두개를 적어주세요 :");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		for( int i = 2; i< (first + 1); i++) {
			for(int j = 1; j < (second + 1); j++ ) {
			 System.out.println(i * j);	
			}
		}
	}

//	public static int[] caculate(int times) {
//		int[] result = new int[9];
//		for( int i=0; i < result.length; i++ ) {
//				result[i] = times * (times + 1);
//		}
//		return result;
//	}
//	
//	 public static void print(int[] result) {
//	        for (int i = 0; i < result.length; i++) {
//	        	System.out.println(result[i]);
//	        }
//	    }
	
//	public static void main(String[] args) {
//		int[] result = new int[9];
//		for(int j=2; j < 10; j++) {
//			for( int i=0; i < result.length; i++ ) {
//				result[i] = j * (i + 1);
//			}
//			for(int i=0; i< result.length; i++) {
//				System.out.println(result[i]);
//			}
//			
//		}
		
		
//		System.out.print("구구단 중 출력할 단은? :");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 :" + number);
//		
//		if( number < 2) {
//			System.out.println("2보다 큰 값을 입력해주세요.");
//		} 
//		else if( number > 9) {
//			System.out.println("9보다 낮은 값을 입력해주세요.");
//		} 
//		else 
//		{
//			for( int i =1; i<10; i++) {
//				System.out.println(number * i);
//			}
//		}
		
		
		
	}

