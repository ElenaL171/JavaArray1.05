public class Task05 {
    public static void main(String args[]) {
        //  Даны массивы String[]. Реализуйте метод, возвращающий из него самую короткую строку String.
        String str1 = "abcdhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        String str2 = "qwerfff";
        String str3 = "Для меня это новая задача";
        if (str1.length() > str2.length()) {
            if (str3.length() > str2.length())
                printStr(str2);
            else printStr(str3);
        } else if (str3.length() > str1.length())
            printStr(str1);
    }
    public static void printStr(String str) {
        System.out.println(str);
    }
}

