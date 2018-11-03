package cloud.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.security.Principal;

/**
 * Created by mahesh-5347 on 28-Jun-17.
 */
public class requestWrapper extends HttpServletRequestWrapper {
    String zaaid = "";

    public requestWrapper(HttpServletRequest request, String zaaid) {
        super(request);
        this.zaaid= zaaid;
    }
    public Principal getUserPrincipal() {
        if (zaaid.equals("")) {
            return super.getUserPrincipal();
        }
        return new Principal(){
            @Override
            public String getName() {
                return zaaid;
            }
        };
    }
}
