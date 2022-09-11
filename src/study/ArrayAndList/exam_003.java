package study.ArrayAndList;

import java.io.*;
import java.util.*;

//����
//�� N���� �־����� ��, i��° ������ j��° ������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� ���� ���� N�� ���� ���ؾ� �ϴ� Ƚ�� M�� �־�����. ��° �ٿ��� N���� ���� �־�����. ���� 1,000���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� M���� �ٿ��� ���� ���ؾ� �ϴ� ���� i�� j�� �־�����.
//
//���
//�� M���� �ٿ� �Է����� �־��� i��° ������ j��° ������ ���� ����Ѵ�.

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
