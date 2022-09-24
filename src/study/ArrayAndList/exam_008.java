package study.ArrayAndList;

import java.io.*;
import java.util.*;

//문제
//N개의 수 중에서 어떤 수가 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
//
//N개의 수가 주어지면 그 중에서 좋은 수의 개수는 몇 개인지 출력하라.
//
//수의 위치가 다르면 값이 같아도 다른 수이다.
//
//입력
//첫째 줄에는 수의 개수 N(1 ≤ N ≤ 2,000), 두 번째 줄에는 i번째 수를 나타내는 Ai가 N개 주어진다. (|Ai| ≤ 1,000,000,000, Ai는 정수)
//
//출력
//좋은 수의 개수를 첫 번째 줄에 출력한다.

public class exam_008 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int result = 0;
		long[] arr = new long[count];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<count;i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int k=0;k<count;k++) {
			long find = arr[k];
			int i = 0;
			int j = count -1 ;
			
			while(i<j) {
				if(arr[i] + arr[j] == find) {
					if(i != k && j != k) {
						result++;
						break;
					}
					else if(i == k) {
						i++;
					}
					else if(j == k) {
						j--;
					}
				}else if(arr[i] + arr[j] < find) {
					i++;
				}else {
					j--;
				}
			}
		}
		
		System.out.println(result);
		br.close();
	}

}
