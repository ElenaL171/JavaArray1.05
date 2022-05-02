public class Task03 {
    public static void main (String args[]){
        //Реализуйте метод, который принимает две строки и возвращает строку,
        // содержащую символы из первой строки, смешанные через одну с символами из другой строки
        //«abcd», «qwer» -> «aqbwcedr»
        //«ab», «qwer» -> «aqbwer»
        //«abcd», «qw» -> «aqbwcd»
        String str1 = "abcd";
        String str2 = "qwer";
        String str3 = "";
        int l;
        if(str1.length()>str2.length()) {
            l = str2.length();
            str3=sort(l, str1, str2);
            str3=str3+str1.substring(l);
        }
        else
        { l = str1.length();
            str3=sort(l, str1, str2);
            str3=str3+str2.substring(l);}

        System.out.println(str3);
        }
        public static String sort(int l, String str1, String str2)
        {
            int i;
            String str3 = "";
            for (i = 0; i < l; i++) {
                str3 = str3 + str1.charAt(i);
                str3 = str3 + str2.charAt(i);
            }
            return str3;
        }
}

