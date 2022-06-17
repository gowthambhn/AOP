package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect
{

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
       System.out.println(jp.getSignature());
        System.out.println("Before Logger");
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }


    @AfterReturning(value = "execution(* demo.ShoppingCart.quantity())", returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("AfterReturning : " + retVal);
    }
}
