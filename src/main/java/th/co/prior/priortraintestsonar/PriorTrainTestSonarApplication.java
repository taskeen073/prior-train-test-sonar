package th.co.prior.priortraintestsonar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PriorTrainTestSonarApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriorTrainTestSonarApplication.class, args);
        initializeDatabase();
        initializeConfig();

        // Continue with the rest of the application logic
        runApplication();
    }
    private static void initializeDatabase() {
        // Initialize database connection
        System.out.println("Initializing database...");
    }

    private static void initializeConfig() {
        // Load configuration
        System.out.println("Loading configuration...");
    }

    private static void runApplication() {
        // Application logic
        System.out.println("Running application...");
    }


}
