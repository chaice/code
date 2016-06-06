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

/*Collection�ӿ� 
 *1. List ��������չ����Ӻ�ɾ������,����Ĵ洢һ�鲻Ψһ��Ԫ�ء�����ָ���ǰ��ղ����˳��
 * ��(add(Object o))��(set(int index , Object o))ɾ(remove(Object o))��(get(int index))
 * 
 *List��ʵ���ࣺ��ArrayList(List����Ҫʵ���� )����Ĵ洢һ�鲻Ψһ��Ԫ��
 *  ��LinkedList �洢һ�鲻Ψһ��Ԫ��,��ʽ����
 *  LinkedList ���ڴ��еĴ洢�ǰ���hashCode��ֵ���洢�ģ�Ƶ������ɾ�����޸ĵ�ʱ��ʹ��Ч�����
 *  ��Vector �̰߳�ȫ�ģ�������LinkedListһ����̫���ˣ���
 *2.Set �洢һ��Ψһ��Ԫ��
 *Set��ʵ���ࣺ��hashSet(Set����Ҫʵ���� )����Ĵ洢һ��Ψһ�����飬���ڴ��ϴ洢�ǰ���Ԫ�صĹ�ϣ��ֵ���е�
 *��Set�д洢�Զ�����Ķ���ʱ����Ҫ���Զ���������дhashCode()��equals()��������ֹ��Ϊ������ͬ��Ԫ����Ϊ��ϣ��ֵ�ò�ͬ
 *�������뼯���С�
 *��treeSet
 *3.Map,<key,value> ÿһ��key����Ӧһ��value����Map��Ԫ���ǳɼ�ֵ�Դ��ڵ�
 *Map��ʵ���ࣺ��hashMap(Map����Ҫʵ����)

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
		System.out.println("ʹ�õ���������");
		Iterator it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("ʹ��for-each����");
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
		System.out.println("ʹ��for-each����");
		for (Object object : ll) {
			System.out.println(object);
		}
		System.out.println("ʹ�õ���������");
		Iterator it1 = ll.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		System.out.println("2=========2");
		Set s = new HashSet();
		s.add(12);
		s.add("tom");
		s.add(new Person("tom", "14"));
		System.out.println("ʹ��for-each����");
		for (Object object : s) {
			System.out.println(object);
		}
		System.out.println("ʹ�õ���������");
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
		System.out.println("ʹ��for-each����");
		for (Object object : se) {
			System.out.println(object);
		}
		System.out.println("ʹ�õ���������");
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
		Set<Entry<Integer, Integer>> l = m.entrySet();//Map .entrySet( �õ�һ��Set�͵�
		System.out.println("ʹ��for-each����");
		for (Entry<Integer, Integer> entry : l) {
			String str = entry.getKey() +","+entry.getValue();
			System.out.println(str);
		}
		System.out.println("ʹ�õ���������");
		Iterator it4 = l.iterator();
		while(it4.hasNext()){
			System.out.println(((Entry<Integer, Integer>) it4.next()).getKey());
		}
		System.out.println("5=========5");
	}

}
