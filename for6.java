//�Ӽ��̶��������ȷ�������������ж�����������͸����ĸ���������0ʱ������
import java.util.Scanner;
class for6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;//�����ĸ���
		int b=0;//�����ĸ���
		//for(;;){ ����whileҲ����
		while(true){
		System.out.println("������һ������:");
		int sum=s.nextInt();
		if(sum>0)
			a++;
		else if(sum<0)
           b++;
		else 
		 break;
		}
		System.out.println("����һ����"+a);
		System.out.println("����һ����"+b);
	}
}