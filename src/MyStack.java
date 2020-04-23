import java.util.LinkedList;

public class MyStack<T> {
  private LinkedList<T> stack;
  public MyStack(){
      stack = new LinkedList<>();
  }
  public void push(T data){
      stack.addFirst(data);
  }
  public T pop(){
      return stack.removeFirst();
  }
  public int size(){
      return stack.size();
  }
  public void show(){
      for (T x: stack) System.out.println(x);
  }
}
