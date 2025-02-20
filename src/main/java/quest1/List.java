package quest1;

public interface List<E> {
    /**
     * Adds element to the end of this list
     *
     * @return added element
     */
    E add();

    /**
     * Inserts the element to the specified index shifting elements to the right
     *
     * @param index index of this list
     * @return added element
     */
    E add(int index);

    /**
     * Replaces element at the specified index
     *
     * @param element an element for replacing
     * @param index   index of this list
     * @return added element
     */
    E replace(E element, int index);

    /**
     * Removes the first element equals to specified shifting all elements from the right to the left
     *
     * @param element an element to be removed
     * @return added element
     */
    E remove(E element);

    /**
     * Removes element at the specified index shifting all elements from the right to the left
     *
     * @param index index of this list
     * @return added element
     */
    E remove(int index);

    /**
     * Returns the number of elements in this list.
     *
     * @return size of this list
     */
    int size();

    /**
     * Removes all null elements shifting all elements from the right to the left
     */
    void reduce();

    /**
     * Returns new Array of the element of this list
     *
     * @param array to be filled if size is enough otherwise a new Array will be created
     * @return new Array of the element of this list
     */
    E[] toArray(E[] array);

}
