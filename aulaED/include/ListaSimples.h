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
void ListaSimples<E>::insert(E val)
{
   node *n= new node(val);
   // put the insert code here


}

template <typename E>
ListaSimples<E>::~ListaSimples() {
   head= 0;
}

template <typename E>
void ListaSimples<E>::printList(){

}


#endif // LISTASIMPLES_H
