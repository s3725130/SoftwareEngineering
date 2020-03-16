import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static com.sun.tools.javac.jvm.ByteCodes.swap;


public class tut1 {

    public static void bubbleSort(int[] array){
        boolean isSorted = false;
        int lastUnsorted = array.length -1;

        while (isSorted)    {
            for (int i = 0; i < array.length -1; i++)   {
                if (array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }

    }

    private static void swap(int[] array, int i, int i1) {
    }
}