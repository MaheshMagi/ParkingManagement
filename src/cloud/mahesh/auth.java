package cloud.mahesh;

import com.adventnet.client.AuthInterface;
import com.adventnet.client.view.web.ViewContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mahesh-5347 on 22-Jun-17.
 */
public class auth implements AuthInterface {
    @Override
    public Long getAccountID() {
        return Long.valueOf(5);
    }

    @Override
    public String getLoginName() {
        return "Mahesh";
    }

    @Override
    public Long getUserID() {
        return Long.valueOf(1);
    }

    @Override
    public boolean userExists(String s) {
        return false;
    }

    @Override
    public Object encrypt(Object o, Object o1, HttpServletRequest httpServletRequest) {
        return o1;
    }

    @Override
    public Object encrypt(Object o) {
        return o;
    }

    @Override
    public String getListViewTotalHtmlString(ViewContext viewContext) {
        return "viewContext";
    }
}
