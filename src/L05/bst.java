/*
 * L05.bst
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L05;


class bst
{
    private node root;

    public static void main(String[] args)
    {
        System.out.println(" Hi there");

    }

    public bst(node root)               //Init
    {
        this.root=root;
    }

    public node getRoot()               //getRoot
    {
        return this.root;
    }

    public void setRoot(node root)      //setRoot
    {
        this.root=root;
    }

    public void insert(node newNode)
    {
        if(newNode==null)
        {
            System.out.println("Node is null");
            return;
        }
        if(this.root==null)
        {
            this.setRoot(newNode);
            return;
        }


        if(newNode.getVal()<this.root.getVal())
        {
            if(root.getLeft()==null)
            {
                root.setLeft(newNode);
                return;
            }
            bst newbst= new bst(this.root.getLeft());
            newbst.insert(newNode);
            return;
        }

        if(newNode.getVal()>=this.root.getVal())
        {
            if(root.getRight()==null)
            {
                root.setRight(newNode);
                return;
            }
            bst newbst= new bst(this.root.getRight());
            newbst.insert(newNode);
            return;
        }

    }

    public void insert(int val)
    {
        node newNode=new node(val);
        this.insert(newNode);
        return;
    }

    public boolean findVal(int val)
    {
        if(this.root==null)
        {
            return false;
        }
        else
        {
            if(this.root.getVal()< val)
            {
                bst newBst=new bst(this.root.getLeft());
                return newBst.findVal(val);
            }
            
            bst newBst=new bst(this.root.getRight());
            return newBst.findVal(val);
        }
    }

    public node findMin()
    {
        if(this.root==null)
        {
            System.out.println("Root doesn't exist, minVal=0");
            return new node(0);
        }

        else if(this.root.getLeft()==null)
        {
            return this.getRoot();
        }

        else
        {
            bst newBst= new bst(this.root.getLeft());
            return newBst.findMin();
        }
    }

    public void delNode(node toDel)
    {
        if(toDel.getLeft()==null & toDel.getRight()==null)
        {
            if(toDel.getParent()==null)
            {
                if(toDel==this.root)
                {
                    System.out.println("Root deleted");
                    this.root=null;
                    return;
                }
                System.out.println("Node to be deleted has no child or parent. Not root.\n Aborting delNode()");
                return;
            }

            if(toDel.getParent().getVal()> toDel.getVal())
            {
                toDel.getParent().delChild(0);
                return;
            }
            else
            {
                toDel.getParent().delChild(1);
                return;
            }
        }

        else if(toDel.getLeft() ==null | toDel.getRight() ==null)
        {
            if(toDel.getParent()==null)
            {
                if(toDel.getLeft()==null)
                {
                    this.root=toDel.getRight();
                    toDel.getRight().delParent();
                    return;
                }
                else{
                    this.root=toDel.getLeft();
                    toDel.getLeft().delParent();
                    return;
                }
            }

            if(toDel.getLeft()==null)
            {
                toDel.getRight().delParent();
                toDel.delParent();
                this.insert(toDel.getRight());
                return;
            }
            else if(toDel.getRight()==null)
            {
                toDel.getRight().delParent();
                toDel.delParent();
                this.insert(toDel.getRight());
                return;
            }
        }

        else
        {
            bst rBst= new bst(toDel.getRight());
            toDel.setVal(rBst.findMin().getVal());
            this.delNode(rBst.findMin());
            return;
        }
    }


}

class node
{
    private int value;
    private node parent=null;
    private node left=null;
    private node right=null;
    public node(int val )
    {
        this.value=val;
    }

    public node(int val, node parent)
    {
        this.value=val;
        this.parent=parent;
    }

    public node(int val, node parent, node left)
    {
        this.value=val;
        this.parent=parent;
        this.left=left;
    }

    public node(int val, node parent, node left, node right)
    {
        this.value=val;
        this.parent=parent;
        this.left=left;
        this.right=right;
    }

    public int getVal()
    {
        return this.value;
    }

    public node getParent()
    {
        if(this.parent!=null)
        {
            return this.parent;
        }
        return null;
    }

    public node getLeft()
    {
        if(this.left!=null)
        {
            return this.left;
        }
        return null;
    }

    public node getRight()
    {
        if(this.right!=null)
        {
            return this.right;
        }
        return null;
    }

    public void setVal(int val)
    {
        this.value=val;
    }

    public void setParent(node Parent)
    {
        this.parent=Parent;
        if(Parent.getVal() > this.value)
        {
            Parent.setLeft(this);
            return;
        }
        Parent.setRight(this);
        return;

    }

    public void setLeft(node Left)
    {
        this.left=Left;
        Left.setParent(this);
    }

    public void setRight(node Right)
    {
        this.right=Right;
        Right.setParent(this);
        
    }

    public void delChild(int i)            //0 for left, 1 for right
    {
        if(i==0)
        {
            this.left=null;
            return;
        }
        if(i==1)
        {
            this.right=null;
        }

        else
        {
            System.out.println("0 to delete left child, 1 for right child, and "+i+" for this message");
            return;
        }
    }

    public void delParent()
    {
        this.parent=null;
    }

    public String toString()
    {
        String str="";
        if(this.value==0)
        {
            return "Uninitiated";
        }
        str+=this.value;
        if(this.parent!=null)
        {
            str+=" Parent= ";
            str+=this.parent.value;
        }

        if(this.left!=null)
        {
            str+=" Left= ";
            str+=this.left.value;
        }

        if(this.right!=null)
        {
            str+=" Right= ";
            str+=this.right.value;
        }

        return str;
    }
}