class  ConChaining
{ 
    
   
    ConChaining()   // default constructor  
    { 
         
        this(5); // calls parameterized constructor having 1 parameter 
        System.out.println("Inside the default constructor"); 
    } 
  
    
    ConChaining(int x)  // parameterized constructor 
    { 
         
        this(5, 15); // calls parameterized constructor having 2 parameters 
        System.out.println(x); 
    } 
  
    
    ConChaining(int x, int y) // parameterized constructor having 2 parameters
    {   
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
         
       ConChaining c= new ConChaining(); // invokes default constructor  
    } 
}

