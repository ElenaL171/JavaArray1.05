public class Task04 {
    //Реализуйте свой собственный метод разделения.
    // Он должен разбивать заданную строку вокруг совпадений разделителя символов.
    // В результате он должен вернуть массив подстрок. Не используйте метод String.split
    // . Например:
    // («Java — это очень просто!», ' ') -> {«Java», «is», «очень», «легко»}
    // («Java — это очень просто! ", 'v') -> {"Ja","a is","ery easy"}
    // ("Java is very easy!",'!') -> {"Java is very easy"}
    // ("Java is очень просто!",':') -> {"Java очень просто!"}

    public static void main(String args[]) {
        String str = "Java — это очень просто!";
        char mark = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != mark&& str.charAt(i) != '—'&& str.charAt(i) != '!'&& str.charAt(i) != '.') {
                System.out.print(str.charAt(i));
            } else System.out.print(" ");
        }
    }
}