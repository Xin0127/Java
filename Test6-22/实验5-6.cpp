#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main(void)
{
	string str;
	ofstream outFlie("../cout.txt");
	ofstream filego("./here", ios::binary);
	cout << "������Ҫд��cout�е�����:";
	cin >> str;
	outFlie << str;
	cout << "�ɹ���\"" << str << "\"д�뵽�ļ���!\n";
	outFlie.close();
 
	outFlie.open("../cout.txt", ios::app);
	cout << "������Ҫ׷�ӵ����֣�";
	cin >> str;
	outFlie << str;
	cout << "�ɹ���\"" << str << "\"д�뵽�ļ���!\n";
	outFlie.close();
 
	system("pause");
	return 0;
}

/*#include <iostream>
using namespace std;
const double PI=3.14;
class Circle
{ 
	public:
		Circle(double r) {
			radius = r;
		} 
		virtual double area() {
			return 0.0;
		} 
		virtual double volume() {
			return 0.0;
		} 
	protected:
		double radius;
};
class Sphere:public Circle
{
	public:
		Sphere( double r ):Circle( r ){}
		double area(){
			return 4.0 * PI * radius * radius;
		} 
		double volume(){
			return 4.0 * PI * radius * radius * radius / 3.0;
		} 
};
class Cylinder:public Circle
{
	public:
		Cylinder( double r,double h ):Circle( r ) {
			height = h;
		}
		double area(){
			return 2.0 * PI * radius * ( height + radius );
		} 
		double volume(){
			return PI * radius * radius * height;
		} 
    private:
    	double height;
};
int main(){
	Circle *p;
	Sphere sobj(4);
	p = &sobj;
	cout << "����ı����= " << p->area() << endl;
	cout << "��������= " << p->volume() << endl;
	cout << "" << endl;
	Cylinder cobj( 4,9 );
	p = &cobj;
	cout << "Բ����ı����= " << p->area() << endl;
	cout << "Բ��������= " << p->volume() << endl;
} */

