/*break:��ʾ������ǰѭ������������Ϊĳ��ֵʱ�˲�ѭ����ֹ
continue:ʹ����ѭ���ṹ�У���������ѭ������������Ϊĳ��ֵʱ�����ֵ��Ӧ��ѭ����������ʼ��һ����
��ǩ(label):�������ɶ��壬����for֮ǰ����ֹ���ѭ��
break��continue��������䣡����
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
