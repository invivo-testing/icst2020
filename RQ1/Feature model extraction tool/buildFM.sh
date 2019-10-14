#!/bin/bash


apps_path="./prefest_apps/"
output_path_orig="output"

output_path="${output_path_orig}_$(date +%s)"
mkdir $output_path

for i in $(ls -d $apps_path/*/)
do 
	#echo $i
	an=$(basename $i .apk)
	dn=$(dirname $i)
	#echo "$dn/$an"
	echo "Generating FM for app $an ..."
	java -jar fmbuilder-0.0.1-SNAPSHOT-jar-with-dependencies.jar "$dn/$an/res/" "$an" "$output_path/"
	echo "done."
	
done

echo "FM generation finished. All output written to: $output_path"
