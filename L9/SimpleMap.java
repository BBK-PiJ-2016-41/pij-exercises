/**
* Map from integer to Strings: one to many
*/
public interface SimpleMap {
/**
* Puts a new String in the map.
*/
void put(int key, String name);
/**
* Returns a pointer to all the values associated with the key
*/
SingleStackNode<Integer> get(int key);
/**
* Removes a name from the map.
*/
void remove(int key, String name);
/**
* Returns true if there are no workers in the map,
* false otherwise
*/
boolean isEmpty();
}
