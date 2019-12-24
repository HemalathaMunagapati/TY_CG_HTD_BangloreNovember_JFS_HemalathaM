package com.caps.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caps.springcore.beans.Hello;
import com.caps.springcore.beans.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); 
        Hello hello=context.getBean(Hello.class);
        Hello hello1=context.getBean(Hello.class);
        
        System.out.println("************************");
        System.out.println(hello==hello1);
        System.out.println(hello.getMsg());
        System.out.println(hello.getCount());
        System.out.println(hello);
        System.out.println(hello1);
        
        System.out.println("************************");
        Animal animal=context.getBean(Animal.class);
        animal.makeSound();
        animal.makeSound();
        

        System.out.println("************************");
        Pet pet=context.getBean(Pet.class);
        System.out.println(pet.getName());
        pet.getAnimal().makeSound();
    }
}
