package study.ArrayAndList;

import java.util.*;
import java.io.*;

//����
//�� N�� A1, A2, ..., AN�� �־�����. �̶�, ���ӵ� �κ� ������ ���� M���� ������ �������� ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//��, Ai + ... + Aj (i �� j) �� ���� M���� ������ �������� (i, j) ���� ������ ���ؾ� �Ѵ�.
//
//�Է�
//ù° �ٿ� N�� M�� �־�����. (1 �� N �� 106, 2 �� M �� 103)
//
//��° �ٿ� N���� �� A1, A2, ..., AN�� �־�����. (0 �� Ai �� 109)
//
//���
//ù° �ٿ� ���ӵ� �κ� ������ ���� M���� ������ �������� ������ ������ ����Ѵ�.

public class exam_005 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] S = new long[N];
		long[] C = new long[M];
		long answer = 0;
		S[0] = sc.nextInt();
		for(int i=1;i<N;i++) {
			S[i] = S[i-1] + sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			int remainder = (int) (S[i] % M);
			
			if(remainder==0) answer++;
			
			C[remainder]++;
		}
		for(int i=0;i<M;i++) {
			if(C[i] > 1) {
				answer=answer + (C[i] * (C[i]-1) / 2);
			}
		}
		System.out.println(answer);
	}
}
