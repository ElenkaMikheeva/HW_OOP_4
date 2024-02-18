public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.addBegin(17);
        l.addBegin(23);
        l.addBegin(47);
        l.addEnd(54);
        
        l.print();
        System.out.print("Element with index 2: "+l.get(2));
    }
}
