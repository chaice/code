import java.util.Scanner;
class testswitch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month=s.nextInt();
		System.out.println("����������");
		int day=s.nextInt();
		int sum=0;
		switch(month){
		case 12:
			sum +=30;
		case 11:
			sum +=31;
		case 10:
			sum +=30;
		case 9:
			sum +=31;
		case 8:
			sum +=31;
		case 7:
			sum +=30;
		case 6:
			sum +=31;
		case 5:
			sum +=30;
		case 4:
			sum +=31;
		case 3:
			sum +=29;
		case 2:
			sum +=31;
		case 1:
			sum +=day;
		break;
		default :
			System.out.println("�����������");
		}
		System.out.println("һ����"+sum+"��");
	}
}