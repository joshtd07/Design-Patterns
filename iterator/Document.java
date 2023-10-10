package iterator;

import java.util.*;

public class Document {
    private String title;
    private Stack<String> undoStack = new Stack<String>();
    private Stack<String> redoStack = new Stack<String>();

    public Document(String title) {
        this.title = title;
    }

    public String makeChange(String change) {
        undoStack.push(change);
        return change;
    }

    public String undoChange() {
        if(!undoStack.isEmpty() && undoStack.peek() != null) {
            String change = undoStack.pop();
            redoStack.push(change);
            return "Undoing change: " + change;
        }
        return " ";
    }

    public String redoChange() {
        if(!redoStack.isEmpty() && redoStack.pop() != null) {
            String change = redoStack.pop();
            undoStack.push(change);
            return "Redoing change: " + change;
        }
        return " ";
    }

    public boolean canUndo() {
        return !undoStack.isEmpty() && undoStack.peek() != null;
    }

    public boolean canRedo() {
        return !redoStack.isEmpty() && redoStack.peek() != null;
    }

    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}