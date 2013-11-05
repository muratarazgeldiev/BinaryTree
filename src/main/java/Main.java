import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
/*        Tree<Integer> binaryTree = new Tree<Integer>();
        int[] mass = new int[10];
        for(int i = 0; i < mass.length; i++){
            mass[i] = new Random().nextInt(100);
            binaryTree.add(mass[i]);
        }*/
        Tree<Number> binaryTree = new Tree<Number>();
        int[] mass = {3, 2, 5, 3, 2, 4, 3, 7, 9, 1, 1, 1, -1, -2, -4, -3} ;
        for(int i = 0; i < mass.length; i++){
            binaryTree.add(mass[i]);
        }
        System.out.println(binaryTree.insertHeight(binaryTree.root));
        System.out.println(binaryTree.insertCheckNumber(binaryTree.root, 2));
        System.out.println(binaryTree.insertFindMin(binaryTree.root));
        System.out.println(binaryTree.insertFindMax(binaryTree.root));
    }
}