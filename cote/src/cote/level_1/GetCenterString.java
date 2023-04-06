package cote.level_1;

public class GetCenterString {

	public static void main(String[] args) {
		System.out.println(solution01("test"));
	}

	public static String solution01(String s) {
		String answer = "";
		int len = s.length();
		int quotient = len/2;
		int remainder = len%2;
		if(remainder == 0) {
			//짝수일때는 몫과 몫-1 인덱스를 출력
			answer =String.valueOf(s.charAt(quotient-1)) +String.valueOf(s.charAt(quotient));
		}else {
			//홀수일때는 몫의 인덱스만 출력
			answer = String.valueOf(s.charAt(quotient));
		}
		return answer;
	}
	
	public static String solution02(String s) {
		String answer = "";
		
		return answer;
	}
}
