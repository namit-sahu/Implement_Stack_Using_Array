class Stack{
    int [] arr=new int[5];
    int top=-1;
    int size;
    void push(int val){
        if(size==arr.length-1){
            System.out.println("Stack is Overflow!");
            return;
        }
        top++;
        arr[top]=val;
        size++;
    }
    void pop(){
        if(size==0){
            System.out.println("Stack is Empty!");
            return;
        }
        top--;
        size--;
    }
    int peek(){
        if(size==0){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(size==0){
            System.out.println("Stack is Empty!");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
public class Implement_Stack_Using_Array {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
        st.pop();
        st.display();
        System.out.println( st.peek());

    }
}
