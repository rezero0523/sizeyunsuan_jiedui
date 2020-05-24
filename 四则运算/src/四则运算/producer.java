package 四则运算;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class producer {
public int t_answer=0;//记录答对题目数
public boolean com=false;//出题成功判断标志

//答案校验模块
void check(int answer)
{   
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
    int u_answer;
    System.out.println("请回答：");
    while(true){
    try{
    u_answer=scanner.nextInt();
    break;
    }
    catch (Exception e) {
    	System.out.println("您输入的不是正整数，请重新输入");	
		scanner.next();
	}
    }
	if(u_answer==answer)
	{   
		System.out.println("答案正确");
		this.t_answer++;
	}
	else 
	{
	System.out.println("答案错误");	
	}
}

//加法式产生
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

//减法式产生
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

//乘法式产生
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

//除法式产生
int p_div(int left,int right)
{
	int answer;
	int success;//余数判断标志
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
	int answer=0;//存储答案
	int left;//产生式左部
	int right;//产生式右部
	producer producer=new producer();
	@SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	Random random=new Random();
	System.out.println("请输入要出的题目个数：");
	int p_number=0;
	while(true){
	try {
		p_number=scanner.nextInt();/*输入的出题数目*/
		break;
		} catch (Exception e) {
		System.out.println("您输入的不是正整数，请重新输入");	
		scanner.next();
	}
	}
	for(int i=0;i<p_number;i++)
	{
		int r=random.nextInt(4)+1;/*随机式子类型判断*/
		//System.out.println(r);
		while(!(producer.com)){
		left=random.nextInt(101);
		right=random.nextInt(101);
		//System.out.println("("+left+","+right+")");
		switch (r) {
		case 1:
			/*产生加法式*/
			answer=producer.p_add(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 2:
			/*产生减法式*/
			answer=producer.p_sub(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 3:
			/*产生乘法式*/
			answer=producer.p_mul(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		case 4:
			/*产生除法式*/
			answer=producer.p_div(left,right);
			if(producer.com)
			producer.check(answer);
			break;
		  }
		}
		producer.com=false;
	}
	System.out.println("您的得分是"+producer.t_answer*100/p_number);/*计算并打印得分*/
}
}