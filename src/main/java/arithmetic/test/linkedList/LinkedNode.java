package arithmetic.test.linkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class LinkedNode {
    int value;
    LinkedNode next;
    LinkedNode previous;
}
