package study.ArrayAndList;

import java.io.*;
import java.util.*;

//문제
//수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
//
//출력
//총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

public class exam_003 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int quizNum = Integer.parseInt(st.nextToken());
		
		long[] array = new long[size+1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1;i<=size;i++) {
			array[i] = array[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int j=0;j<quizNum;j++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(array[b] - array[a-1]);
		}
		
	}

}
