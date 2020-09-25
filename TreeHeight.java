import java.io.*;
import java.util.*;
public class TreeHeight{
    Node myNode;
    int height;

    public int getTreeHeight(Node node, int depth){
        height = depth;
        if (myNode.l != null){
            height = Math.max(depth, getTreeHeight(myNode.l, depth+1));
        }
        if (myNode.r != null){
            height = Math.max(depth, getTreeHeight(myNode.r, depth+1));
        }
        return height;
    
    }
}