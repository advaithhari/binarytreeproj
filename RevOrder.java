public class RevOrder extends InOrder{
    Node myNode;
    public RevOrder(Node node){
        super(node);
        myNode=node;
    }
    public String getOutputString(Node currNode){
        StringBuilder x = new StringBuilder(getOutput(currNode));
        x=x.reverse();
        return x.toString();
    }
}