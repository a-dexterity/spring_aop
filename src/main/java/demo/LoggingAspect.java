package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout())")
    public void beforelogger(..){
        System.out.println(" before logger");
    }

//     these two dots in the function will match whatever parameters are provided in the function,
//     so that our aspect will be called.
//     3 stars in the execution defines
//    1. return type
//    2. package
//    3.class
    @After("execution(* *.*.checkout())")
    public void afterlogger(..){
        System.out.println("after logger");
    }
}
