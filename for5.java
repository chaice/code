import java.util.Scanner;
class for5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;//�����ĸ���
		int b=0;//�����ĸ���
		for(int i=0;i<10;i++){
		System.out.println("�������"+(i+1)+"����");
		
		int sum=s.nextInt();
		if(sum>0){
		a++;
		}else{
		b++;
		}
		}
		System.out.println("�����ĸ���Ϊ"+a+"��");
		System.out.println("�����ĸ���Ϊ"+b+"��");
	}
}