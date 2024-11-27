/**
 * This package contains the main entry point and core components
 * for the SpringStreamline application.
 */
package com.example.springstreamline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.
        SpringBootApplication;

/**
 * Main application class for SpringStreamline.
 */
@SpringBootApplication
@SuppressWarnings({
        "checkstyle:HideUtilityClassConstructor",
        "checkstyle:FinalClass"
})
public class SpringStreamlineApplication {

    /**
     * Private constructor to prevent instantiation.
     */
    private SpringStreamlineApplication() {
        // Prevent instantiation
    }

    /**
     * The main entry point for the SpringStreamline application.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(
                SpringStreamlineApplication.class, args);
    }
}
