import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeCalculation{
    public  static boolean parkingflag=true;
    public static boolean parkingCount=false;
    public static String TimeSlotTable_StartDate=null;
    public static String TimeSlotTable_EndDate= null;
    public static void timeComparison(CarDetails carDetails,int count)throws Exception{
        int slot_capacity = CarParking.maxCapacity;
        int slot_count = count;
        ResultSet resultSet = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date Parking_StartDate = sdf.parse(carDetails.StartDate);
        Date Parking_EndDate = sdf.parse(carDetails.EndDate);
        try {
            System.out.println("------------in try class------------");
            String sQuery = "SELECT * FROM TIMESLOTTABLE WHERE SLOT_NO = '"+slot_count+"';";
            resultSet = DatabaseOperation.selectQuery(sQuery);
            if(!resultSet.next()) {
                parkingflag = true;
            }
            while (resultSet.next()) {
                System.out.println("in Iterator---------------");
                TimeSlotTable_StartDate = resultSet.getString(3);
                TimeSlotTable_EndDate = resultSet.getString(4);
                if (!(dateCompare(TimeSlotTable_StartDate, TimeSlotTable_EndDate, Parking_StartDate, Parking_EndDate))) {
                    break;
                }
            }
            if(parkingflag){
                System.out.println("in If clause--------------");
                parkingCount=true;
                CarParkDb.insertTimeSlotTableDb(carDetails,slot_count);
            }
            if(!parkingflag){
                if(slot_capacity-slot_count>0){
                    timeCalculation.timeComparison(carDetails,(slot_count+1));
                }
                else{
                    throw new Exception();
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("---------------------------Error message in Time Calculation----------------------------------------------------");
            throw new Exception();

        }
    }
    public static  boolean dateCompare(String TimeSlotTable_StartDate,String TimeSlotTable_EndDate,Date Parking_StartDate,Date Parking_EndDate)throws Exception{
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date TST_StartDate = sdf1.parse(TimeSlotTable_StartDate);
        Date TST_EndDate = sdf1.parse(TimeSlotTable_EndDate);
            if((TST_StartDate.equals(Parking_EndDate))||(TST_EndDate.equals(Parking_StartDate))){
                parkingflag=true;
                return parkingflag;
            }
            if(((TST_StartDate.before(Parking_StartDate))||(TST_StartDate.equals(Parking_StartDate)))&&((TST_EndDate.after(Parking_StartDate))||(TST_EndDate.equals(Parking_StartDate)))){
                parkingflag =false;
                return parkingflag;
            }
            else if(((TST_StartDate.after(Parking_StartDate))||(TST_StartDate.equals(Parking_StartDate)))&&((TST_StartDate.before(Parking_EndDate))||(TST_StartDate.equals(Parking_EndDate)))){
                parkingflag = false;
                return parkingflag;
            }

        return parkingflag=true;
    }

}
