
public class p10_5 {

	public static void main(String[] args) {
		
		StackOfIntegers stack = new StackOfIntegers();
		
		int num = 120;
		
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				stack.push(i);
				num /= i;
				i = 1;
			}
		}
		
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

}



class StackOfIntegers {
	  private int[] elements;
	  private int size;
	  public static final int DEFAULT_CAPACITY = 16;

	  /** Construct a stack with the default capacity 16 */
	  public StackOfIntegers() {
	    this(DEFAULT_CAPACITY);
	  }

	  /** Construct a stack with the specified maximum capacity */
	  public StackOfIntegers(int capacity) {
	    elements = new int[capacity];
	  }

	  /** Push a new integer into the top of the stack */
	  public void push(int value) {
	    if (size >= elements.length) {
	      int[] temp = new int[elements.length * 2];
	      System.arraycopy(elements, 0, temp, 0, elements.length);
	      elements = temp;
	    }

	    elements[size++] = value;
	  }

	  /** Return and remove the top element from the stack */
	  public int pop() {
	    return elements[--size];
	  }

	  /** Return the top element from the stack */
	  public int peek() {
	    return elements[size - 1];
	  }

	  /** Test whether the stack is empty */
	  public boolean empty() {
	    return size == 0;
	  }

	  /** Return the number of elements in the stack */
	  public int getSize() {
	    return size;
	  }
	}