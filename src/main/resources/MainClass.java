import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class MainClass {

	@PostConstruct
	public void init(){
		System.out.print("Bean Executado!");
	}
	
	public String getMessage(){
		return "Hello Jsf";
	}
}
