//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

/**Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
 * Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
 * берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
 * Мумкун болгон каталар: 1) берилген маалымат терс сан болсо 2) берилген маалымат сан эмес
 * тамга болсо 3) жана озунуздор берген кошумча каталар болсо да болот Параллелепипед: - Фигуранын
 * аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width)); - Фигуранын
 * коломун эсептеген формула: (length*width*height); -Формулалар Parallelepiped классында жазылуусу керек
 * Цилиндр: - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius); - Фигуранын коломун
 * эсептеген формула: (PI*radius*radius*height); -Формулалар Cylinder классында жазылуусу керек Бардык
 * Exception дор логикасы main класста жазылcын Бардык маалмыттар консоль аркылуу берилсин Программа
 * кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

while(true){
try{
    System.out.println("""
            Choice shape: 
            1. Parallelepiped
            2. Cylinder
            0. Exit
            """);
    int choice = new Scanner(System.in).nextInt();
    switch (choice){
        case 1:

            System.out.println("Enter shape length: ");
            double length = scanner.nextDouble();
            System.out.println("Enter shape width: ");
            double width= scanner.nextDouble();
            System.out.println("Enter shape height: ");
            double height= scanner.nextDouble();
            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
            System.out.println("Area of parallelepiped: "+parallelepiped.areaPar());
            System.out.println("Volume of parallelepiped: "+parallelepiped.volumePar());
            break;
        case 2:
            System.out.println("Enter shape radius: ");
            double radius = scanner.nextDouble();
            System.out.println("Enter shape height: ");
            height= scanner.nextDouble();
            Cylinder cylinder = new Cylinder(radius, height);
            System.out.println("Area of cylinder: "+cylinder.areaCylinder());
            System.out.println("Volume of: "+cylinder.volumeCylinder());
break;
        case 0:
            System.out.println("Exit");
            System.exit(0);
    }


} catch (MyException e) {
    throw new RuntimeException(e);
}


    }
    }
}