/*�����1-100�����е�����
����������1�����������ⲻ���������ĳ�����������С��������2��Ҳ���Խ���������������/����
*/
class  Testzhishu{
	public static void main(String[] args) {
		boolean flag=false;
		long start=System.currentTimeMillis();//��ȡϵͳ��ǰ�ĺ�����
		for(int i=2;i<=100;i++){
           for(int j=2;j<i;j++){// �ı�ѭ������������ʹj<Math.sqrt(i)=i������(������)
		    if(i%j==0){
			   flag =true;
			   break;//��һ��������������ֹ
			}
		   }
		   if(flag==false){
			   System.out.println(i);
		   }
		   flag =false;
		}
		long end=System.currentTimeMillis();
		System.out.println("���ѵ�ʱ��Ϊ:"+(end-start));
		
	}
}