import java.util.*;
class Collectionarray{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("Deepak");
list.add("Mohamed");
list.add("Deepak");
list.add("Mohamed");
Iterator itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}
