package study.ArrayAndList;

import java.util.*;
import java.io.*;

// 표 채우기 구간합 문제 

public class exam_004 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int quizNum = Integer.parseInt(st.nextToken());
		
		int[][] array = new int[size+1][size+1];
		
		for(int i=1;i<=size;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=size;j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] sumArray = new int[size+1][size+1];
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				sumArray[i][j] = sumArray[i][j-1] + sumArray[i-1][j] - sumArray[i-1][j-1] + array[i][j];
				
			}
		}
		
		for(int i=0;i<quizNum;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			System.out.println(sumArray[x2][y2] - sumArray[x1-1][y2] - sumArray[x2][y1-1] + sumArray[x1-1][y1-1]);
		}
		
	}

}
