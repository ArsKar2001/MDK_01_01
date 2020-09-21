package algorithms;

public class Task_03 {

    private static String[] arrayStr;

    public Task_03(String str) {
        this.arrayStr = str.split(" ");
    }

    public String getCount() {
        return String.valueOf(arrayStr.length);
    }

}
