package com.ccit.sta;

public class Book {
	private Integer id;
	private String code;//�鼮���
	private String title;
	private String author;
	private String publishing;
	private Integer count;//��Ŀǰ������
	private Integer total;//������
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", code=" + code + ", title=" + title
				+ ", author=" + author + ", publishing=" + publishing
				+ ", count=" + count + ", total=" + total + "]";
	}
	
	

}
