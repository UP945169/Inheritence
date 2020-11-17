public class MinibusTest {
    public static void main(String[] args) {
        Minibus Rental = new Minibus("BLV",453, 3,10,100,5);
        //EX4
        Rental.setCustomers(3);
        System.out.println(Rental.getCustomers());
    }
}
