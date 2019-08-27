#include <iostream>
#include "include/ListaSimples.h"

using namespace std;

int main()
{
    ListaSimples<int> l;

    cout << "Lista inteiro!" << endl;
    l.insert(1);
    l.insert(2);
    l.insert(3);
    l.printList();
    l.remove(2);
    l.printList();


    ListaSimples<string> la;
    cout << "Lista string!" << endl;
    la.insert("abc");
    la.insert("de");
    la.insert("ef");
    la.printList();
    la.remove("ef");
    la.printList();


    return 0;
}
