#include<iostream>
#include<string>
#include<stdlib.h>
using namespace std;
class Building
{
public:
	void Buildings(string ad, int hnum)
	{
		address = ad;
		housenum = hnum;
	}
	string address;             
	int housenum;              
};
class House:public Building
{
public:
	void Houses(Building b,int rnum, int ar)
	{
		this->address = b.address;
		this->housenum = b.housenum;
		roomnum = rnum;
		area = ar;
	}
	void printfout()
	{
		cout <<"地址为："<< address << endl;
		cout <<"楼号为："<<housenum << endl;
		cout <<"房号："<<roomnum << endl;
		cout <<"面积："<<area <<"平方米"<< endl;
	}
protected:
	int roomnum;          
	int area;               
};
class Office:public Building
{
public:
	void Offices(Building b,string name, string tel)
	{
		this->address = b.address;
		this->housenum = b.housenum;
		officename = name;
		telnum = tel;
	}
	void printfout()
	{
		cout <<"地址为："<< address << endl;
		cout <<"楼号为："<<housenum << endl;
		cout << "办公室名称：" << officename << endl;
		cout << "电话号码：" << telnum << endl;
	}
protected:
	string officename;		
	string telnum;			
};
int main()
{
	Building building;
	House house;
	Office office;
	building.Buildings("城基中心", 6);
	house.Houses(building,609,200);
	house.printfout();
	office.Offices(building,"昕昕工作室","13002253615");
	office.printfout();
	return 0;
}

