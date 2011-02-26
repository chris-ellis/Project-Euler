/*
 * Chris Ellis
 * 4/3/09
 * Min Heap class
 * 
 * This class implements the binary heap data structure, particularly a Min Heap.
 * As elements are inserted into it, they are placed so as to conform to the heap requirements,
 * i.e. every element is less than its two children.  In this fashion, the root node is 
 * guaranteed to be the smallest element.  Insert operations place elements at the end of the 
 * heap, and bubble them up until heap requirements are met.  Delete operations replace the
 * root with the last element, and bubble it down until heap requirements are met again.
 */

package util;

public class MinHeap {
	// storage for elements
	private Comparable[] stor;
	// amount of elements currently stored
	private int len;
	
	// creates a binary heap with the default size of 10
	public MinHeap()
	{
		this(10);
	}
	
	// creates a binary with an array of size <capacity>
	public MinHeap(int capacity) {
		stor = new Comparable[capacity+1];
		len = 1;
	}
	
	// outputs the contents of the heap for debugging purposes
	public void printHeap() {
		for (int i = 1; i < len; i++) {
			System.out.println(i+ ": "+stor[i]);
		}
	}
	
	// returns the size of the heap
	public int length() {
		return len-1;
	}
	
	// checks to see if the heap contains an object
	public boolean contains(Comparable o) {
		for (int i = 1; i < len; i++) 
			if (stor[i] == o) return true;
		return false;
	}
	
	// inserts element o into the binary heap
	public void insert(Comparable o) {
		// if our list is full, reallocate
		if (len + 1 > stor.length) {
			reallocate();
		}
		
		// put our element in the heap
		stor[len] = o;
		
		// bubble the element up until it is greater than its parent or it is the root
		int cur = len;
		while (cur != 1 && stor[cur].compareTo(stor[p(cur)]) < 0) {
			swap(cur, p(cur));
			cur = p(cur);
		}
		
		// increment the number of used items in the heap
		len++;
	}

	// returns the root (minimum) value of the binary heap
	public Comparable getRoot() {
		return stor[1];
	}
	
	// removes the root (minimum) value of the binary heap and returns it
	public Comparable removeRoot() {
		Comparable retVal = stor[1];
		
		// if the heap is empty
		if (len == 1) {
			// do nothing
		}
		// if the heap has only one element
		else if (len == 2) {
			stor[1] = null;
			len--;
		}
		// otherwise, we have some work to do
		else {
			// decrement the number of elements in the array, replace the root with the last element
			len--;
			stor[1] = stor[len];
			stor[len] = null;
			int cur = 1;
			
			// push down the element while it is greater than any of its children
			// while checking to make sure the children exist
			boolean lcisSmaller = (lc(cur) < len) && (stor[cur].compareTo(stor[lc(cur)]) > 0);
			boolean rcisSmaller = (rc(cur) < len) && (stor[cur].compareTo(stor[rc(cur)]) > 0);
			while (lcisSmaller || rcisSmaller) {
				// if it is greater than both children				
				if (lcisSmaller && rcisSmaller) {
					// swap with the smaller of the children
					if (stor[lc(cur)].compareTo(stor[rc(cur)]) < 0) {
						// left child swap
						swap(cur,lc(cur));
						cur = lc(cur);
					}
					else {
						// right child swap
						swap(cur,rc(cur));
						cur = rc(cur);
					}
				} 
				// only one child is smaller, find out which
				else if (lcisSmaller) { 
					// left child swap
					swap(cur,lc(cur));
					cur = lc(cur);
				}
				else { // it must be the right child
					// right child swap
					swap(cur,rc(cur));
					cur = rc(cur);
				}
				// see if the children are smaller in the element's new position
				lcisSmaller = (lc(cur) < len) && (stor[cur].compareTo(stor[lc(cur)]) > 0);
				rcisSmaller = (rc(cur) < len) && (stor[cur].compareTo(stor[rc(cur)]) > 0);
			}
		}
		return retVal;
	}
	
	// double the size of the heap storage, used when we've run out of space
	private void reallocate() {
		// double the size of stor and copy the elements over
		Comparable[] temp = new Comparable[stor.length*2];
		for (int i = 0; i < stor.length; i++) {
			temp[i] = stor[i];
		}
		stor = temp;
	}
	
	// swaps two values in the heap
	private void swap(int a, int b) {
		Comparable temp = stor[a];
		stor[a] = stor[b];
		stor[b] = temp;
	}
	
	// returns index of the parent
	private int p(int i) {
		return i/2;
	}
	
	// returns the index of the left child
	private int lc(int i) {
		return 2*i;
	}
	
	// returns the index of the right child
	private int rc(int i) {
		return 2*i + 1;
	}
}
