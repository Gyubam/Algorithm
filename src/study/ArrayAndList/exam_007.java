package study.ArrayAndList;

import java.util.*;
import java.io.*;

//����
//�ָ��� ö�ⱺ�� �缺�ϱ� ���� ������Ʈ�� ������. �׷��� ��ö������ ���� ö�ⱺ�� ���� ������ ����� �Ͽ���. ��ö������ �ָ��� �� ������ ���Ͽ� ������ �����ϴ� �� �Ʒ��� ���� ����� �߰��ϰ� �Ǿ���.
//
//������ ����� ������ ���� ������ ��ȣ�� ������ �ִ�. 
//������ �� ���� ���� ����µ� �� ����� ������ ��ȣ�� ���ļ� M(1 �� M �� 10,000,000)�� �Ǹ� ������ ����� ���� �ȴ�. 
//��ö������ �ڽ��� ����� �ִ� ��Ḧ ������ ������ �� ���� ���� �� �ִ��� �ñ�������. 
//�̷��� �ñ����� Ǯ�� �ֱ� ���Ͽ� N(1 �� N �� 15,000) ���� ���� M�� �־����� �� �� ���� ������ ���� �� �ִ�����
//���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ��� ����� ���� N(1 �� N �� 15,000)�� �־�����. �׸��� �� ��° �ٿ��� ������ ����µ� 
//�ʿ��� �� M(1 �� M �� 10,000,000) �־�����. 
//�׸��� ���������� ��° �ٿ��� N���� ������ ���� ������ ��ȣ���� ������ ���̿� �ΰ� �־�����.
//������ ��ȣ�� 100,000���� �۰ų� ���� �ڿ����̴�.
//
//���
//ù° �ٿ� ������ ���� �� �ִ� ������ ����Ѵ�.

public class exam_007 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		int num = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());

		int need = Integer.parseInt(st.nextToken());
		int[] array = new int[num];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<num;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int i = 0;
		int j = num - 1;
		
		while(i<j) {
			if(array[i]+array[j] > need) {
				j--;
			}
			else if(array[i]+array[j] < need) {
				i++;
			}
			else {
				count++;
				i++;
				j--;
			}
		}
		
		System.out.println(count);
		br.close();

	}

}
