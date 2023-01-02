public interface Topic 
{ 
    void understand(); 
} 
class Topic1 implements Topic {                  // Losse Coupling Program
public void understand() 
    { 
        System.out.println("Got it"); 
    } 
} class Topic2 implements Topic { 
public void unserstand() 
    { 
        System.out.println("understand"); 
    } 
} class LooselySubject { 
public static void main(String[] args) 
    { 
        Topic t = new Topic1(); 
        t.understand(); 
    } 
} 