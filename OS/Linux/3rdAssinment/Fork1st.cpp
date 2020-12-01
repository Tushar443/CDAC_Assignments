#include<iostream> 
#include<sys/types.h> 
#include<sys/wait.h> 
#include<unistd.h> 
#include<stdlib.h> 
using namespace std; 
int main(){
     pid_t pid;
     cout<<"Hello  "<<endl; 
     pid=fork();
     if (pid == 0)
     {
        cout<<"Child Existing  " <<getpid() <<"  "<< getppid()<<endl;
   
     }else
     {
        cout<< "Parent" <<" "<< getpid()<<endl;
     }
    
    

}