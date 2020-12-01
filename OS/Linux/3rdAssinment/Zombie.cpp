//Orphan - 
//Parent exit , Init process becomes the parent of child process. 
// So child is terminated and process table gets deleted by os.
// Zombie - 
// When the child terminates it gives exit status to parent.
//  Meanwhile time suppose your parent is in sleep state and unable to recive any status from child. 
//  Though the child exit but the process occupies space in process table 

#include <iostream> 
#include <sys/types.h> 
#include <unistd.h> 
#include <stdlib.h> 
#include <sys/wait.h> 
using namespace std; 
int main(){ pid_t pid; 
pid=fork(); 
if(pid>0){
    cout<<"parent Before sleep" <<endl;
    sleep(5);
    cout<<"parent After Sleep"<<endl;
}else
{
    cout<<"child Before exit"<<endl;
    // exit(0);
    sleep(10);
    wait(NULL);
    cout<<"child After exit"<<endl;
}

return 0;
}
