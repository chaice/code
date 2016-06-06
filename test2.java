import java.util.Scanner;//导入Scanner包
class  test2{
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);//造Scanner对象
	System.out.println("请输入num1:");
    int num1=s.nextInt();
	System.out.println("请输入num2:");
	int num2=s.nextInt();
	System.out.println("请输入num3");
	int num3=s.nextInt();
	System.out.println("从大到小的顺序为:");
    if(num1>num2){
	   if(num3>num1){
	   System.out.println(num3+","+num1+","+num2);
	   }else if(num2>num3){
        System.out.println(num1+","+num2+","+num3);        
	   }else {
		   System.out.println(num1+","+num3+","+num2);
	   }
	}else{
		if(num3>num2){
            System.out.println(num3+","+num2+","+num1);
		}else if(num1>num3){
			System.out.println(num2+","+num1+","+num3);
		}else {
			System.out.println(num2+","+num3+"，"+num1);
	    }
	  }
    }
}

