package ws;

import java.sql.Date;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;
// POJO Plain Old Java OBject

@webServices (servicesName = " banqueWS")

public class banqueService {
    @webMethod(OperaitionName = "convert")
    public double couvertion(@webparam( name = "monton")double mt){
        return mt*10.54;
    }
    @webMethod
public compte getCompte(@webparam( name = "code") int code){
    return new compte(code, Math.random()*9888, new Date(code));

}
@webMethod
public List<compte> listeComptes(){
    return List.of(
        new compte(1, Math.random()*9888, new Date(1));
        new compte(2, Math.random()*9888, new Date(2));
        new compte(3, Math.random()*9888, new Date(3));        
    );
}
}
