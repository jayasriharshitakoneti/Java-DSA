package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//import com.sun.tools.javac.util.List;

public class combinationsOfSum {

public static void main(String[] args) {
	List<List<Integer>> reqArrList = new ArrayList<>();
	reqArrList.add(Arrays.asList(5,1,2,3));
	reqArrList.add(Arrays.asList(3,1,2,3));
	reqArrList.add(Arrays.asList(1,2,3,4));
    //ArrayList<ArrayList<Integer>> reqArrList = new ArrayList<ArrayList<Integer>>();
    //powset(1<<N,N,A,B,reqArrList);
	int A[]= {2,1,3,4,2};
	Arrays.sort(A);
	for(int i=0;i<A.length;i++)
		System.out.println(A[i]);
    List<List<Integer>> res = new ArrayList<>(new HashSet<>(reqArrList));
    System.out.println(res);
    
//    reqArrList=List.of(set);
}
}

