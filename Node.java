public class Node{  
    char v;  
    Node l,r;  
    public Node(char a)  {    
      v = a;  
      
    }  
    public void add(Node n)  {    
        if(n.v<=v){      
            if(l==null)        
                l = n;      
            else        
                l.add(n);    
        
        }    
        if(n.v>v){      
            if(r==null)        
                r = n;      
            else        
                r.add(n);    
        }  
    }  
    
    
}    
    
    
    
   
    
   
    
   
    
   
    
   
    
   
    
   
    
