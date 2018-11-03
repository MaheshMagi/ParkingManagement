public class CarDetails{

    public String Username ;
    public String CarModel;
    public String StartDate;
    public String EndDate;
    public String SlotName;
    public CarDetails(String Username, String CarModel, String StartDate ,String EndDate){
        this.Username = Username;
        this.CarModel= CarModel;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getSlotName() {
        return SlotName;
    }

    public void setSlotName(String slotName) {
        SlotName = slotName;
    }
}