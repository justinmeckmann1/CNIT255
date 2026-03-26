import java.util.Arrays;
import java.util.Comparator;


class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return Integer.compare(first.length(), second.length());
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> comp = new LengthComparator();
        String[] friends = {"Peter", "Paul", "Jo"};
        Arrays.sort(friends, comp);
        System.out.println(Arrays.toString(friends));
    }
}