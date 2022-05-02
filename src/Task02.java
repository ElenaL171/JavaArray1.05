public class Task02 {
    public static void main(String args[]) {
        //Реализуйте метод, который подсчитывает количество слов в заданной строке.
        // Слова разделены пробелом. Вы должны использовать только методы length() и charAt() класса String.
        //«Для меня это новая задача» -> 5;
        String str = "Для меня это новая задача";
        char mark = ' ';
        int sum;
        if(str.charAt(1) != mark) {
            sum = 1;
        }
        else sum=0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == mark && str.charAt(i - 1) != mark) {
                sum++;
            }
        }
        System.out.println(sum);
    }

}
