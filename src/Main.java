//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        byte cats = 15;
        System.out.println("Значение переменной byte с типом cat равно " + cats);
        short citys = 22456;
        System.out.println("Значение переменной short с типом citys равно " + citys);
        int mails = 1678987;
        System.out.println("Значение переменной int с типом mails равно " + mails);
        long birds = 1456789879;
        System.out.println("Значение переменной long с типом birds равно " + birds);
        float pensils = 3.87f;
        System.out.println("Значение переменной float с типом pensils равно " + pensils);
        double monsters = 1.78988;
        System.out.println("Значение переменной double с типом monsters равно " + monsters);

        System.out.println("Задание 2");
        byte houses = 67;
        System.out.println("Домов" + houses + " шт");
        short cakes = 27897;
        System.out.println("Пирожных " + cakes + " шт");
        short cakesNow = 569;
        System.out.println("Пирожных теперь " + cakesNow + " шт");
        short temperature = -159;
        System.out.println("Температура " + temperature + " градусов");
        double glasses = 2.786;
        System.out.println("Стаканов " + glasses + " шт");
        long peoples = 987678965549L;
        System.out.println("Людей " + peoples);
        double sugar = 27.12;
        System.out.println("Сахара " + sugar + " грамм");

        System.out.println("Задание 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        int studentsAll = studentsEA + studentsLP + studentsAS;
        short listsAll = 480;
        int lists = listsAll / studentsAll;
        System.out.print("На каждого ученика расчитано " + lists + " листов бумаги");

        System.out.println("Задание 4");
        byte bottleStart = 16;
        byte timeStart = 2;
        int bottleForMinutes = bottleStart / timeStart;
        byte time2 = 20;
        int bottleFor20Minutes = bottleForMinutes * time2;
        System.out.println("За " + time2 + " минут машина произвела " + bottleFor20Minutes + " штук бутылок");
        byte time3 = 24;
        byte minutesInHour = 60;
        int bottleFor24Hours = bottleForMinutes * time3 * minutesInHour;
        System.out.println("За " + time3 + " часов машина произвела " + bottleFor24Hours + " штук бутылок");
        int time4 = 3 * time3;
        int bottleFor3Days = bottleForMinutes * time4 * minutesInHour;
        System.out.println("За " + time4 + " суток машина произвела " + bottleFor3Days + " штук бутылок");
        int time5 = 30 * time3;
        int bottleFor30Days = bottleForMinutes * time5 * minutesInHour;
        System.out.println("За " + time5 + " суток (месяц) машина произвела " + bottleFor30Days + " штук бутылок");

        System.out.println("Задание 5");
        byte paintAll = 120;
        byte whitePaintInOneClass = 2;
        byte brawnPaintInOneClass = 4;
        int paintAllInOneClass = whitePaintInOneClass + brawnPaintInOneClass;
        int classes = paintAll / paintAllInOneClass;
        int whitePaintInAllClasses = classes * whitePaintInOneClass;
        int brawnPaintInAllClasses = classes * brawnPaintInOneClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintInAllClasses + " банок белой краски и " + brawnPaintInAllClasses + " банок коричневой краски");

        System.out.println("Задание 6");
        byte bananas = 5;
        int allBananas = 80 * bananas;
        short milk = 2;
        int allMilk = 105 * milk;
        byte iceCreamThings = 2;
        byte iceCreamGram = 100;
        int iceCreamWeight = iceCreamGram * iceCreamThings;
        byte eggs = 4;
        byte weightOneEgg = 70;
        int eggsWeight = eggs * weightOneEgg;
        int wightAllInGram = allBananas + allMilk + iceCreamWeight + eggsWeight;
        System.out.println("Вес завтрака спортсмена " + wightAllInGram + " грамм");
        double wightAllInKilo = wightAllInGram / 1000;
        System.out.println("Вес завтрака спортсмена " + wightAllInKilo + " килограмм");

        System.out.println("Задание 7");
        byte resetWeightKilo = 7;
        int resetWeightGram = resetWeightKilo * 1000;
        short resetGram1 = 250;
        int resetWeight1 = resetWeightGram / resetGram1;
        System.out.println("Спортсмен за " + resetWeight1 + " дней сможет сбросить " + resetWeightKilo + " если будет есть ежедневно на " + resetGram1 + " грамм меньше");
        short resetGram2 = 500;
        int resetWeight2 = resetWeightGram / resetGram2;
        System.out.println("Спортсмен за " + resetWeight2 + " дней сможет сбросить " + resetWeightKilo + " если будет есть ежедневно на " + resetGram2 + " грамм меньше");
        int averageQuantityDays = (resetWeight1 + resetWeight2) / 2;
        System.out.println("В среднем спортсмену понадобиться " + averageQuantityDays + " дней, чтобы добиться нужного результата");

        System.out.println("Задание 8");
        int mashaNow = 67760;
        int mashaProcent = mashaNow / 100 * 10;
        int mashaAfter = mashaNow + mashaProcent;
        System.out.print("Маша теперь получает " + mashaAfter + " рублей. Годовой доход вырос на " + mashaProcent + " рублей. ");
        int denisNow = 83690;
        int denisProcent = denisNow / 100 * 10;
        int denisAfter = denisNow + denisProcent;
        System.out.print("Денис теперь получает " + denisAfter + " рублей. Годовой доход вырос на " + denisProcent + " рублей. ");
        int kristinaNow = 76230;
        int kristinaProcent = kristinaNow / 100 * 10;
        int kristinsAfter = kristinaNow + kristinaProcent;
        System.out.print("Кристина теперь получает " + kristinsAfter + " рублей. Годовой доход вырос на " + kristinaProcent + " рублей");

    }
    }