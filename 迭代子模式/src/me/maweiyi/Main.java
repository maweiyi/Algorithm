package me.maweiyi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
