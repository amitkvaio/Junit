package junit.test.example05.annotation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AnnotationTest.class})
public class AnnotationTestSuite {

}
