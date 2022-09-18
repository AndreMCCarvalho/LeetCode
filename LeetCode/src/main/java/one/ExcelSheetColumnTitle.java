package one;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        new ExcelSheetColumnTitle().convertToTitle(701);
    }

    public String convertToTitle(int columnNumber){
        if (columnNumber == 0) return "";

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0){
            columnNumber--;
            int curr = columnNumber % 26;
            columnNumber /= 26;
            result.append((char)(curr + 'A'));
        }

        return result.reverse().toString();
    }

}
