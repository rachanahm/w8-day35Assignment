//Write a program that takes a list of strings as input and returns a new list that contains only the strings that have length greater than 5.
import java.util.*;
class Stringlength{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<String> ls=new ArrayList<String>();
    for(int i=0;i<5;i++){
      ls.add(sc.next());
    }
    System.out.println(ls);
    List<String> newls=new ArrayList<String>();
    for(String str:ls){
      if(str.length()>5){
        newls.add(str);
    }
  }
    System.out.println(newls);
}
}