package ifpb.ads.mavenproject4;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 31/08/2016, 08:35:23
 */
@Named
@RequestScoped
public class Controlador {

    @Inject
    private Hello hello;

    private Pessoa pessoa;

    public Controlador() {
        pessoa = new Pessoa();
    }

    public String get() {
        return hello.get(pessoa);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String ir() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().put("pessoa", pessoa);
        return "hello";
    }
}
