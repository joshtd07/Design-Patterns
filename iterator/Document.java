package iterator;

import java.util.*;

/**
 * The Document class represents a document with a title and supports undo and redo operations on changes made to the document.
 */
public class Document {
    private String title;
    private Stack<String> undoStack = new Stack<String>();
    private Stack<String> redoStack = new Stack<String>();

    /**
     * Constructs a new Document object with the specified title.
     *
     * @param title The title of the document.
     */
    public Document(String title) {
        this.title = title;
    }

    /**
     * Makes a change to the document and pushes it onto the undo stack.
     *
     * @param change The change to be made to the document.
     * @return The change that was made.
     */
    public String makeChange(String change) {
        undoStack.push(change);
        return change;
    }

    /**
     * Undoes the last change made to the document.
     *
     * @return A message indicating the change that was undone, or an empty string if there are no changes to undo.
     */
    public String undoChange() {
        if (!undoStack.isEmpty() && undoStack.peek() != null) {
            String change = undoStack.pop();
            redoStack.push(change);
            return "Undoing change: " + change;
        }
        return " ";
    }

    /**
     * Redoes the last undone change to the document.
     *
     * @return A message indicating the change that was redone, or an empty string if there are no changes to redo.
     */
    public String redoChange() {
        if (!redoStack.isEmpty() && redoStack.pop() != null) {
            String change = redoStack.pop();
            undoStack.push(change);
            return "Redoing change: " + change;
        }
        return " ";
    }

    /**
     * Checks if there are changes that can be undone.
     *
     * @return true if there are changes that can be undone, false otherwise.
     */
    public boolean canUndo() {
        return !undoStack.isEmpty() && undoStack.peek() != null;
    }

    /**
     * Checks if there are changes that can be redone.
     *
     * @return true if there are changes that can be redone, false otherwise.
     */
    public boolean canRedo() {
        return !redoStack.isEmpty() && redoStack.peek() != null;
    }

    /**
     * Gets an iterator for traversing the undo stack.
     *
     * @return A StackIterator for the undo stack.
     */
    public StackIterator getUndoIterator() {
        return new StackIterator(undoStack);
    }

    /**
     * Gets an iterator for traversing the redo stack.
     *
     * @return A StackIterator for the redo stack.
     */
    public StackIterator getRedoIterator() {
        return new StackIterator(redoStack);
    }
}
