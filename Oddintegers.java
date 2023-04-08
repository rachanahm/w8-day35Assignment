//Write a program that takes a list of integers as input and returns a new list that contains only the odd integers.
import java.util.*;
class Oddintegers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Integer> list=new ArrayList<Integer>();
    for(int i=0;i<4;i++){
      list.add(sc.nextInt());
    }
    List<Integer> oddNumbers=new ArrayList<Integer>();
    for(Integer number:list){
       if(number%2!=0){
         oddNumbers.add(number);
       }
  }
    System.out.println("odd integer is:"+oddNumbers);
}
}