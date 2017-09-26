import java.util.Iterator;
import java.util.List;

/**
 * Created by Paolo T. Inocencion on 09/25/17.
 */
public class ListDemo {

    public static <AnyType> void printLots(List<AnyType> L, List<Integer> P) {
        Iterator<AnyType> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();
        AnyType itemL = null;
        Integer itemP = 0;
        int start = 0;
        while (iterL.hasNext() && iterP.hasNext()) {
            itemP = iterP.next();
            System.out.println("Looking for position " + itemP);
            while (start < itemP && iterL.hasNext()) {
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }

    public static void main(String[] args) {
        printLots();
    }

}
