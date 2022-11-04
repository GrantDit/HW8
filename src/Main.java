public class Main {
    public static void main(String[] args) {

    //Задание 1
        System.out.println("Задание 1");
    int i = 0;
        for (i = 1;i <=10; i++){
        System.out.println("Выведены все числа " + i);
    }


    //Задание 2
        System.out.println("Задание 2");
        for (i= 10; i >= 1; i--){
        System.out.println("Выведены все числа " + i);
    }


    //Задание 3
        System.out.println("Задание 3");
        for (i = 0; i <=17; i=i+2){
        System.out.println("Выведены все четные числа " + i );
    }


    //Задание 4
        System.out.println("Задание 4");
        for (i = 10; i >=-10; i--) {
        System.out.println(i);

    }


    //Задание 5
        System.out.println("Задание 5");
    int year = 1904;
        for (year = 1904; year <=2096; year++) {
        if (((year % 4 ==0) && (year % 100!=0))||((year % 400 == 0)))
            System.out.println("год является вискосным "+ year);
    }


    //Задание 6
        System.out.println("Задание 6");
        for (i = 7; i <= 98; i=i+7)
            System.out.println("последовательность чисел "+ i);



    //Задание 7
        System.out.println("Задание 7");
    int number = 1;
        System.out.println(number + " число");
        for (i = 0; i < 9; i++) {
        number = number * 2;
        System.out.println("последовательность чисел " + number);
    }
    //Задание 8
        System.out.println("Задание 8");
    int money = 29000;
    int total = 0;
        for (i = 1; i <= 12 ; i++) {
        total += money;
        System.out.println( "Месяц" + i + " сумма накоплений равна " + total +" рублей");


        //Задание 9
        System.out.println("Задание 9");
        double percent = 0.01;
        double moneyPercent = 0;
        for (i = 1; i <= 12 ; i++) {
            moneyPercent = (moneyPercent + money) * (1+ percent);

            System.out.println( "Месяц" + i + " сумма накоплений равна " + moneyPercent +" рублей");



        }

    }





}


}



