#ifndef LISTASIMPLESSTATIC_H
#define LISTASIMPLESSTATIC_H
#include <iostream>
using namespace std;

template <typename E>
class ListaSimplesStatic
{
    private:
        E *vet;
    public:
        ListaSimplesStatic();
        ListaSimplesStatic(int size);
        virtual ~ListaSimplesStatic();
        void insert(E val);
        int remove(E val);
        int search(E val);
        void printList();
};

template <typename E>
ListaSimplesStatic<E>::ListaSimplesStatic(){
  vet= new E[10];
}

template <typename E>
ListaSimplesStatic<E>::ListaSimplesStatic(int size){
    vet= new E[size];

}

template <typename E>
int ListaSimplesStatic<E>::remove(E val)
{
}

template <typename E>
void ListaSimplesStatic<E>::insert(E val)
{
   cout << "To be implemented \n";

}

template <typename E>
ListaSimplesStatic<E>::~ListaSimplesStatic() {

}

template <typename E>
void ListaSimplesStatic<E>::printList(){

}


#endif // LISTASIMPLES_H
