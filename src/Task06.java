import java.util.Scanner;
public class Task06 {
    public static void main(String args[]) {
        //Даны массивы String[]names и int[ ]yearsOfBirthday одинаковой длины,
        // содержащие имена и годы рождения людей.
        // Каждый элемент в yearsOfBirthday соответствует элементу с тем же индексом в именах.
        // Реализуйте программу, которая печатает имя и возраст всех людей, которые старше данного int.
        // Затем выведите имя и возраст самого старого человека.
        //Например: ({"Ольга", "Олег", "Светлана", "Олег"} , {2004,1982,2008,2010},15) ->
        //Ольга 18 лет
        //Олег 40 лет
        String []  names = {"Ольга", "Олег", "Светлана", "Олег"};
        int[] yearsOfBirthday = {2004, 1982, 2008, 2010};
        System.out.println("Введите год рождения, старше которого надо распечатать");
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int index = 0;
        int alt;
        int alt1 = 0;
        for (int i = 0; i < names.length; i++) {
            alt = 2022 - yearsOfBirthday[i];
            if (yearsOfBirthday[i] < j)
                System.out.println(names[i]+" "+ alt + " лет");
            if (alt1 <= alt)
            {
                alt1=alt;
                index = i;}
        }
        alt1 = 2022 - yearsOfBirthday[index];
        System.out.println("Самый старый человек " + names[index] + " " + alt1 + " лет");
    }


    }