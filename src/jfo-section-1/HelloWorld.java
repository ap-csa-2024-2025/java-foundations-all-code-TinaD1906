    import javax.swing.JOptionPane;
    import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10000;
        byte y = 2;
        short z = 1000;
        long b = 1000000000000L;


        int i = 0;
        System.out.println("i loop");
        while (i<10)
        {
            System.out.println(i++);
        }

        int j = 0;
        System.out.println("j loop");
        while (j<10)
        {
            System.out.println(++j);
        }







        int eggsPerChicken = 5;
        int chickenCount = 3;
        int eggsPerDay = 0;

        //Monday
        eggsPerDay = eggsPerChicken*chickenCount;
        System.out.println(eggsPerDay)

        //Tuesday
        chickenCount = ++chickenCount;


        //Wednesday
        chickenCount = chickenCount/2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade level (number):" );
        int grade = sc.nextInt();
        System.out.println("Next year, you are in grade "+ (grade +1));

        sc.close()

        Scanner scan = new Scanner(Input04.class.getResourcesAs)



        

    }
}
