import java.sql.ResultSet;


public class CarParkDb {
    public static void insertTimeSlotTableDb(CarDetails carDetails,int slot_count){
        String slot_name = "";
        try {
            String updateQuery = "INSERT INTO TIMESLOTTABLE VALUES ('"+carDetails.getUsername()+"','"+slot_count+"','"+carDetails.StartDate+"','"+carDetails.EndDate+"');";
            DatabaseOperation.updateQuery(updateQuery);
            String sQuery = "SELECT SLOT_NAME FROM SLOT WHERE SLOT_NO ='"+slot_count+"';";
            ResultSet resultSet = DatabaseOperation.selectQuery(sQuery);
            while(resultSet.next()){
                slot_name = resultSet.getString(1);
            }
            String pmdQuery = "INSERT INTO ParkingManagementDatabase VALUES ('"+carDetails.getUsername()+"','"+slot_name+"','"+carDetails.getCarModel()+"','"+carDetails.StartDate+"','"+carDetails.EndDate+"');";
            DatabaseOperation.updateQuery(pmdQuery);

        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}

