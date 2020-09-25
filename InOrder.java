public class InOrder{
    Node myNode;
    public InOrder(Node node){
        myNode = node;
    }
    public String getOutput(){
        return getOutput(myNode);
    }
    public String getOutput(Node currNode){
       if(currNode.l!=null && currNode.r!=null){
           return getOutput(currNode.l) + currNode.v + getOutput(currNode.r);
       }
       else if(currNode.l!=null){
           return getOutput(currNode.l) + currNode.v;
       } 
       else if(currNode.r!=null){
           return getOutput(currNode.r);
       }
       
       return Character.toString(currNode.v);
       
    }
}