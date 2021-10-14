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
        Assertions.assertAll(
                () -> assertEquals(8, checkLCA1(6,12)),
                () -> assertEquals(8, checkLCA1(8, 12)),
                () -> assertEquals(13, checkLCA1(20, 6)),
                () -> assertEquals(20, checkLCA1(18, 21)),
                () -> assertEquals(30, checkLCA1(30, 30)));

        Assertions.assertAll(
                () -> assertEquals(16, checkLCA2(16, 29)),
                () -> assertEquals(3, checkLCA2(3, 3)));

        Assertions.assertAll(
                () -> assertEquals(12, checkLCA3(11, 29)),
                () -> assertEquals(12, checkLCA3(11, 16)));


    }
}
