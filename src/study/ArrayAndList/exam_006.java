package study.ArrayAndList;

import java.util.*;
import java.io.*;

//����
//��� �ڿ��� N��, �� ���� ���ӵ� �ڿ����� ������ ��Ÿ�� �� �ִ�. ����� � �ڿ��� N(1 �� N �� 10,000,000)�� ���ؼ�, �� N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� �˰� �;��Ѵ�. �̶�, ����ϴ� �ڿ����� N���Ͽ��� �Ѵ�.
//
//���� ���, 15�� ��Ÿ���� ����� 15, 7+8, 4+5+6, 1+2+3+4+5�� 4������ �ִ�. �ݸ鿡 10�� ��Ÿ���� ����� 10, 1+2+3+4�� 2������ �ִ�.
//
//N�� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù �ٿ� ���� N�� �־�����.
//
//���
//�Էµ� �ڿ��� N�� �� ���� ���ӵ� �ڿ����� ������ ��Ÿ���� �������� ����Ͻÿ�

public class exam_006 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != num) {
			if(sum == num) {
				count++;
				end_index++;
				sum = sum + end_index;
			}
			else if(sum > num) {
				sum = sum - start_index;
				start_index++;
			}
			else if(sum < num) {
				end_index++;
				sum = sum + end_index;
			}
		}
		
		System.out.println(count);
	}

}
