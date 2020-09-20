package algorithms;

public class Task_01 {

    private final String str;
    private final String chStr;

    public Task_01(String str, String chStr) {

        this.str = str;
        this.chStr = chStr;
    }

    public String Execute() {
        double var = 100.0 / str.length();
        int factor = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chStr.charAt(0)) {
                factor++;
            }
        }
        var *= factor;
        return var + "%";
    }

}
