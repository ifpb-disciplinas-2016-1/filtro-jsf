package ifpb.ads.mavenproject4;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 31/08/2016, 08:59:41
 */
@WebFilter(urlPatterns = "/faces/hello.xhtml")
public class Filtro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse rep = (HttpServletResponse) response;

        Pessoa pessoa = (Pessoa) req.getSession().getAttribute("pessoa");

        if (pessoa == null) {
            req.getRequestDispatcher("/faces/index.xhtml").forward(request, response);
//            rep.sendRedirect("http://localhost:8088/filtro-jsf/faces/index.xhtml");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
