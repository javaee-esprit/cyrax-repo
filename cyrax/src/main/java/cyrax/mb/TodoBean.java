package cyrax.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import cyrax.service.ITodoService;

@ManagedBean
@RequestScoped
public class TodoBean {
	
	@ManagedProperty("#{todoService}")
	private ITodoService todoService;
	public void setTodoService(ITodoService todoService) {
		this.todoService = todoService;
	}
	
	public TodoBean() {
	}
	
	
	public String doBing(){
		String navigateTo = null;
		todoService.bing();
		return navigateTo;
	}

}
