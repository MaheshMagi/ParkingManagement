import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.text.ParseException;
import java.util.Date;

public class LinkingClass extends DispatchAction {
    public ActionForward Register(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception {
        return mapping.findForward("Register");
    }
    public ActionForward Entry(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception {
        return mapping.findForward("Entry");
    }
    public ActionForward RegisterProcess(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception{
        {
            String Username = req.getParameter("Username");
            String CarModel = req.getParameter("CarModel");
            String StartDate = req.getParameter("StartDate");
            StartDate= DateFormatter(StartDate);
            String EndDate = req.getParameter("EndDate");
            EndDate = DateFormatter(EndDate);
            System.out.println(Username+"----"+CarModel+"----"+StartDate+"-----"+EndDate);
            CarDetails carDetails = new CarDetails(Username,CarModel,StartDate,EndDate);
            CarParking myCarPark = new CarParking();
            try {
                if(DateCheck(StartDate,EndDate)) {
                    myCarPark.addVehicles(carDetails);
                    String htmlResponse = "<br> You have been Successfully Added <br>" + " Username is :" + Username + " CarModel is :" + CarModel;
                    req.setAttribute("htmlResponse", htmlResponse);
                }
            }
            catch (DateTimeException dte){
                String htmlResponse= "<br><br>Sorry Invalid Start and End Date";
                req.setAttribute("htmlResponse",htmlResponse);
            }
            catch (Exception c){
                String htmlResponse= "<br><br>Sorry :( the Car Park is full,wait for slots";
                req.setAttribute("htmlResponse",htmlResponse);

            }
        }
        return mapping.findForward("RegisterProcess");
    }
    public ActionForward View(ActionMapping mapping,ActionForm form, HttpServletRequest req, HttpServletResponse res)throws Exception{
        return mapping.findForward("View");
    }
    public String DateFormatter(String s) throws ParseException{
        String date =s.replace("T"," ");
        return date;
    }
    public boolean DateCheck(String StartDate, String EndDate){
        try {

            SimpleDateFormat d = new SimpleDateFormat("DD-MM-YYYY HH:mm");
            Date start = d.parse(StartDate);
            Date end = d.parse(EndDate);
            if(start.after(end)){
                throw new Exception();
            }
        }
        catch (Exception e){
            throw new DateTimeException("Message");
        }
        return true;
    }

}
