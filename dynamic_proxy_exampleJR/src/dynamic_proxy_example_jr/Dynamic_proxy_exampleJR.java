package dynamic_proxy_example_jr;

import java.lang.reflect.Proxy;

/**
 *
 * @author tabakaev_mv
 */
public class Dynamic_proxy_exampleJR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Создаем оригинальный объект
       Man vasia = new Man("Вася", 30, "Санкт-Петербург", "Россия");
       
       //Получаем загрузчик класса у оригинального объекта
       // reflexion's method work to get class method
       ClassLoader vasiaClassLoader = vasia.getClass().getClassLoader();

       //Получаем все интерфейсы, которые реализует оригинальный объект
       Class[] interfaces = vasia.getClass().getInterfaces();

       //Создаем прокси нашего объекта vasia
       Person proxyVasia = (Person) Proxy.newProxyInstance(vasiaClassLoader, 
                                    interfaces, 
                                    new PersonInvocationHandler(vasia));

       //Вызываем у прокси объекта один из методов нашего оригинального объекта
       proxyVasia.introduce();
       print(proxyVasia);
       proxyVasia.sayAge(1);
       // cannot call class methods doesnt impliments with interface
       // java.lang.RuntimeException: Uncompilable code - cannot find symbol
       // proxyVasia.setName("reddis"); 
    }
    public static void print(Object obj) {
    System.out.println(obj);}
}
