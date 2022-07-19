
# README.md
## Tree
#### Description
Tree is a data structure where the data is organized in a hierarchical structure. There should be one root node (which does not have any parent) and all subsequent nodes are represented as children of the root node and its children. If a node has at least one child, it is called internal node and nodes with no children are called leaf nodes.

* Basic Structure
````
class Tree<E>{
E value;
Tree left;
Tree right;
}
````
This basic structure is for a binary tree where each internal tree has at least one and at most two children. left and right represent the two children and value is the placeholder for data.

### Properties
Tree data structure gives the facility to organize data in a hierarchical structure
Tree nodes can be inserted in a sorted order which can be used for searching and inserting data in O(logN) time when N is the number of nodes.

#### Types of Trees
* Binary Search Tree::  A binary tree where the elements are inserted in sorted order. Here the searching can be done in O(logN) time in (depending on the structure)
* AVL Tree and Red-Black Tree: Binary search trees where the height is balanced. Here, searching is guaranteed to be in O(logN) time.
* MultiWay Search Tree: Tree in sorted order, but more than two children in each internal node.