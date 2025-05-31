import java.util.*;
class Link {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        //  here just add no fn,no implementation

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        list.add("number");// default it take in last index
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");// .get :it used for travel elemt
        }
        System.out.println("null");

        list.remove(3); // ele rem frm index
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

    }
    }

