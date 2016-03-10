#! /bin/bash

$(diff queries_out.txt src/main/resources/queries_out.txt) > /dev/null
if [ $? -eq 0 ]; then echo "You output is correct. PERFECT MATCH!!!"; else echo "Incorrect output, see the differences: ";diff queries_out.txt src/main/resources/queries_out.txt; fi;
