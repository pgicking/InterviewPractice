#include "List.h"

List::List(){
	head = NULL;
	tail = NULL;	
}

List::~List(){
	Node * temp = new Node();
	while(head->next != NULL){
		temp = head;
		head = head->next;
		delete temp;
	}
	delete tail;	
		
}

void List::addNode(int num){
	Node * current = new Node();
	Node * temp = new Node();
	if(head == NULL){
		temp->data = num;
		temp->next = NULL;	
		head = temp;
	}
	else{
		current = head;
		while(current->next != NULL){
			current = current->next;
		}
		temp->data = num;
		temp->next = NULL;	
		current->next = temp;
	}

}

void List::print(){
	Node * current = new Node();
	current = head;
	while(current->next != NULL){
		cout << current->data << " | ";
		current = current->next;
	}
	cout << endl;
}

void List::removeLast(){
	Node * current = new Node();
	Node * previous = new Node();
	if(head == NULL)
		return;

	current = head;
	while(current->next != NULL){
		previous = current;
		current = current->next;
	}
	delete current;
	previous->next = NULL;

}

void List::removeVal(int num){
	Node * current = new Node();
	Node * previous = new Node();
	if(head == NULL)
		return;

	current = head;
	while(current->data != num){
		previous = current;
		current = current->next;
	}

	cout << "removing " << num << "\n";
	previous->next = current->next;
	delete current;
}		

void List::Insert(int pos, int num){
	Node * current = new Node();
	Node * previous = new Node();
	Node * temp = new Node();
	int count = 0;
	if(pos == 0){
		temp->data = num;
		temp->next = head;
		head = temp;
	}
	else{
		current = head;
		while(count <= pos){
			++count;
			previous = current;
			current = current->next;
		}
	temp->data = num;
	temp->next = current;
	previous->next = temp;
	}
		
}

int List::search(int num){
	Node * current = new Node();
	int count = 0;	
	if(head == NULL)
		return -1;
	current = head;
	while(current->data != num && current->next != NULL){
		count++;
		current = current->next;
	}
	if(current->next == NULL && current->data != num){
		cout << "Could not find " << num << " in list\n";
		return -1;
	}
	cout << num << " is in position " << count << "\n";
	return count;	

}

