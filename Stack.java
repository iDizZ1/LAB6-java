class Stack<T> {
    private T[] data;
    private int head;

    public Stack(int capacity){
        this.data = (T[]) new Object[capacity];
        this.head = 0;
    }
    public void push(T element){
        try {
            data[head] = element;
            head += 1;
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Попытка запихнуть в полный стек " + e.getMessage());
        }
    }
    public T pop() {
        if (!isEmpty()) {
            head -= 1;
            return data[head];
        }
        return null;
    }
    public T peek() {
        return isEmpty() ? null : data[head - 1];
    }
    public boolean isEmpty(){
        return head == 0;
    }
}