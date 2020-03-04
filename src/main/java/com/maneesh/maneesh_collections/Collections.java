package com.maneesh.maneesh_collections;
import java.util.*;
import java.io.*;
class SNT1Collection {
	 private Object[] objArray = new Object[10];
	 private int elementCount=0;
	 public void add(Object obj) {
		 if(elementCount==objArray.length) {
			 increaseCapacity();
		 }
		 objArray[elementCount]=obj;
		 elementCount++;
		 
	 }
	 public void increaseCapacity() {
		 int newCapacity=objArray.length*2;
		 Object[] nextArray=new Object[newCapacity];
		 for(int i=0;i<objArray.length;i++) {
			 nextArray[i]=objArray[i];
		 }
		 objArray=nextArray;
	 }
	 public int capacity() {
		 return objArray.length;
	 }
	 public int size() {
		 return elementCount;
	 }
	 public Object get(int index) throws IndexOutOfBoundsException {
		 if(index<0||index>=size()) {
			 throw new IndexOutOfBoundsException();
		 }
		 return objArray[index];
	 }
	 public void remove(int index)  throws IndexOutOfBoundsException{
		 if(index<0||index>=size()) {
			 throw new IndexOutOfBoundsException();
		 }
		 while(index<size()-1) {
			 objArray[index]=objArray[index+1];
		 }
		 index++;
		 objArray[index]=null;
		 elementCount--;
	 }
	  public void display() {
          System.out.print("Displaying list : ");
          for (int i = 0; i < size(); i++) {
                 System.out.print(objArray[i] + " ");
          }
   }
}
	 
   class Collections{
	   public static void main(String[] args) throws IndexOutOfBoundsException {
		   
		   SNT1Collection col = new SNT1Collection();
		   col.add("a");
		   col.add("b");
		   col.add("5");
		   col.add("6.8");
		   col.add("a");
		   col.add(null);
		   col.add(null);
		   col.add("8");
		   col.add("9");
		   col.add("j");
		   col.display();
		   System.out.println(col);
		   System.out.println(col.capacity());
		   System.out.println(col.size());
		   
		  Object obj=(col.get(1));
		   System.out.println(obj);
		  col.remove(2);
		   col.display();
		  
		   
	   }
   }
    	
    
