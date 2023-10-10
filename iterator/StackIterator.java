package iterator;

import java.util.*;

public class StackIterator {
    private Stack<String> items = new Stack<String>();
    private int position;
    Iterator<String> iterator = items.iterator();

    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    public String next() {
        if(hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
