package core;

import java.util.ArrayList;

public class Stack implements Istack {
	private ArrayList<Integer> stack;
	
	public Stack() {
		stack = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public void push(Integer item) {
		// TODO Auto-generated method stub
		stack.add(item);
	}

	@Override
	public Integer pop() {
		if(isEmpty()) {
		// TODO Auto-generated method stub
		return null;
		}
		return stack.remove(stack.size()-1);
	}

	@Override
	public Integer peek() {
		if(isEmpty()) {
			// TODO Auto-generated method stub
			return null; 
		}
		return stack.get(stack.size()-1);
	}
}

