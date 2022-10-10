package misc;


public class ObjectCloningOne {
	
	public void cloningOfAClassObject() throws CloneNotSupportedException {		
		ObjectCloningTwo abc = new ObjectCloningTwo();
		System.out.println(abc.i);
		
		ObjectCloningTwo a = (ObjectCloningTwo)abc.cloneIsJustAName();
		System.out.println(a.i);
	}
	
}
