package jvprj;

import java.util.*;

public class cach1 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] res = new int[n];
            Arrays.fill(res, -1);
            int max = 0;

            for ( int i = 0; i < n; i++ )
                a[i] = sc.nextInt();

            for ( int i = n - 1; i >= 0; i-- )
                if ( a[i] > max ) {
                    max = a[i];
                    res[i] = a[i];
                }

            for ( int i = 0; i < n; i++ )
                if ( res[i] > -1 )
                    System.out.print(res[i] + " ");
            System.out.println("");
        }
    }
}
