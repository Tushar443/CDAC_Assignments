# #!/bin/bash

# echo "Hello"
#  echo Hello Tushar
#  echo *

#  echo "how  * look like ?"


#ARRAY
# read a
# read b
# read c


# my_arr=($a $b $c)



# my_arr=(1 2 3 4)

# echo ${my_arr[*]}

# echo ${#my_arr[@]}

# read n 

# for ((i=0;i<$n;i++))
# do 
#     echo -n "Hello$i " 
# done



# i=0
# while [ $i -le 3 ]
# do 
#     read x
#     if ((`grep a`))
#     then
#         continue
#     else
#         a[i]=$y
        
#     fi 
#     i=$(($i+1))
# done

# echo ${a[@]}


# read N
#   a=0
#    b=1
#     echo "The Fibonacci series is : " 
#     for (( i=0; i<N; i++ ))
#      do
#       echo "$a "
#        fn=$((a + b))
#        a=$b 
#        b=$fn
#   done 


# read N

# for((i=0;i<N;i++))
# do
#     read x
#    a[i]=$x 
#    echo ${a[i]} | rev
# done

# echo ${a[@]} | rev

# echo $str | rev


# read N

# echo $N | rev

# ps=(?=.*0-9)^[A-Za-z0-9]{8} 
# read password 
# if [[ $password =~ $ps ]];
#  then echo OK
# else echo Not 
#  fi 




echo "enter the password"
 read password
  len="${#password}" 
  if  [ $len -ge 8 ]  
    then 
        echo "$password" | grep -q [0-9] 
    if [ $? -eq 0 ]  
        then
             echo "$password" | grep -q [A-Z] 
        if [ $? -eq 0 ]  
            then
                 echo "$password" | grep -q [a-z]
            if [ $? -eq 0 ]  
                then 
                    echo "$password" | grep -q [$,@,\#,%]
                if [ $? -eq 0 ]  
                    then echo "Strong password"
                else echo "weak password include special chars"
                fi 
            else echo "weak password include lower case char" 
            fi
        else echo "weak password include capital char" 
        fi 
    else echo "please include"
    fi
fi


# read a
# read b
# read c

# if (( a > b && a > c ))
# then
#     echo "A is greater $a"
# elif (( b > a && b > c ))
# then
#     echo "B is greater $b"
# else
#     echo "C is greater $c"
# fi


# read A
# # read B
# # read C

# # sum=$(($A+$B+$C))

# printf '%0.3f' `echo $A | bc`

# read x
# while (($x -ne ""))
# do 
#     arr=(${arr[@]} $x)
# done

# echo ${arr[@]}


