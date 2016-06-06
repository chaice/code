import java.util.Scanner;
class  test
{
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("请输入成绩:");
	int score =s.nextInt();
	if(score>90){
		System.out.println("奖励一个手机");
	}else{
		System.out.println("什么也没有");
	 }
	}
}
