//List.h created by Peter Gicking

#include <iostream>

using namespace std;
class Node
{
	public:
	int data;
	Node* next;
};

class List
{
	public:
	List(); 
	~List(); 
	void print();
	void addNode(int num);
	void removeLast();
	void removeVal(int num);
	void Insert(int pos, int num);
	int search(int num);
	
	private:
	Node * head;
	Node * tail;
};

