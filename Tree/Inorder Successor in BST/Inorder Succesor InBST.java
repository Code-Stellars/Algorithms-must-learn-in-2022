class Solution
{
  public Node inorderSuccessor(Node root,Node x)
         {
          //add code here.
         if(root==null || x==null) 
         return null;
         
         Node suc=null;
         while(root!=null)
         {
             if(x.data>=root.data)
             {
                 root=root.right;
             }
             else
             {
                 suc=root;
                 root=root.left;
             }
         }
         return suc;
          
         }  
          }
