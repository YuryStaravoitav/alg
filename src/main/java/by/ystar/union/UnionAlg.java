package by.ystar.union;

public class UnionAlg {
    private int[] array;

    public UnionAlg(int n) {
        array = new int[n];
    }

    public void init(int n) {
        array = new int[n];
    }

    public boolean connected(int p, int q) {
        if (p == q) {
            return true;
        }
        return array[p] == array[q];
    }
}
