/*输出从1-100内所有的质数
质数；除了1和它本身以外不再有其他的除数整除，最小的质数是2，也可以叫做素数。被除数/除数
*/
class  Testzhishu{
	public static void main(String[] args) {
		boolean flag=false;
		long start=System.currentTimeMillis();//获取系统当前的毫秒数
		for(int i=2;i<=100;i++){
           for(int j=2;j<i;j++){// 改变循环条件，可以使j<Math.sqrt(i)=i开根号(不明白)
		    if(i%j==0){
			   flag =true;
			   break;//有一次满足条件即终止
			}
		   }
		   if(flag==false){
			   System.out.println(i);
		   }
		   flag =false;
		}
		long end=System.currentTimeMillis();
		System.out.println("花费的时间为:"+(end-start));
		
	}
}
