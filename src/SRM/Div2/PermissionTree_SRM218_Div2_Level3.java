package SRM.Div2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: prajesh
 * Date: 23/3/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class PermissionTree_SRM218_Div2_Level3 {

    class TreeNode
    {
        int id;
        TreeNode parent;
        List<TreeNode> children;
        List<String> permissions;

        TreeNode()
        {
            children = new ArrayList<TreeNode>();
            permissions = new ArrayList<String>();
        }

    }
    class Tree
    {
      TreeNode root;

      public boolean add(int parent, TreeNode root, TreeNode node)
      {

          if(root!=null)
          {
              if(root.id == parent)
              {
                  root.children.add(node);
                  return true;
              }

              if(root.children!=null)
              {
                  for(TreeNode childNode : root.children)
                  {
                         return add(childNode.id,childNode,node);
                  }
              }
          }

            return false;
      }
    }





    public static void main(String[] args)
    {
       PermissionTree_SRM218_Div2_Level3 obj = new PermissionTree_SRM218_Div2_Level3();
        obj.test();

    }

    public void test()
    {
        TreeNode rootNode =  new TreeNode();
        rootNode.id=0;
        rootNode.parent=rootNode;

        Tree tree = new Tree();
        tree.root=rootNode;


        TreeNode n1 = new TreeNode();
        n1.id=1;

        tree.add(0,tree.root,n1);


        TreeNode n2 = new TreeNode();
        n2.id=2;

        tree.add(1,tree.root,n2);

        TreeNode n3 = new TreeNode();
        n3.id=5;

        tree.add(2,tree.root,n3);


    }

}
