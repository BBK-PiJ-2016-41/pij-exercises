public class GenericMapImpl implements SimpleMap {
	private SingleStackNode<Integer>[] keys;

	public GenericMapImpl() {
		this.keys = new SingleStackNode<Integer>[1000];
		for (int i = 0; i < 1000; i++) {
			keys[i] = new KeyValue(i);
		}
	}

	public void put(int key, <? extends Comparable> name) {
		SingleStackNode<Integer> myKey = keys[key];
		SingleStackNode<?> myElement = new SingleStackNode<?>(name);
		if (myKey.getNext() == null) {
			myKey.setNext(myElement);
			return;
		}
		SingleStackNode<?> current = myKey.getNext();
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(myElement);
		return;
	}
	/* Only returns the pointer to the list of values, as we can't return an array
	*	of different values
	*/
	public SingleStackNode<Integer> get(int key) {
		return keys[key];
	}

	public void remove(int key, <? extends Comparable> name) {
		if ((keys[key]).getNext() == null) {
			return;
		}

		SingleStackNode<?> current = (keys[key]).getNext();
		if (current.getValue().equals(name)) {
			(keys[key]).setNext(current.getNext());
			return;
		}

		while (current.getNext() != null) {
			if (current.getNext().getValue().equals(name)) {
				current.setNext(current.getNext().getNext());
				return;
			}
		}
		return;

	}

	public boolean isEmpty() {
		for (int i = 0; i < 1000; i++) {
			if ((keys[i]).getNext() != null) {
				return false;
			}
		}
		return true;
	}

}
