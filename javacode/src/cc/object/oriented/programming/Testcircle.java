package cc.object.oriented.programming;
//�����������ı�̷����������Cicle����Բ�����
public class Testcircle {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.r = 2.3;
		c.area();
	}

}
class Circle{
	double r;
	public void area(){
		System.out.println(3.14*r*r);
	}
}
