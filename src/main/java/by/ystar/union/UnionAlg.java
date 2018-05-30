package by.ystar.union;

public class UnionAlg {
    private int[] array;

    public UnionAlg(int n) {
        init(n);
    }

    public void init(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        if (p == q) {
            return true;
        }
        return array[p] == array[q];
    }

    public void union1(int p, int q) {
        int pid = array[p];
        int qid = array[q];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == pid) {
                array[i] = qid;
            }
        }
    }
}
