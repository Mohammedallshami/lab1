/**
 * Created by Ahmed on 2/2/2022.
 */
public interface Queue <E> {
    boolean isEmpty();
    int size();
    void enqueue (E element);
    E dequeue();
    E first ();
}
