package DFS;

import java.util.ArrayList;
import java.util.List;

public class FindAllTreePaths {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        int sum = 23;
        List<List<Integer>> result = FindAllTreePaths.findPaths(root, sum);
        System.out.println("Tree paths with sum " + sum + ": " + result);
    }

    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        findCurrPath(root, sum, currPath, allPaths);
        return allPaths;

    }

    private static void findCurrPath(TreeNode root, int sum, List<Integer> currPath, List<List<Integer>> allPaths){
        //base case
        if(root == null){
            return;
        }

        currPath.add(root.val);

        if(sum == root.val && root.left == null && root.right == null){
            allPaths.add(new ArrayList<>(currPath));
        }

        findCurrPath(root.left, sum- root.val, currPath, allPaths);
        findCurrPath(root.right, sum- root.val, currPath, allPaths);

        currPath.remove(currPath.size()-1);
    }
}
