import java.util.Iterator;
import java.util.List;

public class Min
{
    /**
     * Return the minimum element in a list
     * @param list Comparable list of elements to search
     * @return the minimum element in the list
     * @throw NullPointerException (NPE) if the list is null or
     *     if any list elements are null
     * @throw NullPointerException (NPE) if list elements are not mutually comparable
     * @throw IllegalArgumentException
     */
    public static <T extends Comparable<? super T>>T min (List<? extends T> list)
    {
        if (list.size()==0)
        {
            throw new IllegalArgumentException("Min.min");
        }

        Iterator<? extends T> itr = list.iterator();
        T result = itr.next();

        if (result==null)
        {
            throw new NullPointerException("Min.min");
        }
        while (itr.hasNext())
        {
            T comp = itr.next();
            if(comp.compareTo(result)<0) {  //throw NPE, as needed
                result = comp;
            }
        }
        return result;
    }
}
