import java.io.File;
import java.util.*;
public class PreOrder {


   Node myNode;

   public PreOrder(Node node) {
       myNode = node;
   }
   public String getOutput(){
       return getOutput(myNode);
   }
   
   public String getOutput(Node currNode){
    if(currNode.l!=null && currNode.r!=null){
        return currNode.v + getOutput(currNode.l)  + getOutput(currNode.r);
    }
    else if(currNode.l!=null){
        return currNode.v + getOutput(currNode.l);
    } 
    else if(currNode.r!=null){
        return currNode.v + getOutput(currNode.r);
    }
    
    return ""+currNode.v;
    
 }
}