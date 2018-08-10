package arithmetic.test.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
    TreeNode root;
    public BinaryTree(){

    }
    public BinaryTree(TreeNode root){
        this.root = root;
    }

    public void createBinaryTree(List<TreeNode> list){
        if(list == null || list.size() == 0){
            return;
        }
        for(int i = 1; i < list.size(); i++){
            addNode(root, list.get(i));
        }
    }
    public void addNode(TreeNode tempRoot, TreeNode node){
        if(tempRoot == null){
            tempRoot = node;
            return;
        }

        if(tempRoot.left == null){
            tempRoot.left = node;
            return;
        }
        else{
            if(tempRoot.right == null){
                tempRoot.right = node;
                return;
            }
            else{
                if(tempRoot.left.left == null || tempRoot.left.right == null){
                    addNode(tempRoot.left, node);
                }
                else{
                    addNode(tempRoot.right, node);
                }
            }
        }
    }

    public TreeNode lowestCommonAncestor(List<TreeNode> list, TreeNode root, TreeNode p, TreeNode q){
        getListContainNode(list, root, p, q);
        if(list != null){
            return list.get(list.size()-1);
        }
        return null;
    }
    public void getListContainNode(List<TreeNode> list, TreeNode root, TreeNode p, TreeNode q){
        if(containNode(root, p) && containNode(root, q)){
            list.add(root);
        }
        if(root.left != null){
            getListContainNode(list, root.left, p, q);
        }
        if(root.right != null){
            getListContainNode(list, root.right, p, q);
        }
    }
    public boolean containNode(TreeNode root, TreeNode node){
        if(root == node){
            return true;
        }
        else{
            if(root.left != null){
                return containNode(root.left, node);
            }
            if(root.right != null){
                return containNode(root.right, node);
            }
        }

        return false;
    }

    /**
     * 递归遍历
     * @param tempRoot
     */
    public void traverseRecursion(TreeNode tempRoot){
        System.out.println(tempRoot.val);
        if(tempRoot.left != null){
            traverseRecursion(tempRoot.left);
        }
        if(tempRoot.right != null){
            traverseRecursion(tempRoot.right);
        }
    }

    /**
     * 非递归遍历
     * @param root
     */
    public void traverseNoRecursion(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tempRoot = root;
        if(tempRoot != null){
            System.out.println(tempRoot.val);
        }
        while(true){
            if(tempRoot.left != null || tempRoot.right != null) {
                if (tempRoot.left != null) {
                    tempRoot = tempRoot.left;
                }
                if (tempRoot.right != null) {
                    stack.push(tempRoot.right);
                }
                System.out.println(tempRoot.val);
            }
            else if(!stack.isEmpty()){
                tempRoot = stack.pop();
                System.out.println(tempRoot);
            }
            else{
                break;
            }
        }
    }
    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree(new TreeNode(10));
        List<TreeNode> list = new ArrayList<>();
        for(int i = 0; i < 7; i++){
            list.add(new TreeNode(i));
        }
        binaryTree.createBinaryTree(list);
        List<TreeNode> listNodes = new LinkedList<>();
        TreeNode lowestAncestornode = binaryTree.lowestCommonAncestor(list, binaryTree.root, list.get(5), list.get(6));

        binaryTree.traverseRecursion(binaryTree.root);
        System.out.println("***********************");
        binaryTree.traverseRecursion(binaryTree.root);
        //System.out.println(lowestAncestornode.val);
    }
}
