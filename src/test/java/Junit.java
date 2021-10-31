import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Junit {
    int checkLCA1(int x1, int x2) {


        LCA ob2 = new LCA();
        Insertion ob = new Insertion();
        int a[] = {13,8,22,7,12,20,30,6,9,18,21};
        int len = a.length;
        for (int i = 0; i < len; i++) {
            ob.create(a[i]);

        }
        return (ob2.lca(ob.root, x1, x2));


    }

    int checkLCA2(int x1, int x2) {

        LCA ob2 = new LCA();
        Insertion ob = new Insertion();
        int a[] = {3, 10, 16, 29};
        int len = a.length;
        for (int i = 0; i < len; i++) {
            ob.create(a[i]);

        }
        return (ob2.lca(ob.root, x1, x2));
    }

    int checkLCA3(int x1, int x2) {

        LCA ob2 = new LCA();
        Insertion ob = new Insertion();
        int a[] = {10,3,12,11,16,29};
        int len = a.length;
        for (int i = 0; i < len; i++) {
            ob.create(a[i]);

        }
        return (ob2.lca(ob.root, x1, x2));
    }
    @Test
    void simpleAssertion() {
        LCA ob = new LCA();
        Insertion DAG = new Insertion();
        DAG.addEdge(0, 1);
        DAG.addEdge(0, 2);
        DAG.addEdge(1, 4);
        DAG.addEdge(1, 6);
        DAG.addEdge(2, 3);
        DAG.addEdge(2, 4);
        DAG.addEdge(2, 6);
        DAG.addEdge(6, 5);
        DAG.addEdge(6, 7);
        DAG.addEdge(7, 8);
        Assertions.assertAll(
                () -> assertEquals(8, checkLCA1(6,12)),
                () -> assertEquals(8, checkLCA1(8, 12)),
                () -> assertEquals(13, checkLCA1(20, 6)),
                () -> assertEquals(20, checkLCA1(18, 21)),
                () -> assertEquals(30, checkLCA1(30, 30)));
        Assertions.assertAll(
                () -> assertEquals(new int[]{1, 2}, ob.checkDAGLCA(4,7)),
                () -> assertEquals(new int[]{0}, ob.checkDAGLCA(1,2)),
                () -> assertEquals(new int[]{1,2}, ob.checkDAGLCA(4, 5)),
                () -> assertEquals(new int[]{7}, ob.checkDAGLCA(7, 8)),
                () -> assertEquals(new int[]{0}, ob.checkDAGLCA(1, 6)));

        Assertions.assertAll(
                () -> assertEquals(16, checkLCA2(16, 29)));


        Assertions.assertAll(
                () -> assertEquals(12, checkLCA3(11, 29)),
                () -> assertEquals(12, checkLCA3(11, 16)));


    }
}
