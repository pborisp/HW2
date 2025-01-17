public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача4:");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача6:");
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;
        System.out.println("Масса одного боксера = " + weightFighter1 + " кг");
        System.out.println("Масса второго боксера = " + weightFighter2 + " кг");
        var weightAll = weightFighter1 + weightFighter2;
        System.out.println("Общая масса двух бойцов = " + weightAll + " кг");
        var weghitDif = weightFighter2 - weightFighter1;
        System.out.println("Разница между массами бойцов = " + weghitDif + " кг");

        System.out.println("Задача7:");
        var ostatok = weightFighter2 % weightFighter1;
        System.out.println("Остаток от деления = " + ostatok + " кг");

        System.out.println("Задача8:");
        var hours = 640;
        var norma = 8;
        var personal = hours / norma;
        System.out.println("Всего работников в компании - " + personal + " человек");
        personal = personal + 94;
        hours = personal * norma;
        System.out.println("Если в компании работают " + personal + " человек, то всего " + hours + " часа(ов) работы может быть поделено между сотрудниками.");

    }
}