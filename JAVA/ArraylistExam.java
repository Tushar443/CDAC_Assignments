import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExam{
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(34);
        arr.add(45);
        arr.add(76);
        int sum=0;
        Iterator it = arr.iterator();

        while(it.hasNext()){
            sum=sum+it.next();
        }
        System.out.println(sum);

        
    }
}