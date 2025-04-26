package collectionUnderstnd;

import java.util.ArrayList;
import java.util.List;

public class CommonCollectionMethods
{
    public static void main(String[] args) {
        List<String> testCases = new ArrayList<>();

        //add()
        testCases.add("Login Test");
        testCases.add("Signup Test");

        List<String> moreTests = new ArrayList<>();
        moreTests.add("API Test");
        moreTests.add("UI Test");

        //addAll()
        testCases.addAll(moreTests);

        System.out.println("All Test Cases:"+ testCases);

        //contains()
        if(testCases.contains("Signup Test"))
        {
            System.out.println("Sign Up Test is Present on Colllection");
        }

        //size()
        System.out.println("Size of Test Cases:"+ testCases.size());

        //remove()
        testCases.remove("Signup Test");
        System.out.println("All Test Cases:"+ testCases);

        // removeALl()
        testCases.removeAll(moreTests);
        System.out.println("All Test Cases:"+ testCases);
    }

}
