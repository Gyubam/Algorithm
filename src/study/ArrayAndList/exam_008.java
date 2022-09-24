package study.ArrayAndList;

import java.io.*;
import java.util.*;

//����
//N���� �� �߿��� � ���� �ٸ� �� �� ���� ������ ��Ÿ�� �� �ִٸ� �� ���� ������(GOOD)���� �Ѵ�.
//
//N���� ���� �־����� �� �߿��� ���� ���� ������ �� ������ ����϶�.
//
//���� ��ġ�� �ٸ��� ���� ���Ƶ� �ٸ� ���̴�.
//
//�Է�
//ù° �ٿ��� ���� ���� N(1 �� N �� 2,000), �� ��° �ٿ��� i��° ���� ��Ÿ���� Ai�� N�� �־�����. (|Ai| �� 1,000,000,000, Ai�� ����)
//
//���
//���� ���� ������ ù ��° �ٿ� ����Ѵ�.

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
