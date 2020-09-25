package lesson_9.exercises.homework;

/**
 * Write a generic class Pair which has two type parameters—F and S— each representing the type of the first and second
 * element of the pair, respectively. Add get and set methods for the first and second elements of the pair. [Hint: The
 * class header should be public class Pair<F, S>.]
 */

public class Pair<F, S> {
    public F first;
    public S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(F input) {
        this.first = input;
    }

    public void setSecond(S input) {
        this.second = input;
    }

    public F getFirst() {
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }

}
