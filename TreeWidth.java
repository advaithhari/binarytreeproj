public class TreeWidth {
    Node myNode;
    TreeHeight t = new TreeHeight(myNode);
    public TreeWidth(Node node)
    {
        myNode = node;
    }

    public int getWidth(Node node, int level){

            if(node == null)
            {
                return 0;
            }
            else if(level == 1)
            {
                return 1;
            }
            else if(level>1)
            {
                return getWidth(node.l, level-1) +getWidth(node.r,level-1);
            }
            else {
                return 0;
            }
          
    }

        public int maxWidth(Node node)
        {
             int h = t.getTreeHeight(node,)
        }
}