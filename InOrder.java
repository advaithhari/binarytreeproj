public class InOrder{
    Node myNode;
    public InOrder(Node node){
        myNode = node;
    }
    public String getOutput(){
        return getOutput(myNode);
    }
   
    public String getOutput(Node currNode){
        if(currNode==null)
            return "";
        return getOutput(currNode.l) + Character.toString(currNode.v) + getOutput(currNode.r);
    }
}