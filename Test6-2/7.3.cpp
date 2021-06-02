//7.3
#include<iostream>
#include<string>
#include<string.h>
#pragma warning(disable:4996)
using  namespace std;
class A
{
public:
	A(const char *nm)
	{strcpy(name, nm);}
//private:
protected:
	char name[80];
};
class  B:public  A
{
public:
	B(const char *nm):A(nm)
	{}
	void PrintName() const;
};
void B::PrintName() const
{
	cout << "name:" << name << endl;
}
int main()
{
	B b1("wang li");
	b1.PrintName();
}

