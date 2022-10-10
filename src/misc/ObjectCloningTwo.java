package misc;

public class ObjectCloningTwo implements Cloneable{

	int i = 19;
	
	// This is the method which is work for clone a object
	public Object cloneIsJustAName() throws CloneNotSupportedException{
		return super.clone();
	}
}
