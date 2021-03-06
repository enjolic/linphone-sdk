package org.linphone.tester;

import junit.framework.TestSuite;

import org.junit.runner.RunWith;

@RunWith(org.junit.runners.AllTests.class)
public class CallRecoveryTests {
    public static TestSuite suite() {
        TestSuite testSuites = new TestSuite();
        testSuites.setName("Account creator");

        LinphoneTestSuite testsList = new LinphoneTestSuite();
        testsList.run(new String[]{"tester", "--list-tests", "Call Recovery"});
        for (String testName: testsList.getList()) {
            LinphoneTest test = new LinphoneTest("Call Recovery", testName);
            testSuites.addTest(test);
        }

        return testSuites;
    }
}

