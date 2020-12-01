// #include<iostream> 
// #include<sys/types.h> 
// #include<sys/wait.h> 
// #include<unistd.h> 
// #include<stdlib.h> 
// using namespace std; 
// int main(){
//      pid_t pid;
//      cout<<"Kishore Chutiya Igatpuri";

//      execl('bin/ls','ls','-a')
//      return 0;
// }

#include <iostream> 
#include <sys/types.h> 
#include <unistd.h> 
#include <stdlib.h> 
#include <sys/wait.h> 
using namespace std; 
int main(){ pid_t pid; 
pid=fork(); 
if(pid==0){
    cout<<"child"; 
    cout<<getpid()<<" "<<getppid(); 
    execl("/bin/ls","ls","-a",NULL); 
    //execl("/bin/ls","ls","-h",NULL); 
    //execl("/bin/ls","ls","-l",NULL); 
    //execl("/bin/ls","ls",NULL); 
    //char *programName = "ls"; 
    //char *arg1 = "-lh"; 
    //char *arg2 = "/home"; 
    //execlp(programName, programName, arg1, arg2, NULL); 
    }
   else { 
     cout<<"parent"; cout<<getpid()<<" "<<getppid(); 
     wait(NULL); 
     //sleep(5);
}
return 0;
}