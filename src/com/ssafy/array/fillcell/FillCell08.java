package com.ssafy.array.fillcell;
import java.util.Scanner;
/**
 * 여러개의 좌표를 입력 받아 해당 좌표 상하 좌우에 지정한 칸수까지 1을 누적한 후 
 * 누적 값 중에 최대값 출력하기
 * 
 * 입력 :
 *  다음줄 부터 :  배열의 개수  좌표개수  {row좌표, column좌표}*좌표개수
 *  8 4 3 1 1 3 1 3 3 4 2
 * 
 */
public class FillCell08 {
	static int AnswerN;
	public static void main(String[] args) {
		Scanner sc = new Scanner("8 4 3 1 1 3 1 3 3 4 2");
//		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		int dir[][] = {{-1, 0},{1,0},{0,-1},{0,1}};
		
		while(sc.hasNext()) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			for(int i=0; i<dir.length; i++) {
				int nr = r + dir[i][0];
				int nc = c + dir[i][1];
				if(nr > -1 && nr < N && nc > -1 && nc < N) {
					map[nr][nc] += 1;
					AnswerN = Math.max(AnswerN, map[nr][nc]);
				}	
			}
		}
			
		System.out.println("최대 누적 :"+AnswerN);
		
	}
}
