<h1> Programming Challenge #1</h1>
 - Get the Java Project Template from: (https://github.com/contrast-cschmidt/Fishtank)
 - You will need Maven to build this project - you can get M3 from (http://maven.apache.org/download.cgi)
 - Conversely you can use CodeEnvy to check this project out online with built-in maven capabilities
 - You can also use M2E for Eclipse which ships with Maven capabilities

<h2>Write a program that simulates a fish tank containing different types of fish.</h2>

* The deliverable for the program will be the source code as a zip file and can be created by running mvn package from the command line. This will create fishtank.zip in the target directory
 
* The program shall be executable from the command line and shall take 5 arguments representing different sizes of fish. The first argument should be x-large fish, then large fish, medium fish, small fish and finally x-small fish.

 ```
 java -jar fishtank.jar 1 2 3 4 5
 ```

* Larger fish will eat smaller fish, but smaller fish eat before larger fish.

* X-Small Fish grow immediately after being put in the tank since they eat first and grow after eating once.

* Small fish grow after eating 1 XSmall fish

* Medium fish grow after eating 2 Small fish or 4 XSmall fish

* Large fish grow after eating 2 Medium fish or 4 Small fish or 8 XSmall fish

* The program shall finish when all fish are the same size or there is only one fish remaining in the tank
 
* Fish can only eat once per cycle.
 
* Fish will always eat the biggest meal first.

* When the program exits it will print to stdout the size of fish left, how many there are, how many fish were eaten and how many times fish grew.
```
XLarge: 2
Fish Eaten: 5
Fish Grown: 6
```

<h2>Test Cases</h2>
You can run these test-cases yourself to ensure functionality by running the mvn test command.

| Parameters | Expected Output |
|----------|---------------|
| <null>|InvalidArgumentException|
|1 1 1 1 1|```XLarge: 1 Fish Eaten: 4 Fish Grown: 1```|
|10 4 7 2 0|```Large: 7 Fish Eaten: 16 Fish Grown: 19```|
