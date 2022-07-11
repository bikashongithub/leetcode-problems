class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        // create a list ds to store the output
        ArrayList<Integer> op = new ArrayList<>();
        // a helper function that takes level and output list too
        helper(root, op, 0);
        return op;
    }

    public void helper(TreeNode root, List<Integer> list, int level) {
        // if root is null just return
        if (root == null) {
            return;
        }

        // REVERSE INORDER TRAVERSAL

        // at every level check if it's being visited for the first time. If yes, then
        // that must be rightmost node of the tree at that level.Thus add that node's
        // value to the list
        if (list.size() == level) {
            list.add(root.val);
        }
        helper(root.right, list, level + 1);
        helper(root.left, list, level + 1);

    }
}