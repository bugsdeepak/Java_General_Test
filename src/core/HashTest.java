package core;
import java.util.Map;
import java.util.HashMap;

public class HashTest {
  
    // On my computer, testBadHash takes about 6 seconds, OTOH testGoodHash takes about 0.07 second
    private static final int count = 10000;

    public void testBadHash() {
        Map map = new HashMap ();
        Object value = new Object();
        for (int i=0; i<count; i++) {
            map.put(new BadKey (i, i*2), value);
        }

        for (int i=0; i<count; i++) {
            map.get(new BadKey (i, i*2));
        }
    }

    public void testGoodHash() {
        Map map = new HashMap ();
        Object value = new Object();
        for (int i=0; i<count; i++) {
            map.put(new GoodKey (i, i*2), value);
        }

        for (int i=0; i<count; i++) {
            map.get(new GoodKey (i, i*2));
        }
    }

    private class BadKey {
        private int a;
        private long b;

        public BadKey(int a, long b) {
            this.a = a;
            this.b = b;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BadKey)) return false;

            final BadKey badKey = (BadKey) o;

            if (a != badKey.a) return false;
            if (b != badKey.b) return false;

            return true;
        }

        public int hashCode() {
            return 5;
        }
    }

    private class GoodKey {
        private int a;
        private long b;

        public GoodKey(int a, long b) {
            this.a = a;
            this.b = b;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof GoodKey)) return false;

            final GoodKey goodKey = (GoodKey) o;

            if (a != goodKey.a) return false;
            if (b != goodKey.b) return false;

            return true;
        }

        public int hashCode() {
            int result;
            result = a;
            result = 29 * result + (int) (b ^ (b >>> 32));
            return result;
        }
    }
}
