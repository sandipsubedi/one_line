# Question

104. Maximum Depth of Binary Tree


Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

# Solutions

## Java

```java
class Solution {
    public int maxDepth(TreeNode root) {
     // if root is null, return zero otherwise return the max on each side +1 for current level.
      return root == null ? 0 : Math.max(maxDepth(root.left), (maxDepth(root.right))) + 1;
    }
}
```

## Ruby

```ruby
def max_depth(root)
  root ? 1 + [max_depth(root.left), max_depth(root.right)].max : 0
end
```