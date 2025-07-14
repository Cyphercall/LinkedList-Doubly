# LinkedList-Doubly
# Doubly Linked List Implementation in Java
This project contains a simple implementation of a doubly linked list in Java with basic operations such as insertion, deletion, and display in both forward and backward directions.

Features
* Insert at Beginning: Add a new node at the start of the list.
* Delete at Beginning: Remove the first node of the list.
* Insert at End: Add a new node at the end of the list.
* Delete at End: Remove the last node of the list.
* Display Forward: Print all elements from head to tail.
* Display Backward: Print all elements from tail to head.
  
Code Overview
The class linkedlist_doubly contains an inner Node class representing each element with pointers to both the next and previous nodes. The main class manages the head pointer and provides methods for insertion, deletion, and traversal in both directions.

Key Methods
* insertAtBegin(int data)
Inserts a new node with the given data at the beginning of the list.

* deleteAtBeginning()
Deletes the node at the beginning of the list. Prints a message if the list is empty.

* insertAtEnd(int data)
Inserts a new node with the given data at the end of the list.

* deleteAtEnd()
Deletes the node at the end of the list. Prints a message if the list is empty.

* displayForward()
Prints the list elements from head to tail.

* displayBackward()
Prints the list elements from tail to head.
