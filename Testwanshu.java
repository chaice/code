/*������һ����ǡ�õ����������ӣ������������Լ����֮�͡�
eg��6=1+2+3
*/
class Testwanshu {
	public static void main(String[] args) {
		int num=0;
		for(int i =1;i<=1000;i++){
		    for(int j =1;j<i;j++){
			    if(i%j==0){//�ж�j�Ƿ�Ϊi��Լ��
				  num +=j;
				}
			}if(i==num){
				  System.out.println(i);
				}
			num=0;//��������numֵ�Ѿ��ı䣬���¸�ֵ
		}

	}
}