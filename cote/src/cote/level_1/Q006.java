package cote.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//3진법 뒤집기
public class Q006 {

	public static void main(String[] args) {
		int n = 125;
		char[] charArr = Integer.toString(n,3).toCharArray();
		String tmp = "";
		for(int i = charArr.length-1; i>=0;i--) {
			tmp = tmp + charArr[i];
		}
		
	
	 solution02(45);
	}

	public static int solution01(int n) {
		int answer = 0;
		char[] charArr = Integer.toString(n,3).toCharArray();
		String tmp = "";
		for(int i = charArr.length-1; i>=0;i--) {
			tmp = tmp + charArr[i];
		}
		return Integer.parseInt(tmp, 3);
	}
	
	public static int solution02(int n) {
		int answer = 0;
		String tmp = "";
		while(n>0) {
			tmp = tmp + (n % 3);
			System.out.println(tmp);
			n /= 3;
		}
		return Integer.parseInt(tmp, 3);
	}

}
