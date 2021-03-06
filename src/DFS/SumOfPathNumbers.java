package DFS;

public class SumOfPathNumbers {

    public static int findSumOfPathNumbers(TreeNode root) {
        // TODO: Write your code here
        return findSum(root, 0);
    }

    private static int findSum(TreeNode root, int totalSum){

        if(root == null){
            return 0;
        }

        totalSum = 10 * totalSum + root.val;

        if(root.left == null && root.right == null){
            return totalSum;
        }

        return findSum(root.left, totalSum) + findSum(root.right, totalSum);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
        System.out.println("Total Sum of Path Numbers: " + SumOfPathNumbers.findSumOfPathNumbers(root));
    }
}


