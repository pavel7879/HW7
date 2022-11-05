public class HW7 {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + salary;
            i++;
        }
        System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        System.out.println("Задание 1.2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println(" ");
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println(" ");
        System.out.println("Задание 1.3");
        int population = 12000000;
        int year = 0;
        int fertility = 17;
        int mortality = -8;
        while (year<10) {
            year++;
            population = population + (population * fertility/1000)+ (population * mortality/1000);
            System.out.println("Год "+ year+ " численность населения составляет " + population);
        }
        System.out.println("Задание 2.1");
        int savingsDeposit = 15_000;
        int month = 0;
        int percent = 7;
        while (savingsDeposit < 12_000_000) {
            month++;
            savingsDeposit = savingsDeposit + savingsDeposit*percent/100;
            System.out.println("Месяц "+ month +" Сумма накоплений составляет " +savingsDeposit);
        }
        System.out.println("Задание 2.2");
        int savingsDeposit1 = 15_000;
        int month1 = 0;

        while (savingsDeposit1 < 12_000_000) {
            month1++;
            savingsDeposit1 = savingsDeposit1 + savingsDeposit1 * percent / 100;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " Сумма накоплений составляет " + savingsDeposit1);
            }
        }
        System.out.println("Задание 2.3");
        int savingsDeposit2 = 15_000;
        int month2 = 0;

        while (month2 < 108) {
            month2++;
            savingsDeposit2 = savingsDeposit2 + savingsDeposit2 * percent / 100;
            if (month2 % 6 == 0) {
                int halfYear = month2 / 6;
                System.out.println("за " + halfYear + " полугодие Сумма накоплений составляет " + savingsDeposit2);
            }
        }
        System.out.println("Задание 2.4");
        int dataFirstFriday = 3;
        int day = 0;
        while (day < 31 ) {
            day++;
            if (day == dataFirstFriday || (day-dataFirstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " +day+"-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Задание 3.1");
        int yearStart = 1822;
        int yearZero= 0;
        int yearEnd = 2122;
        while (yearZero < yearEnd) {
            yearZero = yearZero +79;
            if (yearZero >= yearStart && yearZero <= yearEnd) {
                System.out.println(yearZero);
            }
        }
        System.out.println("Задание 3.2");
        int x = 2;
        int y = 0;
        while ( y < 10 ) {
            y++;
            int c = x*y;
            System.out.println(x+" * "+y+" = "+c);
        }
    }
}

