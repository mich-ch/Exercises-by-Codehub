package gr.myproj.exercises1;

import java.util.Stack;

class UniqStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    void push(int x)
    {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        }
        else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }

    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

}
