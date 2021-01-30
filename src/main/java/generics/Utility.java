package generics;

import java.util.HashSet;
import java.util.Set;

public final class Utility<T> {

    private Utility() {
        throw new AssertionError();
    }

    public static <T> Set<T> joinSets(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<T>(set1);
        result.addAll(set2);
        return result;
    }


}
