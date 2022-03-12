# HashMapSorting
All about sorting HashMaps in java.

1) How to sort a HashMap using keys.

2) How to sort a HashMap using values using 3 ways:

a) Using a list and then Collections.sort(list, (x,y) -> x.getValue().compareTo(y.getValue()));
b) Using a list and then Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
c) Using a list and then Collections.sort(list, Map.Entry.comparingByValue());
