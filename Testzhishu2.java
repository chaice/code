/*两种求质数的方法：
①：使用标签,congtinue
②：使用临时值flag
*/
class Testzhishu2 {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		label:for(int i = 2;i<101;i++){
                 for(int j = 2;j<i;j++){
			       if(i%j==0){
			        continue label;
	              }
			 }
			 System.out.println(i);
	      } 
         /*  boolean flag=false;
		   for(int i=2;i<101;i++){
		      for(int j=2;j<101;j++){
	             if(i%j==0){
				   flag =true;
				 }
                 if(flag==false){
				   System.out.println(i);
				 }
			  }
			  flag =false;
		   }*/
		long end=System.currentTimeMillis();
		System.out.println("所用时间为："+(end-start));
	}
}
