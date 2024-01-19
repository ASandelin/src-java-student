package schoolwork_2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
  ArrayList<List<Integer>> group = new ArrayList<List<Integer>>();
/* group.add(Arrays.asList(1, 2, 3));
group.add(Arrays.asList(4, 5, 6));
group.add(Arrays.asList(7, 8, 9)); */

for(int row=0 ; row < 3 ; row++ ){
        group.add(Arrays.asList(row));}
        for(int column=0 ; column < 3; column++ ){
            group.add(Arrays.asList(column));
/* for (int index = 0; index < 3; index++) {
    group.add(Arrays.asList(index)); */
    }
for (List<Integer> list : group) {
    for (Integer i : list) {
        System.out.print(i+" ");
    }
    System.out.println();
}
}
}
