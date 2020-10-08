import java.io.File;
import java.util.*;
public class PostOrder {


   Node myNode;

   public PostOrder(Node node) {
       myNode = node;
   }
   
    public static String getOutput(Node currNode){
        if(currNode==null)
            return "";
        return getOutput(currNode.l) + getOutput(currNode.r) + Character.toString(currNode.v);
    
    }
}