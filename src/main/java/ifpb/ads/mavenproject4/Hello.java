package ifpb.ads.mavenproject4;

import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 31/08/2016, 08:34:56
 */
@Stateless
public class Hello {

    public String get(Pessoa pessoa){
        return "oi, "+pessoa.getNome();
    }
}
