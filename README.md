# Web Scraper Java

This Java project demonstrates a simple web scraper using Jsoup. It connects to a specified URL, retrieves the webpage's title, and extracts and prints the content from a specific section of the page.

## Project Structure

- **src/main/java/org/oxylabs/Main.java**: The main class that performs web scraping.

## Features

- Connects to a webpage using Jsoup
- Retrieves and prints the webpage title
- Extracts and prints the content of the "About Us" section (or a similar section based on the provided CSS selector)

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven for dependency management

## Setup

1. **Clone the repository:**
    ```bash
    git clone https://github.com/Hemanths05/web-scraper-java.git
    cd web-scraper-java
    ```

2. **Navigate to the project directory:**
    ```bash
    cd web-scraper-java
    ```

3. **Add Jsoup dependency to your `pom.xml`:**
    ```xml
    <dependencies>
        <dependency>
            <groupId>org.jsoup</groupId>
            <artifactId>jsoup</artifactId>
            <version>1.15.3</version> <!-- Check for the latest version -->
        </dependency>
    </dependencies>
    ```

4. **Compile and run the project:**

    - **Compile the code:**
        ```bash
        mvn clean compile
        ```

    - **Run the application:**
        ```bash
        mvn exec:java -Dexec.mainClass="org.oxylabs.Main"
        ```

## How It Works

1. The `Main` class connects to the URL `https://hemanths05.github.io/portfolio_/` using Jsoup.
2. It retrieves the title of the webpage and prints it.
3. It selects the content of the section with the CSS class `.txtHead` and prints it.
4. If the section is not found, it prints a message indicating that the section was not found.

## Error Handling

- The program handles exceptions and prints the stack trace if any errors occur during the connection or scraping process.

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request.

