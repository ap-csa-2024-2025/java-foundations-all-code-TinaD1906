public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
         int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = 0;

        //Monday
        totalEggs += eggsPerChicken*chickenCount;

        //Tuesday
        totalEggs += ++chickenCount * eggsPerChicken;

        //Wednesday
        totalEggs += eggsPerChicken*(chickenCount/=2);


        System.out.println(totalEggs);
    }   
}
