package arithmetic.test.linkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Linked {
    LinkedNode root;

    public void addNode(LinkedNode node){
        LinkedNode tempRoot = root;
        if(tempRoot == null){
            root = node;
            return;
        }
        else{
            while(tempRoot.next != null){
                tempRoot = tempRoot.next;
            }
            tempRoot.next = node;
            node.previous = tempRoot;
        }
    }
    public void traverse(){

    }

    public static void main(String[] args){
        Linked linked = new Linked();
        linked.addNode(new LinkedNode());
        System.out.println();
    }
}
