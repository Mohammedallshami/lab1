/**
 * Created by Ahmed on 2/10/2022.
 */
public interface Stack <E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}

