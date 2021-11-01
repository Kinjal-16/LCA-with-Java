import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Junit {
    Insertion Ob;
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
    String checkLCA4(int x1, int x2)
    {
        LCA ob = new LCA();
        Ob = new Insertion(10);
        Ob.addEdge(0, 1);
        Ob.addEdge(0, 2);
        Ob.addEdge(1, 4);
        Ob.addEdge(1, 6);
        Ob.addEdge(2, 3);
        Ob.addEdge(2, 4);
        Ob.addEdge(2, 6);
        Ob.addEdge(6, 5);
        Ob.addEdge(6, 7);
        Ob.addEdge(7, 8);
        return(ob.newLCA(Ob,x1,x2).toString());

    }
    String checkCycles()
    {

        Ob = new Insertion(10);
        Ob.addEdge(0, 1);
        Ob.addEdge(0, 2);
        Ob.addEdge(1, 4);
        Ob.addEdge(1, 6);
        Ob.addEdge(2, 3);
        Ob.addEdge(2, 4);
        Ob.addEdge(2, 6);
        Ob.addEdge(6, 5);
        Ob.addEdge(6, 7);
        Ob.addEdge(7, 8);
        return(Ob.checkCycles(10));

    }
    @Test
    void simpleAssertion() {
        LCA ob = new LCA();
        //Checks for LAC-with-DAG
        Assertions.assertAll(
                () -> assertEquals("false",checkCycles()),
                () -> assertEquals("[1, 2]", checkLCA4(4,7)),//two nodes at the same level
                () -> assertEquals("[0]", checkLCA4(1,2)),
                () -> assertEquals("[1, 2]", checkLCA4(4, 5)),
                () -> assertEquals("[7]", checkLCA4(7, 8)),
                () -> assertEquals("[1]", checkLCA4(1, 6)));
        //Checks for LAC-with-BST
        Assertions.assertAll(

                () -> assertEquals(8, checkLCA1(6,12)),
                () -> assertEquals(8, checkLCA1(8, 12)),
                () -> assertEquals(13, checkLCA1(20, 6)),
                () -> assertEquals(20, checkLCA1(18, 21)),
                () -> assertEquals(30, checkLCA1(30, 30)));


        Assertions.assertAll(
                () -> assertEquals(16, checkLCA2(16, 29)));


        Assertions.assertAll(
                () -> assertEquals(12, checkLCA3(11, 29)),
                () -> assertEquals(12, checkLCA3(11, 16)));


    }
}
