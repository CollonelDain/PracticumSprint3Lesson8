

public class PiTri {

    public static void main(String[] args) {
        System.out.println("Lets start");
        if(args == null || args.length == 0){
            System.out.println("Введите количество пифагоровых троек для вывода или введите три числа для проверки.");
            return;
        }
        if(args.length == 1){ //вывести N троек
            int N = Integer.parseInt(args[0]);
            int a = 1;
            int i = 0;
            while (i < N && a < 1000){
                int b = 1;
                while (i < N && b < 1000) {
                    int c = 1;
                    while (i < N && c < 1000){
                        if(checkTriple(a, b, c)){
                            System.out.println("Числа " + a + ", " + b + ", " + c + " являются пифагоровой тройкой");
                            i++;
                        }
                        c++;
                    }
                    b++;
                }
                a++;
            }
        } else if (args.length == 3) { //проверить три числа
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            if(checkTriple(a, b, c)){
                System.out.println(a + ", "+ b + ", "+ c + " — это настоящая пифагорова тройка!");
            } else {
                System.out.println("Эти числа не являются пифагоровой тройкой");
                System.out.println("Поищите еще :(");
            }
        }
    }

    private static boolean checkTriple(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

}