//Write a program that takes a list of integers as input and returns the largest integer in the list.
import java.util.*;
class Largestinteger{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<4;i++){
      list.add(sc.nextInt());
    }
    System.out.println(list);
    Integer max=Collections.max(list);
    System.out.println("largest integer is:"+max);
  }
}