/**
 * This package contains the main entry point and core components
 * for the SpringStreamline application.
 */
package com.example.springstreamline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.
        SpringBootApplication;


@SpringBootApplication
@SuppressWarnings({
    "checkstyle:FinalClass",
    "checkstyle:HideUtilityClassConstructor"
})
public class SpringStreamlineApplication {

    private SpringStreamlineApplication() {
        // Prevent instantiation
    }

    public static void main(final String[] args) {
        SpringApplication.run(SpringStreamlineApplication.class, args);
    }
}
