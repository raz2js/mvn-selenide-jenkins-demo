package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    @Description("Description of the test")
    @Severity(SeverityLevel.CRITICAL)
    public void testSearchField() {
        open("https://google.com");
        $("[name=q]").setValue("test");
    }
}
