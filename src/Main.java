public class Main {
    public static void main(String[] args) {
        // Задание №1
        {
            System.out.println(" ! ! ! Задание №1");
            //Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их)
            // Целочисленные
            byte by = 100; // (1 байт) от -128 до 127
            short sh = 200; // (2 байт) от -32768 до 32767
            int in = 300; // (4 байт) от -2147483648 до 2147483647
            long lo = 400L; // (8 байт) от -9223372036854775808 до 9223372036854775807

            // С плавающей точкой
            float fl = 1.6f; // (4 байт) 6 знаков после запятой
            double db = 3.76d; // (8 байт) больше 6 знаков после запятой

            // Символы
            char ch = '\u263a'; // (2 байт) Символы, юникод

            // Логический
            boolean bo = 10 > 5; // (1 бит) Правда или ложь

            System.out.println("Мне нравятся уроки в Skypro и это " + bo + ch);
        }

        // Задание №2
        {
            System.out.println(" ! ! ! Задание №2");
            //Вес одного боксера – 78,2 кг
            //Вес второго боксера – 82,7 кг
            //Подсчитайте и выведите в консоль общий вес двух бойцов.
            //Подсчитайте и выведите в консоль разницу между весами бойцов
            float Vasiliy = 78.2f;
            System.out.println("Вес Василия " + Vasiliy + " кг");
            float Fedor = 82.7f;
            System.out.println("Вес Фёдора " + Fedor + " кг");
            float totalWeight = Vasiliy + Fedor;
            System.out.println("Общий вес бойцов " + totalWeight + " кг");
            float weightDifference = Fedor - Vasiliy;
            System.out.println("Разница между весом бойцов " + weightDifference + " кг");
        }


        // Задание №3
        {
            System.out.println(" ! ! ! Задание №3");
            //– Бананы – 5 штук (1 банан - 80 грамм);
            //– Молоко – 200 мл (100 мл = 105 грамм);
            //– Мороженое пломбир – 2 брикета по 100 грамм;
            //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
            //Смешать всё в блендере и готово.
            //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
            //Результат напечатайте в консоль
            byte bananas = 5;
            byte weightOneBananas = 80;
            int weightBananas = bananas * weightOneBananas;
            System.out.println("Общий вес бананов " + weightBananas + " гр");

            int milkMl = 200;
            byte weight100MlMilk = 105;
            milkMl = weight100MlMilk * 2;
            int weightMilk = milkMl;
            System.out.println("Общий вес молока " + weightMilk + " гр");

            byte iceCream = 2;
            byte weightOneIceCream = 100;
            int weightIceCream = iceCream + weightOneIceCream;
            System.out.println("Общий вес мороженного " + weightIceCream + " гр");

            byte eggs = 4;
            byte weightOneEggs = 70;
            int weightEggs = eggs * weightOneEggs;
            System.out.println("Общий вес яиц " + weightEggs + " гр");

            int totalWeightGr = weightBananas + weightMilk + weightIceCream + weightEggs;
            System.out.println("Общий вес завтрака " + totalWeightGr + " гр");

            float kg1 = 1000f;
            float totalWeightKg = totalWeightGr / kg1;
            System.out.println("Общий вес завтрака " + totalWeightKg + " кг");
        }

        // Задание №4
        {
            System.out.println(" ! ! ! Задание №4");
            //нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
            //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
            //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
            //Посчитайте, сколько может потребоваться дней в среднем
            byte loseWeight = 7;
            short kg1 = 1000;
            short loseWeight1DayMin = 250;
            short loseWeight1DayMax = 500;

            int gram = loseWeight * kg1;
            System.out.println("Вес в граммах " + gram);

            int dayMax = gram / loseWeight1DayMin;
            System.out.println("Максимум понадобится " + dayMax + " дней");

            int dayMin = gram / loseWeight1DayMax;
            System.out.println("Минимум понадобится " + dayMin + " дней");


            int averageAmount = (dayMax + dayMin) / 2;
            System.out.println("В среднем понадобится " + averageAmount + " день");
        }

        // Задание №5
        {
            System.out.println(" ! ! ! Задание №5");
            //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
            //Маша получает 67 760 рублей в месяц
            //Денис получает 83 690 рублей в месяц
            //Кристина получает 76 230 рублей в месяц
            //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения
            int masha = 67_760;
            int denis = 83_690;
            int kristina = 76_230;
            int interest = 10;

            int mashaYear = masha * 12;
            int masha10int = masha / interest;
            int masha10 = masha + masha10int;
            int mashaYear10 = masha10 * 12;
            System.out.println(" - Маша после повышения получает " + masha10 + " руб." + " Доход за месяц вырос на " + masha10int + "руб.");
            System.out.println(" Годовой доход Маши вырос на " + (mashaYear10 - mashaYear) + " руб");

            int denisYear = denis * 12;
            int denis10int = denis / interest;
            int denis10 = denis + denis10int;
            int denisYear10 = denis10 * 12;
            System.out.println(" - Денис после повышения получает " + denis10 + " руб." + " Доход за месяц вырос на " + denis10int + "руб.");
            System.out.println(" Годовой доход Дениса вырос на " + (denisYear10 - denisYear) + " руб.");

            int kristinaYear = kristina * 12;
            int kristina10int = kristina / interest;
            int kristina10 = kristina + kristina10int;
            int kristinaYear10 = kristina10 * 12;
            System.out.println(" - Кристина после повышения получает " + kristina10 + " руб." + " Доход за месяц вырос на " + kristina10int + "руб.");
            System.out.println(" Годовой доход Кристины вырос на " + (kristinaYear10 - kristinaYear) + " руб");
        }


    }
}