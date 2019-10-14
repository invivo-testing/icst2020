# PreFest2espresso
This tool is meant to convert PreFest test cases (written in Java for Appium) into Espresso test cases (written in Java)

The conversion tool should be compiled with grade by typing "gradlew build"

The conversion tool should be run on each PreFest test case to convert, by typing 
"java -cp ./build/libs/PreFest2Espresso-1.0-SNAPSHOT.jar prefest2espresso.Main test.py out_dir"

Where "test.py" is the PreFest test to concert and "out_dir" is a directory to store the translated test, with proper package sub-directories