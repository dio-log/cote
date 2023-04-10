package cote.level_1;

import java.util.Arrays;

//로또의 최고 순위와 최저 순위
public class Q007 {
	public static void main(String[] args) {
		int[] win = {38, 19, 20, 40, 15, 25};
		int[] lottos = {0, 0, 0, 0, 0, 0};
		solution01(lottos,win);
	}

	public static int[] solution01(int[] lottos, int[] win_nums) {
		int[] answer = {};
		// 0. 최고순위, 최저순위 리턴
		// 1. 일치하는숫자 개수 ,0의 개수 구하기
		// 2. 0의 개수가 다 맞을 경우랑 아닐 경우
		
		int cnt = 0;
		int zeroCnt = 0;
		for(int i : lottos) {
			if(i==0) {
				zeroCnt++;
				continue;
			}
			for(int j : win_nums) {
				if(i==j) {
					cnt++;
					break;
				}
			}
		}
		return new int[] {getRank(cnt+zeroCnt), getRank(cnt)};
	}
	public static int getRank(int cnt) {
		return cnt < 1 ? 6 : 7-cnt;
	}
	
	public static int[] solution02(int[] lottos, int[] win_nums) {
		int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int answer = 0;
        int hidden = 0;

        Arrays.sort(win_nums);
        for (int i = 0; i < lottos.length; i++)
            if (Arrays.binarySearch(win_nums, lottos[i]) > -1)
                answer++;
            else if (lottos[i] == 0)
                hidden++;

        return new int[] {rank[answer + hidden], rank[answer]};
	}

}
