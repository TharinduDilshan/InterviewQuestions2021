#include <iostream>
using namespace std;

class list
{
private:
    struct Node{
        string data;
        Node *forw;
        Node *back;
    };

    Node *head;
    int length;

public:
    bool deleteNode(string);
};

//**************************************************
// Write a deleteNode function that deletes a node
// with the same key as its parameter (if found)
// in a doubly-linked list WITH a sentinel node
//**************************************************
bool list::deleteNode(string target)
{
    // head is sentinel node, start at next node
    Node *pCur = head->forw;  
    bool success = false;

    // Searching for the node by moving forward along list
    while (pCur != head && pCur->data != target)
    {
        pCur = pCur->forw;
    }

    // if the node is found
    if (pCur->data == target)
    {
        // Systematically delete the node
        Node *pPre = pCur->back; // identify previous node
        pPre->forw = pCur->forw;     // point previous node to node after target
        pCur->forw->back = pPre;     // point node after target to previous node
        delete pCur;                 // delete target node
        success = true;              
    }
    // Update the length
    length--;
 
    return success;
}
