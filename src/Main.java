public class Main {
    public static void main(String[] args) {
        Queue<Integer> t = new Queue<>();

        t.add(22);
        t.add(10);
        t.add(3);
        t.add(8);
        t.add(22);
        t.add(22);
        t.print();
        t.remove(2);
        t.print();
        t.removeAll(22);
        t.print();
        t.add(10);
        t.add(8);
        t.add(8);
        t.add(5);
        t.print();
        t.removeDuplicates();
        t.print();
    }
}
