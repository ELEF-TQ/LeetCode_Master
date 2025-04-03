import java.util.*;

class RandomizedSet {
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    private boolean search(int val) {
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
        if (search(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!search(val)) return false;

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap only if it's not the last element
        if (index != list.size() - 1) {
            list.set(index, lastElement);
            map.put(lastElement, index);
        }

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
