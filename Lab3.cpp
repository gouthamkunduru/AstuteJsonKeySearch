
//Lab #03A
//C++ Programming

//<Deepthi Akula>
//<Data Structures and Algorithms(029)>
//<ID 999900271>

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

//double readData (double SENT, ifstream ("F:\\SAU\\DSA\\Assignments\\Lab03\\Lab3AData.txt"));

int main()
{
const double SENT = -999.99
double overallSum;
double groupSum;

ifstream openfile("Lab3AData.txt");

int n = 0;

    //while(n < size && file >> a[n])
while (! openfile.eof())

    {
        file >> groupSum;
        groupSum << readData(& openfile, SENT);

    }

double readData(openfile, double SENT)
{
    openfile >> input;
    while (input != SENT)
    {
        groupSum = groupSum + input;
        openfile >> input;
    }
return groupSum;
}


    return 0;
}
