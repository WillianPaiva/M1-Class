#!/bin/bash
cd /home/willian/Documents/M1-Class/compilation/m1compilationjwv/trunk/compilationProject/
rm -rf bin/*
rm -rf src/Comp*
ant
rm -rf *.png
for file in *.dot
do
    dot -Tpng "$file" > "'$file'.png"
done
for file in *.png
do
feh $file &
done
cat Output.txt
exit 0


