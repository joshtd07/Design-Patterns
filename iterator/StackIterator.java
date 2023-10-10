package iterator;

import java.util.*;

/**
 * The StackIterator class provides an iterator for traversing a Stack of strings.
 */
public class StackIterator {
    private Stack<String> items = new Stack<String>();
    private int position;
    Iterator<String> iterator = items.iterator();

    /**
     * Constructs a new StackIterator object for the given Stack of strings.
     *
     * @param items The Stack of strings to be iterated.
     */
    public StackIterator(Stack<String> items) {
        this.items = items;
    }

    /**
     * Checks if there are more elements in the Stack to iterate over.
     *
     * @return true if there are more elements to iterate over, false otherwise.
     */
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    /**
     * Returns the next element in the Stack and advances the iterator position.
     *
     * @return The next element in the Stack, or null if there are no more elements to iterate.
     */
    public String next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
