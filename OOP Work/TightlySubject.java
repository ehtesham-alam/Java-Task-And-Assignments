class TightlySubject { 
    Topic t = new Topic();                   //Tight Coupling Program
    public void startReading() 
    { 
        t.understand(); 
    } 
} 
class Topic { 
    public void understand() 
    { 
        System.out.println("Tight coupling concept"); 
    } 
} 