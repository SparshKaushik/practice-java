// Write a Java program to implement Push and Pop operations of Stack.
// Also ensure stack overflow and underflow conditions are checked while performing push and pop operations respectively.

import java.util.Scanner;

class Stack {
    int[] arr;
    int top;
    int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = element;
            System.out.println("Element pushed successfully");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Element popped successfully");
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Elements in the stack are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class StackTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to push: ");
                    int element = sc.nextInt();
                    s.push(element);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }
}