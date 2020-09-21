package algorithms;

public class Task_07 {

    private static String[] str;

    public Task_07(String str) {
        this.str = str.split(" ");
    }

    public String IsChecked(String strLb) {
        for (String itVar : str) {
            if(itVar.equalsIgnoreCase(strLb))
                return "Присутствует";
        }
        return "Отсутствует";
    }
}
