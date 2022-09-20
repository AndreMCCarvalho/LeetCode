package one;

public class ExcelSheetColumnNumber {

    public static void main(String[] args){
        new ExcelSheetColumnNumber().titleToNumber("AAA");
    }

    public int titleToNumber(String columnTitle) {
        if (columnTitle.length() <= 0 || columnTitle == null){
            return 0;
        }

        int result = 0;
        for(int i = 0 ; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

}
