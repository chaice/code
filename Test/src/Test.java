/*问答题部分：
 * 1.①nba.hupu.com;②www.csdn.net;③nba_腾讯体育;④知乎;⑤twitter.com
 * 2.厂商对容量的计算方法和操作系统的计算方法有不同而造成的.
 * 3.== 左右两边比较的是数值类型可以不同,比较的基本数据类型,equals比较的是引用数据类型.
 * 4.静态变量:也叫类变量,声明的时候要加static关键字,存放在静态域中,可以通过"类.变量名"调用;
 *   实例变量:声明的时候不需要static关键字,只有在创建对象后,通过"对象.变量名"调用.
 * 5.Integer:int类型的包装类,是引用数据类型;
 *   int:基本数据类型
 * 6.重写:前提是有子类继承父类,子类继承父类以后,父类的方法对子类不适用,子类对父类的方法的重新构建;
 *   重载:在一个类中,多个方法的方法名相同,参数不同(个数不同、类型不同).
 * 7.抽象类:为了当父类出现,没有方法体,不能被实例化只能被继承.
 * 8.接口:多态的一种表现形式,不能被实例化,只能被实现.
 * 9.hashCode:返回的是对象的哈希码值;
 *   equals:比较的是引用数据变量在堆空间对象实体的首地址值,返回的结果是true或false.
 * 10.String和Integer类不能被继承.
 * 11.String:类,代表字符串;
 *    StringBuffer:String的字符缓冲区,线程安全;
 *    StringBulider:String的字符缓冲区,速度比StringBuffer快,线程不安全.
 * 12.使用split()方法,返回字符串数组.
 * 13.final:定义常量时使用;
 *    finally:捕获异常,与try、catch一起使用,无论是否异常都会执行.
 * 14.error:是仅靠程序本身无法恢复的严重错误;
 *    exception:程序在运行过程中发生的不正常事件,会中断正在运行的程序.
 * 15.①ArithmeticException;②NullPointerException;③ArrayIndexOutofBoundsException.
 * 16.实现多线程的方法:①继承Thread类 ②实现Runnable接口;
 *    启动多线程:start()方法.
 * 17.多个线程对一个对象的实例变量进行操作时,会引起线程安全问题.
 * 18.①同步代码块,把需要被同步的代码用synchronized关键字包起来;
 *    ②同步方法,将操作共享数据的方法声明为synchronized;
 *    ③同步锁,创建ReentrantLock类的对象，通过"对象.lock()"来获取锁.
 * 19.新建-就绪-运行-死亡  阻塞.
 * 20.Collection:它是一个接口,表示一组对象.
 *    Collections:它是一个类,由collection上进行操作或返回 collection 的静态方法组成
 * 21.List:存储有序,可重复的元素;
 *    Set:存储无序,不可重复的元素.
 * 22.序列化:把对象转化成二进制，存储到硬盘上或通过网络传输.
 * 23.基本数据类型        对应的封装类                    
 byte        Byte
 short       Short
 int         Integer 
 long        Long
 float       Float 
 double      Double
 char        Character 
 boolean     Boolean
 作用:把基本数据类型转化为引用数据类型
 * 24.java中所有类的根类是Object类,常用的方法有:equals()比较两个对象是否相等,toString()返回该对象的字符串表示.
 * 25.通过接口实现某些功能.
 * 26.Exception:①运行时异常②非运行时异常
 * 27.守护线程：主线程结束,子线程也会结束,两者有一定的时间差;
 *    通过"子线程.setDaemon(true)"来实现.
 * 28.join线程:独占线程资源;
 *    通过"线程.join()"来实现.
 * 29.①封装性
 *    ②多态性
 *    ③继承性
 * 30.JDK:java开发工具;
 *    JRE:java运行环境;
 *    JVM:java虚拟机,负责指令、管理数据、内存.
 * 31.javaSE,javaEE,javaME.
 * 32.Linux.
 * 33.先把八进制、十六进制的数转化为十进制的再保存.
 * 34.char类型可以存储汉字.char型变量是用来存储Unicode编码字符的,Unicode编码中包含汉字.
 * 35. boolean类型的值有true和false，不能用0和1代替.
 * 36.switch()括号内只能传变量，if()括号内传条件表达式.
 * 37.break关键字:表示结束当前循环.
 * 38.int[] i = new int[5];
 *    System.out.println(i[6]);
 * 39.IDE:集成开发环境.
 * 40.private:只能在本类中被使用;
 *    缺省(default):同一个包的类中访问;
 *    protected:同一个包中、子类可以被访问;
 *    public:不同包也可以使用，权限最大.
 * 41.String t= null;
	  System.out.println(t.equals("O"));   
 * 42.作用:创建对象,给对象进行初始化;
 *    "对象.方法"调用.
 * 43.扩展性变强.
 * 44.super().父类方法名.
 * 45.super().
 * 46.this.方法名().
 * 47.同种事物在不同环境下的不同表现形态.
 * 48.通过"类名.方法名()"调用.
 * 49.静态方法中可以调用普通方法.
 * 50.静态块:
 * 51.提高代码的重用率.
 * 52.
 * 53.throw e;.
 * 54.throws Exception.
 * 55.我想做一个篮球系列的网站
 */
public class Test {

	public static void main(String[] args) throws Exception {
		System.out.println(sum(8));
		String s = "xxx";
	}

	static int sum(int i) {
		if (i == 1) {
			return 10;
		} else {
			return sum(i - 1) + 2;
		}
	}
}
