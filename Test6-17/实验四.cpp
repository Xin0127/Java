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
		cout <<"��ַΪ��"<< address << endl;
		cout <<"¥��Ϊ��"<<housenum << endl;
		cout <<"���ţ�"<<roomnum << endl;
		cout <<"�����"<<area <<"ƽ����"<< endl;
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
		cout <<"��ַΪ��"<< address << endl;
		cout <<"¥��Ϊ��"<<housenum << endl;
		cout << "�칫�����ƣ�" << officename << endl;
		cout << "�绰���룺" << telnum << endl;
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
	building.Buildings("�ǻ�����", 6);
	house.Houses(building,609,200);
	house.printfout();
	office.Offices(building,"�꿹�����","13002253615");
	office.printfout();
	return 0;
}

