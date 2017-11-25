package edu.neu.csye6200;
public class ShowState<T> {

	private T obj;
	
	public ShowState(T obj) {
		this.obj = obj;
	}
	 
	public T getObject() {
		return this.obj;
	}

	public void display() {
		( (Person) this.getObject()).speak();

	}

}
