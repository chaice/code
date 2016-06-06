package com.ccit.mysql;

/*·ºÐÍ£º
 * 
 */
public class MyList<T> {
	private T item;
	private MyList<T> next;

	public void add(T item) {

	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public MyList<T> getNext() {
		return next;
	}

	public void setNext(MyList<T> next) {
		this.next = next;
	}

	public void add1(T item){
		MyList<T> temp = this;
		if(temp.item == null){
			temp.item = item;
		}else{
			while(temp.next != null){
				temp = temp.getNext();
			}
			MyList<T> next = new MyList<>();
			next.setItem(item);
			temp.setNext(next);
		}
	}
	public void show(){
		MyList<T> temp = this;
		while(temp != null){
			System.out.println(temp.getItem());
			temp = temp.getNext();
		}
	}
}
