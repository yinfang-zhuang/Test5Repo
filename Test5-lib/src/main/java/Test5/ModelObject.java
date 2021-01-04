package Test5;

public class ModelObject {
	  String name;
	  int val;
	  boolean status;
	  double f;
	   
	  public ModelObject(String name, int val, 
	  boolean status, double f) {
	    super();
	    this.name = name;
	    this.val = val;
	    this.status = status;
	    this.f = f;
	  }
	   
	  @Override
	  public String toString() {
	    return "ModelObject [name=" + name + ",val=" + val + ", status="
	    + status + ", f=" + f + "]";
	  }
	 
	}
