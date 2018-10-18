package Dana;

public class Stack {
    int top=-1;
    char items[] = new char[50];

    void push(char x)
    { if (top == 49)
        { System.out.println("The stack is full"); }
        else
        { items[++top] = x;
        }
    }

    char pop()
    {
        if (top == -1)
        {
            System.out.println("It's an underflow error");
            return '\0';
        }
        else
        {
            char element = items[top];
            top--;
            return element;
        }
    }

    boolean isEmpty()
    {
        return (top == -1) ? true : false;
    }
}
