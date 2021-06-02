//7.2
#include<iostream>
using namespace std;
class A
{
	public:
		void f(int i)
		{cout<<i<<endl;}
		void g()
		{cout<<"g\n";}
};
class B:public A
//class B:A
{
	public:
		void h()
		{cout<<"h\n";}
		A::f;
};
int main()
{
	B d1;
	d1.f(6);
	d1.g();
	d1.h();
}
