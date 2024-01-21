public class Main {
    public static void main(String[] args) {

        System.out.println("     Задание1");

        int limit = 2459000;
        int payment = 15000;
        int interest = 12;
        int interestMonth = interest / 12;
        int deposit = 0;
        int numberOfMonth = 1;
        while (deposit < limit) {
            deposit = deposit + deposit * interestMonth/100 + payment;
            System.out.println("Месяц " + numberOfMonth + ". Сумма накоплений равна " + deposit);
            numberOfMonth++;
        }

        System.out.println("     Задание2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++ ;
        }
        i = i-1;
            System.out.println();
        for (; i > 0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("     Задание3");

        int population = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for (int j = 1; j <=10 ; j++) {
            population = population + population / 1000 * birthrate - population / 1000 * mortality;
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }

        System.out.println("     Задание4");

        interest = 7;
        limit = 12_000_000;
        deposit = 15000;
        numberOfMonth = 0;
        while (deposit < limit) {
            deposit = deposit + deposit * interest / 100;
            numberOfMonth ++ ;
            System.out.println("Месяц " + numberOfMonth + ", сумма накоплений - " + deposit);
        }
        System.out.println("Василию пришлось копить - " + numberOfMonth + " месяцев.");

        System.out.println("     Задание5");

        interest = 7;
        limit = 12_000_000;
        deposit = 15000;
        numberOfMonth = 0;
        while (deposit < limit) {
            deposit = deposit + deposit * interest / 100;
            numberOfMonth ++ ;
            if (numberOfMonth % 6 == 0) {
                System.out.println("Месяц " + numberOfMonth + ", сумма накоплений - " + deposit);
            }
            continue;
        }
        System.out.println("Василию пришлось копить - " + numberOfMonth + " месяцев.");

        System.out.println("     Задание6");

        interest = 7;
        int limitOfMonth = 9 * 12;
        deposit = 15000;
        numberOfMonth = 1;
        for (;numberOfMonth <= limitOfMonth; numberOfMonth ++ ) {
            deposit = deposit + deposit * interest / 100;
            if (numberOfMonth % 6 == 0) {
                System.out.println("Месяц " + numberOfMonth + ", сумма накоплений - " + deposit);
            }
            continue;
        }
        System.out.println("За " + (numberOfMonth - 1) + " месяцев, что составляет 9 лет, Василий накопил - " + deposit);

        System.out.println("     Задание7");

        int month = 31;
        int firstFriday = 2;
        for (;firstFriday <= month; firstFriday = firstFriday +7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("     Задание8");

        int now = 2024;
        int interval = 79;
        int yearComet = 0;
        do {
            yearComet = yearComet + interval;
            if (yearComet >= now - 200 && yearComet <= now) {
                System.out.println("Комета появлялась в " + yearComet + " году.");
            } else if (yearComet > now && yearComet <= now + 100) {
                System.out.println("Комета появится  в " + yearComet + " году.");
            } continue;
        } while (yearComet <= now + 100);
    }
}