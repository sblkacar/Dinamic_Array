public class Dinamic_Class {
    public static void main(String[] args) {
        MyList<Integer> myList= new MyList<>();
        System.out.println("Liste Durumu :"+(myList.isEmpty()?"boş":"dolu"));
        myList.add(10);
        myList.add(20);
    }

}
