package Question4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.ThrowingConsumer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.function.Function;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
class LifecycleSampleTest {
  @BeforeAll
  static void runOnceBeforeAllTests() {
    System.out.println("@BeforeAll executed \n");
  }
  @BeforeEach
  void runBeforeEveryTest() {
    System.out.println("@BeforeEach executed");
  }
  @Test
  void testMethod() {
    System.out.println("@Test method executed");
  }
  @AfterEach
  void runAfterEveryTest() {
    System.out.println("@AfterEach executed \n");
  }
  @AfterAll
  static void runOnceAfterAllTests() {
    System.out.println("@AfterAll executed");
  }
}
