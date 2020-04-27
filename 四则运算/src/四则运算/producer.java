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
	int u_answer;
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("请输入要出的题目个数：");
	int p_number=scanner.nextInt();/*输入的出题数目*/
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;/*随机式子类型判断*/
		switch (r) {
		case 1:
			/*产生加法式*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left+right;
			}while(answer>100);
			System.out.println(left+"+"+right+"=");
			System.out.println("请回答：");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
				System.out.println("答案正确");
				t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 2:
			/*产生减法式*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left-right;
			}while(answer<=0);
			System.out.println(left+"-"+right+"=");
			System.out.println("请回答：");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 3:
			/*产生乘法式*/
			do{
			left=random.nextInt(101);
			right=random.nextInt(101);
			answer=left*right;
			}while(answer>100);
			System.out.println(left+"*"+right+"=");
			System.out.println("请回答：");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		case 4:
			/*产生除法式*/
			do{
			left=random.nextInt(101);
			right=1+random.nextInt(101);
			success=left%right;
			answer=left/right;
			}while(success!=0);
			System.out.println(left+"/"+right+"=");
			System.out.println("请回答：");
			u_answer=scanner.nextInt();
			if(u_answer==answer)
			{
			System.out.println("答案正确");
			t_answer++;
			}
			else 
			System.out.println("答案错误");
			break;
		}
	}
	System.out.println("您的得分是"+t_answer*100/p_number);/*计算并打印得分*/
	t_answer=0;
}
}