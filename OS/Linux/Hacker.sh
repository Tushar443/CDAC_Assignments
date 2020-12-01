declare -a my_arr
# read X

for i in {1..4}
do 
    read n
    my_arr=([ $i ]=$n)
    $i=$(expr $i + 1)
done

echo ${my_arr[@]}
    