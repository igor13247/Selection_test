import java.util.Scanner;

public class Selection_sort {

    //ручной ввод данных, который не потребовался !!!
    /*private static int[] vvod(int[] y) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < y.length; i++) {
            System.out.println("введите " + (i+1) + " значение");
            y[i] = in.nextInt();
        }
        return y;
    }*/

    public static int[] sort(int[] y){
        int u,j,r,k;
        int z=y.length;
        r=0;
        k=z-1;
        // кол-во проходов в массиве = длине строки
        for (int i = 0; i < y.length; i++) {
            j = 0;
            // пересмотр массива по порядку
            for (int t = 0; t < z; t++) {
                if (j < y[t]) {
                    j = y[t];
                    r = t;
                }
                // вставка макс. знач в конец рассматриваемого массива
                if (k == t) {
                    u=y[k];
                    y[k]=j;
                    y[r]=u;
                }
            }
            z--;
            k--;
        }
        return y;
    }

    private static void vivod(int[] mass, int x){
        // Вывод значений от мин. до макс.
        for (int p = 0; p < x; p++)
            System.out.print(mass [p] +" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Введите кол-во значений:");
        int x = in.nextInt();*/
        int [] y = {5, 9, 50, 48, 60, 32, 15, 0, 50};
        /*vvod(y);*/
        System.out.println("Исходный массив: ");
        vivod(y, y.length);
        sort(y);
        System.out.println();
        System.out.println("Отсортированный массив: ");
        vivod(y, y.length);
    }
}
