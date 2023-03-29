import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
* Исходные данные
В первой строке указано число N (0 < N < 30) — количество уровней планет на карте Иванушки.
* Далее следует N блоков информации, описывающих переходы между уровнями.
* А именно, i-й блок описывает схему переходов с планет (i−1)-го уровня на планеты i-го уровня.
* Блоки разделяются строками, содержащими один символ "*".
* Планеты на каждом уровне нумеруются последовательными целыми положительными числами от единицы.
* На каждом уровне не более 30 планет. На нулевом уровне только одна планета — та, на которой
* живет Иванушка.
* В первой строке блока записано число Ki — количество планет на i-м уровне.
* Далее следуют Ki строк — по одной для каждой планеты i-го уровня.
* В каждой такой строке перечислены через пробел номера планет предыдущего, (i-1)-го уровня,
* с которых можно перейти на данную планету, и стоимости таких переходов.
* Стоимость каждого перехода — целое число от −32768 до 32767;
* отрицательная стоимость некоторого перехода обозначает тот факт,
* что добрый дух готов доплатить за такой переход.
* Каждая строка с описанием переходов на планету завершается нулем.
Результат
Выведите единственное целое число — минимальную для Иванушки стоимость перехода
* на какую-нибудь планету N-го уровня. Ответ может быть и отрицательным — это будет означать,
* что Иванушка не только доберется до райской планеты,
* но и заработает при этом некоторое количество кредиток.
* Известно, что хотя бы один путь с Иванушкиной планеты на одну из планет N-го уровня существует.
* */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("INPUT.txt"));
            int n = scanner.nextInt();
            ArrayList dots = new ArrayList<Dot>();
            ArrayList ways = new ArrayList<Way>();
            Dot dot1 = new Dot(1, 1);
            Dot dot2 = new Dot(2, 1);
            Way way1 = new Way(dot2, dot1, 15);
            Way way2 = new Way(dot1, dot2, 15);
            if (way1.start == way2.finish) {
                System.out.println("ААа");
            }
//            int[] ways = new int[n * 30*30];
//            int a, b, i;
//            while (scanner.hasNext()) {
//                while (scanner.hasNextInt()) {
//                    i = scanner.nextInt();
//                    if (i != 0) {
//                        a = ways[n - i];
//                        b = ways[scanner.nextInt()] = scanner.nextInt();
//                        ways[n - i] = a + b;
//                    }
//                }
//                scanner.next();
//            }


//            3                 //цикл 3
//            2                 //цикл 2
//            1 15 0            //j = nextint() пока
//            1 5 0
//                    *
//                    3         //цикл 3
//            1 -5 2 10 0
//            1 3 0
//            2 40 0
//                    *
//                    2         //цикл 2
//            1 1 2 5 3 -5 0
//            2 -19 3 -20 0
            scanner.close();
            String out_str = "";


            FileWriter fileWriter = new FileWriter("OUTPUT.txt");
            fileWriter.write(out_str);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
    }
}

class Dot {
    int stage, number;

    public Dot(int stage, int number) {
        this.stage = stage;
        this.number = number;
    }
}

class Way {
    Dot start, finish;
    int length;

    public Way(Dot start, Dot finish, int length) {
        this.start = start;
        this.finish = finish;
        this.length = length;
    }
}
