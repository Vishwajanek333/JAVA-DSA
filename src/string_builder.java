public class string_builder {
    public static void main(String [] args){
        StringBuilder sb =new StringBuilder("Tony");
        System.out.println(sb);

        // chart at index 0
        System.out.println(sb.charAt(3));

        // set char : it for replace old value
        sb.setCharAt(2,'e');
        System.out.println(sb);

        // to insert
        sb.insert(2,'b');
        System.out.println(sb);

        // to delete
        sb.delete(0,2);
        System.out.println(sb);

        System.out.println(sb.length());

        // to add or append
        sb.append("hel");
        sb.append("lo");
        System.out.println(sb);



        }
    }

