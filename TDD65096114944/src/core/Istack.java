package core;

public interface Istack {
	boolean isEmpty() ;
	int getSize() ;
	void push(Integer item);
	Integer pop();
	Integer peek();
}
