/*
simple intelliJ project
simple example of junit tests
Junit 5 dependencies -
    junit-jupiter-api (assertions & annotations)
    junit-platform-commons & junit-platform-engine (test discovery & execution)
*/

public class Calculator {
    int result;

    //method returning a value
    public int add(int a, int b){return a + b;}

    //method updating a variable
    public int subtract(int a, int b){
        result = a-b;
        return result;
    }

    //method updating a variable
    public int subtractFromResult(int b){
        result = result - b;
        return result;
    }

}
