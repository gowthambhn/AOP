package demo;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
        System.out.println("authenticate");
    }
    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){
        System.out.println("Authorization");
    }

    @Pointcut("execution(* com.baeldung.pointcutadvice.dao.FooDao.*(..))")

    @Before("authenticatingPointCut() || authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticate the Request");
    }

}
