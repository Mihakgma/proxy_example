package dynamic_proxy_example_jr;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler {

private Person person;

public PersonInvocationHandler(Person person) {
    // the oroginal object link sets into handlers field
   this.person = person;
}

 @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       // here we catch the invocation of any method and 
       // add before it's work some own print() output
       System.out.println("Hey from Proxy pattern!");
       if (method.getName().startsWith("say")) {
           System.out.println("Being a proxy-obj I has been prohibited to speak!");
           System.out.println("Let the person say him- / herself!");
           return null;
       }
       return method.invoke(person, args);
   }
}
