package com.lang.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcretaList {

	private List<Object> list=new ArrayList<>();
	
	public void  addObj(Object obj){
		list.add(obj);
	}
	public void removeObj(int index){
		list.remove(index);
	}
	public ConcretaIterator createIterator(){
		return this.new ConcretaIterator();
	}
	private class ConcretaIterator implements MyIterator{

		private int cursor;
		@Override
		public boolean hashNext() {
			// TODO Auto-generated method stub
			return (cursor+1)>list.size()?false:true;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(cursor<list.size()){
				cursor++;
			}
		}
		
	}
}
