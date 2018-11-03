import java.sql.ResultSet;
import java.util.ArrayList;
import java.lang.String;
public class CarParking {

    public static int maxCapacity = 0;
    private ArrayList carParkArray;
    public ArrayList DbArray = new ArrayList();

    public CarParking() throws Exception {
        System.out.println("in CarParking.........----");
        this.carParkArray = new ArrayList();
        try {
            String sql = "SELECT * FROM ParkingManagementDatabase";
            ResultSet resultSet = null ;
                resultSet = DatabaseOperation.selectQuery(sql);

                while (resultSet.next()) {
                    String username = resultSet.getString(1);
                    String carModel = resultSet.getString(3);
                    String startDate = resultSet.getString(4);
                    String endDate = resultSet.getString(5);
                    CarDetails carDetails = new CarDetails(username, carModel, startDate, endDate);
                    DbArray.add(carDetails);
                }
            String squery1 = "SELECT * FROM Slot";
            resultSet = DatabaseOperation.selectQuery(squery1);
            while (resultSet.next()){
                maxCapacity = resultSet.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static int getMaxCapacity() {
        return maxCapacity;
    }

    public int numOfAvailableSpots() {
        return (getMaxCapacity() - (DbArray.size() + carParkArray.size()));
    }

    public void addVehicles(CarDetails carDetails) throws Exception {

        try{
            timeCalculation.timeComparison(carDetails, 1);
        } catch (Exception e){
            throw new Exception();
        }

    }
}