package ��������;

import java.util.Random;
import java.util.Scanner;

public class producer {
public static void main(String arg[])
{
	int answer;//�洢��
	int success;//�����жϱ�־
	int t_answer=0;//��Ե���Ŀ����
	int left;
	int right;
	int u_answer;
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("������Ҫ������Ŀ������");
	int p_number=scanner.nextInt();/*����ĳ�����Ŀ*/
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;/*���ʽ�������ж�*/
		switch (r) {
		case 1:
			/*�����ӷ�ʽ*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left+right;
			}while(answer>100);
			System.out.println(left+"+"+right+"=");
			System.out.println("��ش�");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
				System.out.println("����ȷ");
				t_answer++;
			}
			else 
			System.out.println("�𰸴���");
			break;
		case 2:
			/*��������ʽ*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left-right;
			}while(answer<=0);
			System.out.println(left+"-"+right+"=");
			System.out.println("��ش�");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("����ȷ");
			t_answer++;
			}
			else 
			System.out.println("�𰸴���");
			break;
		case 3:
			/*�����˷�ʽ*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left*right;
			}while(answer>100);
			System.out.println(left+"*"+right+"=");
			System.out.println("��ش�");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("����ȷ");
			t_answer++;
			}
			else 
			System.out.println("�𰸴���");
			break;
		case 4:
			/*��������ʽ*/
			do{
			left=random.nextInt(101);
			right=1+random.nextInt(101);
			success=left%right;
			answer=left/right;
			}while(success!=0);
			System.out.println(left+"/"+right+"=");
			System.out.println("��ش�");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("����ȷ");
			t_answer++;
			}
			else 
			System.out.println("�𰸴���");
			break;
		}
	}
	System.out.println("���ĵ÷���"+t_answer*100/p_number);/*���㲢��ӡ�÷�*/
	t_answer=0;
}
}