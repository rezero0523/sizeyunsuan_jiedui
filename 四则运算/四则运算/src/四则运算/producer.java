package 四则运算;

import java.util.Random;
import java.util.Scanner;

public class producer {
public static void main(String arg[])
{
	int answer;//存储答案
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("请输入要出的题目个数：");
	int p_number=scanner.nextInt();
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;
		switch (r) {
		case 1:
			int left1=random.nextInt(101);
			int right1=random.nextInt(101);
			System.out.println(left1+"+"+right1+"=");
			answer=left1+right1;
			break;
		case 2:
			int left2=random.nextInt(101);
			int right2=random.nextInt(101);
			System.out.println(left2+"-"+right2+"=");
			answer=left2+right2;
			break;
		case 3:
			int left3=random.nextInt(101);
			int right3=random.nextInt(101);
			System.out.println(left3+"*"+right3+"=");
			answer=left3+right3;
			break;
		case 4:
			int left4=random.nextInt(101);
			int right4=random.nextInt(101);
			System.out.println(left4+"/"+right4+"=");
			answer=left4+right4;
			break;
			
		}
		
	}
}
}