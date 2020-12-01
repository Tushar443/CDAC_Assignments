//Write a program to create one child.
 //Execute some code in the child such that the parent exits before the child. 
 //Showing that the child still remains under execution also mentions the new parent process ID of the child.


Write a program to create one child. Execute some code in the child such that the parent exits before the child. Showing that the child still remains under execution also mentions the new parent process ID of the child. 
#include<sys/types.h> 
#include<unistd.h> 
#include<stdio.h> 
void child(); 
void parent(); 
int main() {
     pid_t pid; 
     pid=fork(); 
     if(pid==0) child(); 
     else if(pid>0) parent();
      else printf("\nfork is failed!!"); 
      return 0; 
      } 
      void child() { 
          printf("\nchild's PID= %d", getpid());
           sleep(20); 
           printf("\nchild's parent's PID= %d", getppid()); 
           printf("\nChild is Exiting...\n");
            } 
            void parent() {
                 printf("\nparent's PID= %d", getpid()); 
                 sleep(2); 
            printf("\nparent is Exiting...\n"); 
            } 