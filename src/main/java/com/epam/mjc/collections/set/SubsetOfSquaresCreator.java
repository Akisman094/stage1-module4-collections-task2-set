package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        return sourceList.stream().map(x -> x * x).filter(x -> x >= lowerBound && x <= upperBound).collect(Collectors.toSet());
    }
}
