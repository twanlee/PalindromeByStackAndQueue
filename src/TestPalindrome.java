import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        MyQueue<Character> queue = new MyQueue<Character>();
        MyStack<Character> stack = new MyStack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ của bạn");
        String word = sc.nextLine();
        for(int i=0; i<word.length(); i++){
            queue.enqueue(word.charAt(i));
            stack.push(word.charAt(i));
        }
        queue.show();
        stack.show();
        checkPalindrome(queue, stack, word);
    }

    private static void checkPalindrome(MyQueue<Character> queue, MyStack<Character> stack, String word) {
        int count = 0;
        for (int i = 0; i<word.length(); i++){
            if(stack.pop().equals(queue.dequeue())) count++;

        }

        if (count==word.length()-1) System.out.println("Palindrome");
        else System.out.println("Not");
    }
}
