/*完数：一个数恰好等于它的因子（这个数的正的约数）之和。
eg；6=1+2+3
*/
class Testwanshu {
	public static void main(String[] args) {
		int num=0;
		for(int i =1;i<=1000;i++){
		    for(int j =1;j<i;j++){
			    if(i%j==0){//判断j是否为i的约数
				  num +=j;
				}
			}if(i==num){
				  System.out.println(i);
				}
			num=0;//流程下来num值已经改变，重新赋值
		}

	}
}
