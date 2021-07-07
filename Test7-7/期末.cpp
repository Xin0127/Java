/*
//第一题 
#include<iostream>
using namespace std;
#include<string.h>
class X{
	char *a;
	public:
		X(const char *aa="loT")
		{
			a=new char[strlen(aa)+1];
			strcpy(a,aa);
		}
		~X(){
			cout<<a<<"被释放"<<endl;
			delete[]a; 
		}
		char *Geta(){
			return a;
		}
}; 
int main(void)
{
	const char *p1="2021";
	X s1,s2(p1);
	cout<<s1.Geta()<<s2.Geta()<<endl;
} 
/*结果：
loT2021
2021被释放
loT被释放 
*/ 
/* 
//第四题 
#include<iostream>
using namespace std;
class B{
	public:
		void f1(){
			cout<<"B类中的函数f1\n";
		}
		virtual void f2(){
			cout<<"B类中的函数f2\n";
		}
};
class D:public B{
	void f1(){
		cout<<"D类中的函数f1\n";
	}
	virtual void f2(){
		cout<<"D类中的函数f2\n";
	}	
};
int main(void){
	B a,*p;
	D b1;
	p=&a;
	p->f2();
	p=&b1;
	p->f1();
	p->f2();
}
/*结果：
B类中的函数f2
B类中的函数f1
D类中的函数f2
*/ 
/*
//第五题 
#include<iostream>
using namespace std;
int main(){
	int x=5;
	switch(2*x-3){
		case 4:cout<<x<<' ';
		case 7:cout<<2*x+1<<' ';
		case 10:cout<<3*x-1<<' ';
		break;
		default:cout<<"default"<<endl;
	}
	cout<<"switch end."<<endl;
}
/*结果：
11 14 switch end.
*/ 
/*
第六题
CScrollBar：滚动条控件。提供控件条的功能，用作对话框或窗口中的一个控件，用户可通过它在某一个范围定位。 
*/ 
#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"输入n的值："<<endl; 
	cin>>n;
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i*i*i;
	}
	cout<<sum<<endl;
}

