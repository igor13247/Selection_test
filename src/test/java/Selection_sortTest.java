import org.junit.Assert;
import org.junit.Test;

public class Selection_sortTest {

    @Test
    public void sort2() {
        int[] y = {5, 9, 50, 48, 60, 32, 15, 0, 50}; // Исходные данных
        int[] y2 ={0, 5, 9, 15, 32, 48, 50, 50, 60};
        int[] y3 = Selection_sort.sort(y);
        Assert.assertArrayEquals(y2, y3);
    }

    @Test
    public void sort3() {
        int[] y = {5, 9, 50, 48, 60, 32}; // Исходные данных
        int[] y2 ={5, 9, 32, 48, 50, 60};
        int[] y3 = Selection_sort.sort(y);

        Assert.assertArrayEquals(y2, y3);
    }

    @Test
    public void sort4() {
        int[] y = {}; // Исходные данных
        int[] y3 = Selection_sort.sort(y);
        Assert.assertFalse(false);
    }


    @Test
    public void sort5() {
        int[] y = {8, 56, 45, 85, 3, 41, 21}; // Исходные данных
        int[] y2 = Selection_sort.sort(y);
        for (int i = 0; i<(y.length-1); i++){
            if (y[i]<y[i+1]){
                System.out.println("Значение " + y[i] + " больше, чем " + y[i+1]);
            }
        }
    }

    @Test
    public void sort6() {
        int[] y = {}; // Исходные данных
        Assert.assertNotNull(Selection_sort.sort(y));
    }

    @Test
    public void sort7() {
        int[] y3 ={4, 5, 90, 45, 35, 12}; // Исходные данных
        Assert.assertNotNull(Selection_sort.sort(y3));
    }
}