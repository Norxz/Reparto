package dataStructures;

import objects.Boxes;

/**
 *
 * @author lokci
 */
public class Sort {

    /**
     *
     * @param list
     */
    public static void insertionSort(List<Boxes> list) {
        for (int i = 1; i < list.size(); i++) {
            Boxes key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getDistance() > key.getDistance()) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
    }
}
