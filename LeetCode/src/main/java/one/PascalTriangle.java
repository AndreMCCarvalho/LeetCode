package one;

import java.util.*;

public class PascalTriangle {

    public static void main(String[] args)
    {

    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return List.of(List.of());
        if (numRows == 1) return List.of(List.of(1));
        if (numRows == 2) return List.of(List.of(1), List.of(1,1));

        List<Integer> lineOne = List.of(1);
        List<Integer> lineTwo = List.of(1,1);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(lineOne);
        triangle.add(lineTwo);

        for (int i = 3; i <= numRows; i++){
            List<Integer> previousRow = triangle.get(triangle.size() - 1);
            List<Integer> newLine = new ArrayList<>();
            for (int j = 0; j < previousRow.size() - 1; j++){
                newLine.add(previousRow.get(j) + previousRow.get(j + 1));
            }
            newLine.add(1);
            newLine.add(0,1);
            triangle.add(newLine);
        }
        return triangle;
    }

}
