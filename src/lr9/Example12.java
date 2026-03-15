package lr9;

import java.util.*;

public class Example12 {
    private static final int COUNT = 11000000;

    public static void main(String[] args) {
        System.out.println("Количество элементов: " + COUNT);
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        fillCollections(arrayDeque, sortedMap, arrayList);

        Map<String, Map<String, Long>> results = new LinkedHashMap<>();

        results.put("Добавление в начало", compareAddFirst(arrayDeque, sortedMap, arrayList));
        results.put("Добавление в конец", compareAddLast(arrayDeque, sortedMap, arrayList));
        results.put("Добавление в середину", compareAddMiddle(arrayDeque, sortedMap, arrayList));
        results.put("Удаление из начала", compareRemoveFirst(arrayDeque, sortedMap, arrayList));
        results.put("Удаление из конца", compareRemoveLast(arrayDeque, sortedMap, arrayList));
        results.put("Удаление из середины", compareRemoveMiddle(arrayDeque, sortedMap, arrayList));
        results.put("Получение по индексу", compareGetByIndex(arrayDeque, sortedMap, arrayList));

        printResultsTable(results);
    }

    private static void fillCollections(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        for (int i = 0; i < COUNT; i++) {
            String value = "Element " + i;
            arrayDeque.addLast(value);
            sortedMap.put(i, value);
            arrayList.add(value);
        }
    }

    private static Map<String, Long> compareAddFirst(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();

        long start = System.nanoTime();
        arrayDeque.addFirst("New First");
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        sortedMap.put(-1, "New First");
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        arrayList.add(0, "New First");
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareAddLast(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();

        long start = System.nanoTime();
        arrayDeque.addLast("New Last");
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        sortedMap.put(COUNT + 1, "New Last");
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        arrayList.add("New Last");
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareAddMiddle(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();
        int middleIndex = COUNT / 2;

        long start = System.nanoTime();
        ArrayDeque<String> temp = new ArrayDeque<>();
        int count = 0;
        for (String s : arrayDeque) {
            if (count == middleIndex) {
                temp.addLast("New Middle");
            }
            temp.addLast(s);
            count++;
        }
        arrayDeque = temp;
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        sortedMap.put(middleIndex, "New Middle");
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        arrayList.add(middleIndex, "New Middle");
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareRemoveFirst(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();

        long start = System.nanoTime();
        arrayDeque.removeFirst();
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        if (!sortedMap.isEmpty()) {
            sortedMap.remove(sortedMap.firstKey());
        }
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        if (!arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareRemoveLast(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();

        long start = System.nanoTime();
        arrayDeque.removeLast();
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        if (!sortedMap.isEmpty()) {
            sortedMap.remove(sortedMap.lastKey());
        }
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareRemoveMiddle(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();
        int middleIndex = (COUNT - 3) / 2;

        long start = System.nanoTime();
        ArrayDeque<String> temp = new ArrayDeque<>();
        int count = 0;
        for (String s : arrayDeque) {
            if (count != middleIndex) {
                temp.addLast(s);
            }
            count++;
        }
        arrayDeque = temp;
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        sortedMap.remove(middleIndex);
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        arrayList.remove(middleIndex);
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static Map<String, Long> compareGetByIndex(ArrayDeque<String> arrayDeque, SortedMap<Integer, String> sortedMap, ArrayList<String> arrayList) {
        Map<String, Long> times = new LinkedHashMap<>();
        int index = (COUNT - 10) / 2;

        long start = System.nanoTime();
        int count = 0;
        for (String s : arrayDeque) {
            if (count == index) {
                break;
            }
            count++;
        }
        long end = System.nanoTime();
        times.put("ArrayDeque", end - start);

        start = System.nanoTime();
        sortedMap.get(index);
        end = System.nanoTime();
        times.put("SortedMap", end - start);

        start = System.nanoTime();
        arrayList.get(index);
        end = System.nanoTime();
        times.put("ArrayList", end - start);

        return times;
    }

    private static void printResultsTable(Map<String, Map<String, Long>> results) {
        System.out.println("\nСравнение (время в наносекундах):");
        System.out.printf("%-25s | %-15s | %-15s | %-15s%n",
                "Операция", "ArrayDeque", "SortedMap", "ArrayList");
        for (Map.Entry<String, Map<String, Long>> operation : results.entrySet()) {
            Map<String, Long> times = operation.getValue();
            System.out.printf("%-25s | %-15d | %-15d | %-15d%n",
                    operation.getKey(),
                    times.get("ArrayDeque"),
                    times.get("SortedMap"),
                    times.get("ArrayList"));
        }
    }
}
