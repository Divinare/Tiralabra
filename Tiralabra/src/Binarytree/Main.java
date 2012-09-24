package Binarytree;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // Binääripuun testausta:
        Binarytree binarytree = new Binarytree(5);
        binarytree.insert(8);
        binarytree.insert(17);
        binarytree.insert(10);
        binarytree.insert(2);
        binarytree.insert(14);
        binarytree.insert(13);
        binarytree.insert(18);
        binarytree.insert(52);
//        binarytree.insert(19);
//        binarytree.insert(7);
//        binarytree.insert(6);
//        binarytree.insert(1);
//        binarytree.insert(5);
//        binarytree.insert(6);
//        binarytree.insert(0);
//        binarytree.insert(1);
//        binarytree.insert(3);
//        binarytree.insert(4);

        System.out.println("in-order läpikäynti:");
        binarytree.printInOrder(binarytree.getRoot());
        System.out.println("pre-order läpikäynti:");
        binarytree.printPreOrder(binarytree.getRoot());
        System.out.println("level-order läpikäynti:");
        binarytree.printLevelOrder();
        System.out.println("max on " + binarytree.max(binarytree.getRoot()).key);
        System.out.println("min on " + binarytree.min(binarytree.getRoot()).key);
        System.out.println("Puu tulostettuna: ");
        binarytree.printTree();
        System.out.println("Poistetaan solmu 8");
        binarytree.delete(binarytree.search(binarytree.getRoot(), 8));
        System.out.println("Puu tulostettuna: ");
        binarytree.printTree();

        // Testitulostusta:
//        System.out.println("       5");
//        System.out.println("   2       8");
//        System.out.println(" 1   4   7   9");
//        System.out.println("0 1 3 5 6 8 8 10");

    }
}