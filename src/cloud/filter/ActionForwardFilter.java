package cloud.filter;

import cloud.wrapper.requestWrapper;
import com.datastax.driver.core.Session;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * Created by mahesh-5347 on 27-Jun-17.
 */
public class ActionForwardFilter implements Filter {

    private static final Logger LOGGER = Logger.getLogger(ActionForwardFilter.class.getName());
    static Pattern allowPattern = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String url = filterConfig.getInitParameter("Allow");
        allowPattern = Pattern.compile(url);
        LOGGER.log(Level.WARNING,"\n\n\n\n\n\n\n\n======= in init method ====\n\n\n\n\n\n");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        if ((session.getAttribute("Org_name") != null) || allowPattern.matcher(httpServletRequest.getRequestURI()).matches()) {
            servletRequest = new requestWrapper(httpServletRequest, (String) session.getAttribute("Org_name"));
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }*/
    }

    @Override
    public void destroy() {
        LOGGER.log(Level.INFO, "ActionForwardFilter destroy");
    }
}
