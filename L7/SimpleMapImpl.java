public class SimpleMapImpl implements SimpleMap {

	private KeyValue[] keys;

	public SimpleMapImpl() {
		this.keys = new KeyValue[1000];
		for (int i = 0; i < 1000; i++) {
			keys[i] = new KeyValue();
		}
	}

	public String put(int key, String name) {
		KeyValue myKey = keys[key];
		StringPointer myStrPnt = new StringPointer(name);
		if (myKey.getFirstString() == null) {
			myKey.setFirstString(myStrPnt);
			return name;
		}

		StringPointer current = myKey.getFirstString();
		while (current.getNextString() != null) {
			current = current.getNextString();
		}
		
		current.setNextString(myStrPnt);
		return name + " has been added to the map.";
		
	}

	public String[] get(int key) {
		int counter = 0;
		StringPointer current = (keys[key]).getFirstString();
		if (current != null) {
			counter++;
			while (current.getNextString() != null) {
				counter++;
				current = current.getNextString();
			}
		}
		String[] returnArray = new String[counter];

		current = (keys[key]).getFirstString();

		for (int i = 0; i < counter; i++) {
			returnArray[i] = current.getValue();
			current = current.getNextString();
		}
		return returnArray;
	}

	public void remove(int key, String name) {
		if ((keys[key]).getFirstString() == null) {
			return;
		}

		StringPointer current = (keys[key]).getFirstString();
		if (current.getValue().equals(name)) {
			(keys[key]).setFirstString(current.getNextString());
			return;
		}

		while (current.getNextString() != null) {
			if (current.getNextString().getValue().equals(name)) {
				current.setNextString(current.getNextString().getNextString());
				return;
			}
		}
		return;
		
	}

	public boolean isEmpty() {
		for (int i = 0; i < 1000; i++) {
			if ((keys[i]).getFirstString() != null) {
				return false;
			}
		}
		return true;
	}

}