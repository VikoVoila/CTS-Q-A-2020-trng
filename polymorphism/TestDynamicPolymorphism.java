package Check;

public class TestDynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= null;
		e= new Employee();
		e= new Manager();
		e.work();
		e= new Admin();
		//((Admin) e).adminWork();
		Manager m = (Manager) e;
		m.work();
		e= new Engineer();
/*		Employee e1 = new Manager();
		e1.work();
		Manager m1=(Manager) e1;
		m1.manageWork();
		//Employee e2=(Employee) m1;
		if(e1 instanceof Admin) {
			((Admin) e1).adminWork();
		}else {
			((Engineer) e1).engineer();
		}*/
	}

}
