package ��������;

import java.util.Random;
import java.util.Scanner;

public class producer {

//��У��ģ��
static void check(int answer,int t_answer)
{   
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
    int u_answer;
    System.out.println("��ش�");
    u_answer=scanner.nextInt();
	if(u_answer==answer)
	{
		System.out.println("����ȷ");
		t_answer++;
	}
	else 
	System.out.println("�𰸴���");	
}

//�ӷ�ʽ����
static void p_add(int answer)
{
	int left;
	int right;
	Random random=new Random();
	do{
		left=random.nextInt(101);
		right=random.nextInt(101);
		answer=left+right;
		}while(answer>100);
		System.out.println(left+"+"+right+"=");
}

//����ʽ����
static void p_sub(int answer)
{
	int left;
	int right;
	Random random=new Random();
	do{
		left=random.nextInt(101);
		right=random.nextInt(101);
		answer=left-right;
		}while(answer<=0);
		System.out.println(left+"-"+right+"=");
}

//�˷�ʽ����
static void p_mul(int answer)
{
	int left;
	int right;
	Random random=new Random();
	do{
		left=random.nextInt(101);
		right=random.nextInt(101);
		answer=left*right;
		}while(answer>100);
		System.out.println(left+"*"+right+"=");
}

//����ʽ����
static void p_div(int answer)
{
	int success;//�����жϱ�־
	int left;
	int right;
	Random random=new Random();
	do{
		left=random.nextInt(101);
		right=1+random.nextInt(101);
		success=left%right;
		answer=left/right;
		}while(success!=0);
		System.out.println(left+"/"+right+"=");
}

public static void main(String arg[])
{
	int answer = 0 ;//�洢��
	int t_answer=0;//��Ե���Ŀ����
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
			p_add(answer);
			check(answer,t_answer);
			break;
		case 2:
			/*��������ʽ*/
			p_sub(answer);
			check(answer,t_answer);
			break;
		case 3:
			/*�����˷�ʽ*/
			p_mul(answer);
			check(answer,t_answer);
			break;
		case 4:
			/*��������ʽ*/
			p_div(answer);
			check(answer,t_answer);
			break;
		}
	}
	System.out.println("���ĵ÷���"+t_answer*100/p_number);/*���㲢��ӡ�÷�*/
	t_answer=0;
}
}