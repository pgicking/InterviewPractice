#include "List.h"

int main(){
	List list;
	
	for(int i = 0; i < 10; ++i){
		list.addNode(i);
	}
	list.print();
	list.removeLast();	
	list.print();
	list.removeVal(5);
	list.print();
	list.Insert(0,5);
	list.print();
	list.Insert(3,10);	
	list.print();
	list.search(5);
	list.search(11);
	cout << "blah\n";
	return 0;
}
