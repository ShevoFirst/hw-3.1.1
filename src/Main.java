public class Main {
    public static void main(String[] args) {
        //задание 1
        int age = 70;
        if(age>=18){
            System.out.println("поздравляю с совершеннолетием!");
        }else {
            System.out.println("возраст совершеннолетия ещё не наступил");
        }
        //задание 2
        if (age>=24){
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }else if (age>=18) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else if (age>=7) {
            System.out.println("ребенок ходит в школу");
            System.out.println();
        }
        //Задание 3
        int totalPlaceForTrain = 102;
        int totalSeadingPlaceForTrain = 60;
        int totalPeople = 67;

        if (totalPeople>totalPlaceForTrain)
        System.out.println("свободных мест нету");
        else if (totalPeople<totalSeadingPlaceForTrain){
            System.out.println("есть стоячее место");

        } else {
            System.out.println("есть сидячее место");

        }
        //задание 4
        short age1 = 5;
        if (age1>=2 && age1 <= 6)
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить в дет сад");
        else if (age1>=7 && age1 <= 18)
            System.out.println("Если возраспиат человека равен "+ age1 +", то ему нужно ходить в школу");
        else if (age1>18 && age1 <= 24)
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить в универ");
        else if (age1>=24)
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить на работу");
        //Задание 5
        short age2 = 1;
        if (age2<5)
            System.out.println("не можешь кататьс на аттракионе");
        else if (age2>=5 && age2 <= 14)
            System.out.println("");
        else if (age2>18 && age2 <= 24)
            System.out.println("может кататься только в сопровождении взрослого." +
                    " Если взрослого нет, то кататься нельзя");
        else if (age1>=14)
            System.out.println("может кататься без сопровождения взрослого");
        //задача 5

        int one = 100;
        int two = 22;
        int free = 3;
        if (one > two) {
            if (one > free)
                System.out.println("большее число " + one);
        }
        else if (two > free)
                System.out.println("большее число " + two);
        else
                System.out.println("большее число " + free);

    }
}