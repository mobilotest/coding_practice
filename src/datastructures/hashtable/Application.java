package datastructures.hashtable;

public class Application {
    public static void main(String[] args){
        HashTable table = new HashTable((30));

        table.insert(("September"));
        table.insert(("Dogs"));
        table.insert(("Milk"));
        table.insert(("Michael"));
        table.insert(("Zebra"));
        table.insert(("Apple"));
        table.insert(("Water"));
        table.insert(("Africa"));
        table.insert(("Feeling"));
        table.insert(("Male"));
        table.insert(("Mice"));
        table.insert(("Park"));



        table.displayTable();
//        System.out.println("------FIND ELEMENTS-----");
//        System.out.println(table.find("Apple"));
//        System.out.println(table.find("Zebra"));
//        System.out.println(table.find("Feeling"));
//        System.out.println(table.find("Phone"));
//        System.out.println(table.find("Glass"));
//        System.out.println(table.find("Android"));




    }
}
