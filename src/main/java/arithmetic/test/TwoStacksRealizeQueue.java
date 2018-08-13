package arithmetic.test;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Stack;

@AllArgsConstructor
@NoArgsConstructor
public class TwoStacksRealizeQueue {
    public static final int number = 10;
    Stack<String> first;
    Stack<String> second;

    public void push(String element){
        if(first.size() == number){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
        }
        first.push(element);
    }

    public String pop(){
        if(second.isEmpty()){
            return null;
        }
        return second.pop();
    }

    public static void main(String[] args){
        Stack<String> first = new Stack<String>();
        Stack<String> second = new Stack<String>();
        first.setSize(number);
        second.setSize(number);
        TwoStacksRealizeQueue twoStacksRealizeQueue = new TwoStacksRealizeQueue(first, second);
    }
}
