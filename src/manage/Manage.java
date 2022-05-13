package manage;

public interface Manage<X> {
    void add(X x);

    void display();

    void delete(String name);

    void edit(String name, X x);

    int search(String name);
}
