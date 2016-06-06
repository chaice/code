package com.ccit.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

/*Collection接口 
 *1. List 可自由扩展，添加和删除方便,有序的存储一组不唯一的元素。有序指的是按照插入的顺序
 * 增(add(Object o))改(set(int index , Object o))删(remove(Object o))查(get(int index))
 * 
 *List的实现类：①ArrayList(List的主要实现类 )有序的存储一组不唯一的元素
 *  ②LinkedList 存储一组不唯一的元素,链式连接
 *  LinkedList 在内存中的存储是按照hashCode的值来存储的，频繁的是删除和修改的时候使用效率最高
 *  ③Vector 线程安全的，其他与LinkedList一样，太老了！！
 *2.Set 存储一组唯一的元素
 *Set的实现类：①hashSet(Set的主要实现类 )无序的存储一组唯一的数组，在内存上存储是按照元素的哈希码值进行的
 *往Set中存储自定义类的对象时，需要在自定义类内重写hashCode()和equals()方法，防止因为两个相同的元素因为哈希码值得不同
 *而被存入集合中。
 *②treeSet
 *3.Map,<key,value> 每一个key都对应一个value，在Map中元素是成键值对存在的
 *Map的实现类：①hashMap(Map的主要实现类)

 */
public class LList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();// ArrayList 
		al.add(1);
		al.add(new Person("TOM", "12"));
		al.add(2);
		al.add(3);
		al.add(new Person("Tom", "12"));
		
		System.out.println(al.contains(2));
		System.out.println(al.set(2, 3));
		System.out.println(al.size());
		ArrayList al1 = new ArrayList();
		al1.add(11);
		al1.add(12);
		System.out.println(al.addAll(al1));
		System.out.println(al.remove(3));
		System.out.println("使用迭代器遍历");
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("使用for-each遍历");
		for (Object object : al) {
			System.out.println(object);
		}
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("1=========1");
		LinkedList ll = new LinkedList();//LinkedList
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(2);
		
		ll.add(new Person("tom", "12"));
		System.out.println("使用for-each遍历");
		for (Object object : ll) {
			System.out.println(object);
		}
		System.out.println("使用迭代器遍历");
		Iterator it1 = ll.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		System.out.println("2=========2");
		Set s = new HashSet();
		s.add(12);
		s.add("tom");
		s.add(new Person("tom", "14"));
		System.out.println("使用for-each遍历");
		for (Object object : s) {
			System.out.println(object);
		}
		System.out.println("使用迭代器遍历");
		Iterator it2 = s.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println("3=======3");
		Set se = new HashSet();//Set
		se.add(12);
		se.add(new Person("tom", "13"));
		se.add("CC");
		System.out.println(se.contains(12));
		System.out.println("使用for-each遍历");
		for (Object object : se) {
			System.out.println(object);
		}
		System.out.println("使用迭代器遍历");
		Iterator it3 = se.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
		System.out.println("4=========4");
		Map<Integer, Integer> m = new HashMap<>();//Map
		  m.put(1, 4);
		  m.put(2, 1);
		  m.put(3, 2);
		Set s2 = m.keySet();
		for (Object object : s2) {
			System.out.println(object);
		}
		System.out.println(m.get(1));
		Set<Entry<Integer, Integer>> l = m.entrySet();//Map .entrySet( 得到一个Set型的
		System.out.println("使用for-each遍历");
		for (Entry<Integer, Integer> entry : l) {
			String str = entry.getKey() +","+entry.getValue();
			System.out.println(str);
		}
		System.out.println("使用迭代器遍历");
		Iterator it4 = l.iterator();
		while(it4.hasNext()){
			System.out.println(((Entry<Integer, Integer>) it4.next()).getKey());
		}
		System.out.println("5=========5");
	}

}
