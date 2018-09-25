public class Main {

    public static void main(String[] args) {
	int i = 0;
	int suma = 0;
	while (i < 101) {
	   if (i % 2 != 0){
	       suma += i;
	       i += 2;
        i++;
        continue;
       }
       System.out.println(i);
	   i++;
    }

        System.out.println("suma liczb parzystych z przedziału 0 --> 100 wynosi " + suma);

    }
}
