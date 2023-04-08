//Write a program that takes a list of integers as input and returns a new list that contains the squares of all the integers in the original list.
import java.util.*;
class Squareintegers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<4;i++){
      list.add(sc.nextInt());
    }
    System.out.println(list);
    List<Integer> squaredlist=new ArrayList<Integer>();
    for(Integer a:list){
      squaredlist.add(a*a);
    }
  System.out.println(squaredlist);
  }
}