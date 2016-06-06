/*break:表示结束当前循环。即当变量为某个值时此层循环终止
continue:使用在循环结构中，结束当次循环。即当变量为某个值时，这个值对应的循环结束，开始下一个。
标签(label):可以自由定义，放在for之前，终止外层循环
break，continue后不能有语句！！！
*/
class Testbreak {
	public static void main(String[] args) {
		label:for(int i=1;i<4;i++){
		    for(int j=1;j<10;j++){
			  if(j%4==0){
				  //break label;
			     continue label;
			  }
			  System.out.print(j);
			}
			System.out.println(j);
		}
	}
}
