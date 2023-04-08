//Write a program that takes a list of strings as input and returns the concatenated string of all the elements in the list
import java.util.*;
class Concatstring{
  public static void main(String args[]){
    List<String> strings = new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        String newstr="";
        for(int i=0;i<4;i++){
          strings.add(sc.next());
        }
    System.out.println(strings);
    for(String str:strings){
      newstr=newstr+str;
    }
    System.out.println(newstr);
  }
}
