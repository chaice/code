/*水仙花数：abc=a^3+b^3+c^3
abc为三位数
*/

class for4 {
    public static void main(String[] args) {
		for(int i=100;i<1000;i++){
		int a=i/100;
		int b=(i-a*100)/10;
		int c=i%10;
		if(i==a*a*a+b*b*b+c*c*c){
			System.out.println(i);
		}
		
		}
		int m=1;
        do{
        if(m%2==0){
		System.out.println(m);
		}
		m++;
        }while (m<=20); 
	}
}
