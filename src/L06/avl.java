/*
 * L06.avl
 *
 * Saurabh Mittal
 * <saurabh.sm.mitta@gmail.com> <f2015523@pilani.bits-pilani.ac.in>
 *
 * File Last modified on 6/6/18 7:09 PM
 */

package L06;
import java.math.*;

class avl
{
    private node root;

    public static void main(String[] args)
    {

    }

    public void insert(node x)
    {
        if(this.root==null)
        {
            root=x;
            return;
        }
        insert(x, this.root);
        avLify(x);
    }

    public void avLify(node x)
    {
        /* Todo */
    }

    public void insert(node x, node p)
    {
        if(p.getHeight()>x.getHeight())
        {
            if(p.getRight()==null)
            {
                x.setParent(p);
                return;
            }
            insert(x, p.getRight());
            return;
        }
        if(p.getLeft()==null)
        {
            x.setParent(p);
            return;
        }
        insert(x, p.getLeft());
        return;

    }

    public void rotate(node x,int mode)              //0 for right rotate, 1 for left rotate
    {
        if(mode==0)
        {
            rightRotate(x);
            return;
        }

        if(mode==1)
        {
            leftRotate(x);
            return;
        }
        System.out.println("0 for Right rotate, 1 for left rotate and "+mode+" for this messsage");
        return;

    }

    public void leftRotate(node x)
    {
        node y=x.getLeft();
        node a=x.getLeft();
        node b=y.getLeft();
        node c=y.getRight();
        node p=x.getParent();

        try {
            x.setLeft(a);
            
        } catch (Exception e) {
        }

        try {
            x.setRight(b);
            
        } catch (Exception e) {
        }

        try {
            y.setRight(c);
            
        } catch (Exception e) {
        }

        try {
            y.setLeft(x);
        } catch (Exception e) {
        }

        try {
            y.setParent(p);
        } catch (Exception e) {
        }

        return;
    }


    public void rightRotate(node y)
    {
        node x=y.getRight();
        node b=x.getRight();
        node p=y.getParent();

        try {
            y.setLeft(b);
        } catch (Exception e) {
        }

        try {
            x.setRight(y);
        } catch (Exception e) {
        }

        try {
            x.setParent(p);
        } catch (Exception e) {
        }

        return;
    }
}

class node
{
    private int value;
    private node parent=null;
    private node left=null;
    private node right=null;
    private int height=-1;
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

    public int getHeight()
    {
        return this.height;
    }

    public void setVal(int val)
    {
        this.value=val;
    }

    public void updateHeight()
    {
        int largest=1;
        if(this.right==null & this.left==null)
        {
            this.height=-1;
            return;
        }
        if(this.right==null & this.left!=null)
        {
            this.height=this.getLeft().getHeight()+1;
            return;
        }

        if(this.left==null & this.right!=null)
        {
            this.height=this.getRight().getHeight()+1;
            return;
        }
        if(this.getRight().getHeight()>largest)
        {
            largest=this.getRight().getHeight();
        }
        if(this.getLeft().getHeight()>largest)
        {
            largest=this.getLeft().getHeight();
        }
        this.setHeight(largest+1);


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

    public void setHeight(int h)
    {
        this.height=h;
        return;
    }

    public void incHeight()
    {
        this.height++;
        return;
    }

    public void decHeight()
    {
        this.height--;
        return;
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