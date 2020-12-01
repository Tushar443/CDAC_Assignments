read ch 
a=$(echo "scale=3;$ch"|bc)

echo $a

# read number sum=0 #for i in {0..$number} for((i=1;i<=$number;i++)) do read value sum=$(( $sum + $value )) done avg=$(( $sum / $number )) a=`echo "$(( $sum / $number ))" | bc -l` as=`printf "%.3f" $a` echo "$as" 