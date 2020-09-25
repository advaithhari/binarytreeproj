import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception{
        Scanner file = new Scanner(new File("test.dat"));
        int t = file.nextInt();
        file.nextLine();
        while(t-->0)
        {
            String s = file.nextLine();
            Node head = new Node(s.charAt(0));
            for(int i = 1; i < s.length(); i++)
                head.add(new Node(s.charAt(i)));
            InOrder inOrder = new InOrder(head);
            System.out.println(inOrder.getOutput());
            
        }
    }
    
    
    
}









 
 
 
 
