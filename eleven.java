package SorteOpgaver.ch11.aske1208_a_11_11;

import java.util.Set;
import java.util.TreeSet;

public class eleven
{
    public Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> tempset = new TreeSet<>(set1);

        tempset.removeAll(set2);
        set2.removeAll(set1);
        tempset.addAll(set2);

        return tempset;
    }
}
