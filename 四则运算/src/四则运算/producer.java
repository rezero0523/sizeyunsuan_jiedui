package ��������;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class producer {
public int t_answer=0;//��¼�����Ŀ��
public boolean com=false;//����ɹ��жϱ�־

//��У��ģ��
void check(int answer)
{   
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
    int u_answer;
    System.out.println("��ش�");
    while(true){
    try{
    u_answer=scanner.nextInt();
    break;
    }
    catch (Exception e) {
    	System.out.println("������Ĳ���������������������");	
		scanner.next();
	}
    }
	if(u_answer==answer)
	{   
		System.out.println("����ȷ");
		this.t_answer++;
	}
	else 
	{
	System.out.println("�𰸴���");	
	}
}

//�ӷ�ʽ����
int p_add(int left,int right)
{   
	int answer;
	answer=left+right;
	if(answer<=100)
	{
	System.out.println(left+"+"+right+"=");
	this.com=true;
	}
	return answer;
}

//����ʽ����
int p_sub(int left,int right)
{
	int answer;
	answer=left-right;
    if(answer>=0)
	{
	System.out.println(left+"-"+right+"=");
	this.com=true;
	}
	return answer;
}

//�˷�ʽ����
int  p_mul(int left,int right)
{
	int answer;
	answer=left*right;
	if(answer<=100)
	{
	System.out.println(left+"*"+right+"=");
	this.com=true;
	}
	return answer;
}

//����ʽ����
int p_div(int left,int right)
{
	int answer;
	int success;//�����жϱ�־
	success=left%right;
	answer=left/right;
    if(right!=0&success==0)
    {
	System.out.println(left+"/"+right+"=");
	this.com=true;
    }
	return answer;
}

public static void main(String arg[])
{
	int answer=0;//�洢��
	int left;//����ʽ��
	int right;//����ʽ�Ҳ�
	producer producer=new producer();
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("������Ҫ������Ŀ������");
	int p_number=0;
	while(true){
	try {
		p_number=scanner.nextInt();/*����ĳ�����Ŀ*/
		break;
		} catch (Exception e) {
		System.out.println("������Ĳ���������������������");	
		scanner.next();
	}
	}
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;/*���ʽ�������ж�*/
		//System.out.println(r);
		while(!(producer.com)){
		left=random.nextInt(101);
		right=random.nextInt(101);
		//System.out.println("("+left+","+right+")");
		switch (r) {
		case 1:
			/*�����ӷ�ʽ*/
			answer=producer.p_add(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 2:
			/*��������ʽ*/
			answer=producer.p_sub(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 3:
			/*�����˷�ʽ*/
			answer=producer.p_mul(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 4:
			/*��������ʽ*/
			answer=producer.p_div(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		  }
		}
		producer.com=false;
	}
	System.out.println("���ĵ÷���"+producer.t_answer*100/p_number);/*���㲢��ӡ�÷�*/
}
}