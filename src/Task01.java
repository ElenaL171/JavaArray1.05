public class Task01 {
    public static void main(String args[]) {
        //Реализовать метод, выводящий строку, состоящую из заданного символа заданной исходной строки и повторяющуюся столько раз, сколько данный символ встречается в исходной строке
        //«Это новая задача для меня», 'e' -> «ee»;
        String str = "Это новая задача для меня";
        char j = 'а';
        int i;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == j) {
                System.out.println(j);
            }
        }
    }
}
