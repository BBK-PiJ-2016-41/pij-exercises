public class ListUtilities {
	public static IntToLink bubblesort(IntToLink firstInt) {
		IntToLink firstElement = firstInt;
		int changes = 0;
		do {
			changes = 0;
			IntToLink current = firstElement;
			while (current.getNextInt().getNextInt() != null) {
				IntToLink next = current.getNextInt();
				if (current == firstElement) {
					if (current.getValue() > next.getValue()) {
						current.setNextInt(next.getNextInt());
						next.setNextInt(current);
						firstElement = next;
					}
				}
				
				IntToLink oneAfter = next.getNextInt();
				if (next.getValue() > oneAfter.getValue()) {
					next.setNextInt(oneAfter.getNextInt());
					oneAfter.setNextInt(next);
					current.setNextInt(oneAfter);
					changes++;
				} else {
					current = current.getNextInt();
				}

			}
		} while (changes != 0);
		return firstElement;
	}

}