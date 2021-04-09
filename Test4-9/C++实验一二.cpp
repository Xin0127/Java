#include<iostream>
#include<string>
using namespace std;
const int M = 1000;//ѧ������ 
const int N = 1000;//�γ̸��� 
double score[M][N];
char name[M][24];
int m, n;
int cur = 0; //��ǰѧ������

void Print() {
	cout << "����" << "\t" << "�ɼ�" << endl;
	int i = 0;
	while (i < m) {
		if (i == cur){
			break;
		}
		cout << name[i] << "\t";
		for (int j = 0; j < n; j++) {
			cout << score[i][j] << "\t";
		}
		cout << endl;
		i++;
	}
	cout << endl;
}

void Add() {
	cout << "������ѧ������: ";
		cin >> name[cur];
		cout << "����ѧ���ɼ�: ";
	for (int i = 0; i < n; i++) {
		cin >> score[cur][i];
	}
	cur++;
}

void Swap(int i, int j) {
	swap(name[i], name[j]);
	swap(score[i], score[j]);
}

void Sort() {
	int* num = new int[cur];
	for (int i = 0; i < cur; i++) {
		num[i] = 0;
		for (int j = 0; j < n; j++) {
			num[i] += score[i][j];
		}
	}
	for (int i = 0; i < cur - 1; i++) {
		for (int j = 0; j < cur - i - 1; j++) {
			if (num[j] < num[j + 1]) {
				Swap(j, j + 1);
				swap(num[j], num[j + 1]);
			}
		}
	}
	delete[] num;
}

void Find() {
	cout << "����ѧ��������: ";
	char find[24] = "";
	cin >> find;
	for (int i = 0; i < cur; i++) {
		if (sizeof(name[i])==sizeof(find)) {
			cout << name[i] << "\t";
			for (int j = 0; j < n; j++)
				cout << score[i][j] << "\t";
			cout << endl;
			break;			
		}else{
			
		}
	}
	int i;
	if (i == cur){
		cout << "δ�ҵ���ѧ��! " << endl;
	}	
}

int main() {
	cout << "������ѧ������:" << " ";
	cin >> m;
	cout << "������ɼ�����:" << " ";
	cin >> n;
	for (int cur =0; cur < m; cur++) {
		Add();
	}
	cout<<endl;
	Print();
	Sort();
	cout << "�ܳɼ�����: " << endl;
	Print();
	Find();
	return 0;
}

/*#include<iostream>
#include<iomanip>
using namespace std;
const char M=3;
const int  N=4;
int main(){
	char name[M][20]={0};
	double score[M][N]={0};
	for(char i=0;i<M;i++){
		cout<<"����������";
		cin>>name[i];
		cout<<"������4���ɼ�" ;
		for(int j=0;j<N;j++)
		cin>>score[i][j];
	}
	cout<<setw(10)<<"name"<<setw(10)<<"score"<<endl;
	for(int i=0;i<M;i++){
		cout<<setw(10)<<name[i]<<endl;
		for(int j=0;j<N;j++)
		cout<<setw(20)<<score[i][j]<<endl;
		cout<<endl;
	}
} 
/* 10����ð������ 
int main(){
	int array[10];
	for(int i = 0 ; i < 10 ; i++){
		cin >> array[i];
	}
	for (int i = 0; i <= 9; i++) {
		for (int j = 0; j < 9 - i; j++) {
			if (array[j] > array[j + 1]) {
				int tmp;
				tmp=array[j];
				array[j]=array[j+1];
				array[j+1]=tmp;
			}
		}
	}	
	for(int i = 0 ; i < 10 ; i++){
		cout << array[i] << " ";
	} 	
}*/

/*1-100������ 
#include<math.h>
int main()
{
	for (int i = 2; i <= 100; i++) {
		bool flag=true;
		for (int j = 2; j<= sqrt(i); j++) {
			if (i % j == 0){
				flag=false;
				break;
			}
		}
		if (flag == true) {
			cout<<i<<endl;
		}
	}
	return 0;
}*/

