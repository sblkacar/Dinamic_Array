public class MyList<T> {
    private int capacity=10; //array.lenght
    private T[] array;
    private int index=0;
    public MyList() {
        this.array=(T[]) new Object[capacity];
    }
    public MyList(int capacity)//// MyList<Integer> list = new MyList<>();
    {
        this.capacity=capacity;

    }
}
