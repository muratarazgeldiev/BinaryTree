import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestBinaryTree {
    @Test
    public void TestHeight(){
        Tree<Number> testHeight = new Tree<Number>();
        int[] mass = {2, 5, 3, 2, 4, 3, 7, 9, 1, 1, 1, 0} ;
        for(int i = 0; i < mass.length; i++){
            testHeight.add(mass[i]);
        }
        System.out.println(testHeight.insertHeight(testHeight.root));
        assertEquals(5, testHeight.insertHeight(testHeight.root));
        assertEquals(true, testHeight.insertCheckNumber(testHeight.root, 11));
        assertEquals(9,testHeight.insertFindMax(testHeight.root));
        assertEquals(0,testHeight.insertFindMin(testHeight.root));
    }

}