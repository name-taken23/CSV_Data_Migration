package com.james.view;

import com.james.model.EmployeeDTO;
import com.james.model.factory.EmployeeFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CLIChecks {
    @Nested
    @DisplayName("Command Line Interface validation checks:")
    public class CLIValidationChecks {
        @Test
        @DisplayName("Test empty input returns null")
        void testCreateEmployeeWithEmptyInput() {
            String input = "";
            EmployeeDTO employee = EmployeeFactory.createEmployee(input);
            assertNull(employee);
        }

    }

}
