import com.adventnet.ds.query.Column;
import com.adventnet.ds.query.SelectQueryImpl;
import com.adventnet.ds.query.Table;
import com.adventnet.mfw.bean.BeanUtil;
import com.adventnet.persistence.DataObject;
import com.adventnet.persistence.Persistence;
import com.adventnet.persistence.Row;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;

/**
 * Created by mahesh-5347 on 07-Jun-17.
 */
public class slot extends DispatchAction{
    public ActionForward slotPage(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception {

        return mapping.findForward("slotPage");

    }
    public ActionForward addSlot(ActionMapping mapping, ActionForm form,HttpServletRequest req,HttpServletResponse res)throws Exception{
        String slotName = req.getParameter("SlotName");
        int slotSize =0;
        ResultSet rs = null;
        int count = 0;
        try {
            System.out.println("in Slot Table----");
            String slotQuery = "SELECT COUNT(*) FROM SLOT;";
            rs = DatabaseOperation.selectQuery(slotQuery);
            while (rs.next()){
                count = rs.getInt(1);
            }
            slotSize = (count+1);
            String updateQuery = "INSERT INTO SLOT VALUES('"+slotSize+"','"+slotName+"');";
            DatabaseOperation.updateQuery(updateQuery);
        } catch (Exception e) {
            System.err.println("\n\n\n\n\n\n-----EXCEPTION IN SLOT-------\n\n\n\n\n\n");
        }
        return mapping.findForward("addSlot");
    }
    public ActionForward viewSlot(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws Exception {

        return mapping.findForward("slotPage");
    }

}
