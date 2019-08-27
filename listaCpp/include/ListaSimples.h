#ifndef LISTASIMPLES_H
#define LISTASIMPLES_H
#include <iostream>
using namespace std;

template <typename E>
class ListaSimples
{
    private:
        struct node {
           E data;
           node* next;
           node(E x){
                data= x;
                next= NULL;
           }
        };
        node* head;
    public:
        ListaSimples();
        virtual ~ListaSimples();
        void insert(E val);
        int remove(E val);
        int search(E val);
        void printList();
};

template <typename E>
ListaSimples<E>::ListaSimples(){
    head= NULL;

}

template <typename E>
int ListaSimples<E>::remove(E val)
{

    return -1;
}

template <typename E>
void ListaSimples<E>::insert(E val){
   struct node *n= new node(val);
   n->next = head;
   head = n;
}

template <typename E>
ListaSimples<E>::~ListaSimples() {
   head= 0;
}

template <typename E>
void ListaSimples<E>::printList(){
    node *temp = new node
    tep = head;
    cout << temp[0].data << endl;
    //while(temp->next != NULL){
    //    cout << temp->data << endl;
    //}

}


#endif // LISTASIMPLES_H
