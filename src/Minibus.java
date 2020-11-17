public class Minibus extends GenericAPITransportBase{
    public Minibus(
            String Organisation,
            int transportID,
            int customers,
            double fuel,
            double fuelCapacity,
            int seats){
        super();


        setOrganisation(organisation);
        setID(transportID);
        setCustomers(customers);
        setFuel(fuel);
        setFuelCapacity(fuelCapacity);
        setSeats(seats);
    }


    @Override
    public void setSeats(int seats) {
        super.setSeats(seats-1);
    }


 /*   @Override
    protected void setCustomers(int customers) {
        double halfFuel = fuelCapacity/2;
        if(fuel < halfFuel){
            super.setCustomers(1);
        }
        else{
            super.setCustomers(customers);
        }
    }*/

    public void setCustomers(int customers,double fuel,double fuelCapacity) {
        
        super.setCustomers(customers);
    }
}
