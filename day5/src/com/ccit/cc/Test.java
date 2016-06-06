package com.ccit.cc;
/*接口interface ，与继承类似，可以实现不同类之间。接口之间为有的关系
 * 类只能有一个基类，但是可以有多个接口！接口不可以被实例化，在接口的实现类中必须重写接口内的方法
 * 接口之间可以继承，接口的变量都是静态常量，实现类可以实现多个接口。
 * 接口中的方法为，public abstract void 方法名（   public abstract可以省略
 * 序列化，将对象转化为二进制数据，参与序列化与反序列化的类必须implements实现 java.io.Serializable接口
 * 序列化与反序列化的是对象。
 * 属性不参与序列化，属性前标记transient关键字。
 * 基类可以序列化，子类一定可以序列化，无论子类是否实现java.io.Serializable.
 * 类序列化？没有讲这个！！！属性的引用对象也会被序列化.
 * 匿名局部内部类：接口不能实例化，利用局部内部类实例化，只能声明一次！不需要建立接口的实现类
 * 
 */

public class Test  {
	public static void main(String[] args) {
		UseUsb uu = new UseUsb();
		IUsb iu = new IUsb() {//匿名局部内部类
			
			@Override
			public void dirver() {
				System.out.println("iusb");
				
			}
		};
		uu.use(iu);
		IUsb iu1 = new MoUsb();
		IUsb iu2 = new DiUsb();
		IUsb[] iu3 = { iu1, iu2 };
		for (IUsb iUsb : iu3) {
			uu.use(iUsb);
		}

	}
}
