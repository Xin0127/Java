/*
//��һ�� 
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
			cout<<a<<"���ͷ�"<<endl;
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
/*�����
loT2021
2021���ͷ�
loT���ͷ� 
*/ 
/* 
//������ 
#include<iostream>
using namespace std;
class B{
	public:
		void f1(){
			cout<<"B���еĺ���f1\n";
		}
		virtual void f2(){
			cout<<"B���еĺ���f2\n";
		}
};
class D:public B{
	void f1(){
		cout<<"D���еĺ���f1\n";
	}
	virtual void f2(){
		cout<<"D���еĺ���f2\n";
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
/*�����
B���еĺ���f2
B���еĺ���f1
D���еĺ���f2
*/ 
/*
//������ 
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
/*�����
11 14 switch end.
*/ 
/*
������
CScrollBar���������ؼ����ṩ�ؼ����Ĺ��ܣ������Ի���򴰿��е�һ���ؼ����û���ͨ������ĳһ����Χ��λ�� 
*/ 
#include<iostream>
using namespace std;
int main(){
	int n;
	cout<<"����n��ֵ��"<<endl; 
	cin>>n;
	int sum=0;
	for(int i=1;i<=n;i++){
		sum+=i*i*i;
	}
	cout<<sum<<endl;
}

