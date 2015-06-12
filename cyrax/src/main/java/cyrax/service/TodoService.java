package cyrax.service;

import org.springframework.stereotype.Component;

@Component
public class TodoService implements ITodoService {
	
	public void bing(){
		System.out.println("#bing#");
	}

}
