package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer next : sourceList)
        {
            if (next % 2 == 0)
                evenNumbers(next, result);
            else
                oddNumbers(next, result);
        }
        return result;
    }

    public void evenNumbers(Integer num, HashSet<Integer> sourceList) {
        if(!sourceList.contains(num))
            sourceList.add(num);
        if(num % 2 == 0)
            evenNumbers(num / 2, sourceList);
    }

    public void oddNumbers(Integer num, HashSet<Integer> sourceList) {
        if(!sourceList.contains(num))
            sourceList.add(num);
        if(!sourceList.contains(num * 2))
            sourceList.add(num * 2);
    }
}
