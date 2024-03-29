# EEET2578-Group7
This project is used for testing EnviroSmart application. We use `Gradle` for managing dependencies including `JUnit`, `Ice` and `Icestorm`. The file `Helper.ice` has been converted to Java files in the `helper` package for compiling

## How to run

#### 1. Clone the project in your local directory
```shell
$ cd ~/Desktop
$ git clone git@github.com:8bitzz/EEET2578-Group7.git
```
#### 2. Download Ice 3.7 for Java

- If you're using macOS, you can use `brew` to install Ice ```$ brew install ice```
- If you're using WindowOS, you can download and install Ice from https://zeroc.com/downloads/ice/3.7/java#windows

#### 3. Run the Ice Server
The Ice Server is used for running multiple Java file at once. For our EnviroSmart application, we can run these files simultaneously in the correct order with the help of Ice

Go to the project directory, run these commands
```shell
$ cd ./bin
$ icebox --Ice.Config=config.icebox
```

#### 4. Run each file in the correct order
```
1. LocationServer.java 
2. PreferenceRepository.java 
3. WeatherAlarms.java 
4. ContextManager.java 
5. EnviroAPPUI.java
```

#### 5. If everything goes right, you should be prompted to enter the user name
- Enter `Jack` to check if the program runs correctly
 <img width="1005" alt="Screen Shot 2022-04-29 at 13 30 46" src="https://user-images.githubusercontent.com/23531403/165895033-e561a044-c432-43b5-b5ef-38c8d03702e8.png">


#### TIPS: Run all the files with one click
- Install `Multirun Plugin`: https://www.youtube.com/watch?v=pgZn89uwoKY&ab_channel=QuangVu
<img width="973" alt="Screen Shot 2022-04-29 at 12 17 50" src="https://user-images.githubusercontent.com/23531403/165894711-ef5b3c28-bc1a-44d8-9e4e-bb9d6076ec2e.png">

- Go to `Run >> Edit Configuration >> Add New Configuration with Multirun
<img width="257" alt="Screen Shot 2022-04-29 at 12 18 32" src="https://user-images.githubusercontent.com/23531403/165894790-ce2254a9-8318-49d3-bf3c-d0bba00b8fee.png">

- Add all Java files in step 4 and name the configuration as `Run all`
<img width="1032" alt="Screen Shot 2022-04-29 at 12 18 15" src="https://user-images.githubusercontent.com/23531403/165895223-aa33735f-99b0-48c1-a572-a1a59a7e30c0.png">

- Then you should be able to see the `Run all` button on your IDE and able to click that instead of running each files manually
 
<img width="530" alt="Screen Shot 2022-04-29 at 13 34 15" src="https://user-images.githubusercontent.com/23531403/165895450-3fe4ef65-8de6-44ef-a092-6b767de5faf5.png">




