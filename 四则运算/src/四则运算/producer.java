package 四则运算;

import java.util.Random;
import java.util.Scanner;

public class producer {
public static void main(String arg[])
{
	int answer;//存储答案
	int success;//出题判断标志
	int t_answer=0;//答对的题目总数
	int left;
	int right;
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("请输入要出的题目个数：");
	int p_number=scanner.nextInt();
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;
		switch (r) {
		case 1:
			do{
			int left1=random.nextInt(101);
			int right1=random.nextInt(101);
			left=left1;
			right=right1;
			answer=left+right;
			}while(answer>100);
			System.out.println(left+"+"+right+"=");
			System.out.println("请回答：");
			int u_answer1=scanner.nextInt();
			if(u_answer1==answer)
			{
				System.out.println("答案正确");
				t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 2:
			do{
			int left2=random.nextInt(101);
			int right2=random.nextInt(101);
			left=left2;
			right=right2;
			answer=left-right;
			}while(answer<=0);
			System.out.println(left+"-"+right+"=");
			System.out.println("请回答：");
			int u_answer2=scanner.nextInt();
			if(u_answer2==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 3:
			do{
			int left3=random.nextInt(101);
			int right3=random.nextInt(101);
			left=left3;
			right=right3;
			answer=left*right;
			}while(answer>100);
			System.out.println(left+"*"+right+"=");
			System.out.println("请回答：");
			int u_answer3=scanner.nextInt();
			if(u_answer3==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 4:
			do{
			int left4=random.nextInt(101);
			int right4=random.nextInt(101);
			success=left4%right4;
			left=left4;
			right=right4;
			answer=left/right4;
			}while(success!=0);
			System.out.println(left+"/"+right+"=");
			System.out.println("请回答：");
			int u_answer4=scanner.nextInt();
			if(u_answer4==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		}
	}
	System.out.println("您的得分是"+t_answer*100/p_number);
	t_answer=0;
}
}