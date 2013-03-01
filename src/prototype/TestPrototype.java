package prototype;

import java.lang.Object;

/** Prototype Class **/
class Cookie implements Cloneable {
   public Object clone()
   {
       try{
           //In an actual implementation of this pattern you would now attach references to
           //the expensive to produce parts from the copies that are held inside the prototype.
           return this.getClass().newInstance();
       }
       catch(InstantiationException e)
       {
          e.printStackTrace();
          return null;
       }
       catch (IllegalAccessException e) {
    	   e.printStackTrace();
           return null;
       }
   }
}

/** Concrete Prototypes to clone **/
class CoconutCookie extends Cookie { }

/** Client Class**/
class CookieMachine
{

  private Cookie cookie;//cookie�����ǿɸ��Ƶ�

    public CookieMachine(Cookie cookie) { 
        this.cookie = cookie; 
    } 
    public Cookie makeCookie() { 
      return (Cookie)cookie.clone(); 
    } 
    public Object clone() { return null; } 

    public static void main(String args[]){ 
        Cookie tempCookie =  null; 
        Cookie prot = new CoconutCookie(); 
        CookieMachine cm = new CookieMachine(prot); //����ԭ��
        for (int i=0; i<100; i++) {
            tempCookie = cm.makeCookie();//ͨ������ԭ�ͷ��ض��cookie 
        }
    } 
}

public class TestPrototype {

}
