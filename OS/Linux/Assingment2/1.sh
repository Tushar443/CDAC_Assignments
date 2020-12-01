# a=1
# for i in *.txt
# do 
#     new=$(printf "%04d" "$a")  
#     mv -i -- "$i" "$new"
#     let a=a+1
# done


 echo "Enter the string"
read str flag=true;
 while $flag 
 do 
 echo "1)length"
  echo "2)copy" 
 echo "3)concat" 
 echo "4)compare" 
 echo "5)rev" 
 read x;
  case $x in 
  1) echo "${#str}";;
    2)
   echo $str str2=$str
    echo $str2 ;; 
    3) echo "Enter the string" 
    read str1
     echo "$str$str1";; 
     4) echo "Enter the string for comparision" read str1
      if (($str=$str1)) then echo "Match" else echo "Not match" fi ;;
       5)echo $str | rev;; 
       *) echo "You exit from game" flag=false;; 
       esac
 done 

num=`ls`
i=0
for i in {1..4}
do 

  mv "$num" "Tush$i" 
done
