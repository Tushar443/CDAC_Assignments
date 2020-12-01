#!/bin/bash
echo name: $name    #to add name globaly used command export name="Tushar More"
name=Tushar
echo Hello $name

#output 
# thunder@thunderstrom:~/Desktop/Linux$ ./Scope.sh
# name: More
# Hello Tushar
# thunder@thunderstrom:~/Desktop/Linux$ export name="More Tushar Tanaji"

# thunder@thunderstrom:~/Desktop/Linux$ ./Scope.sh
# name: More Tushar Tanaji
# Hello Tushar

# thunder@thunderstrom:~/Desktop/Linux$ . ./Scope.sh
# name: More Tushar Tanaji
# Hello Tushar

# thunder@thunderstrom:~/Desktop/Linux$ . ./Scope.sh
# name: Tushar
# Hello Tushar