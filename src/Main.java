public class Main {

    public static void main(String[] args) {
        int i = 0;
        int suma = 0;
        do {
            System.out.println(i * 2);
            suma = suma + i*2;
            i++;

        } while (i < 51);

        System.out.println("Suma wszystkich powyższych liczb wynosi:");
        System.out.println(suma);
    }
}
