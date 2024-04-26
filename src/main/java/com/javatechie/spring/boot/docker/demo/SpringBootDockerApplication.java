//############ NEW CODE FOR FLUENCE DEMO PURPOSE.. ####################

package com.javatechie.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

        @GetMapping("/fluence")
        public String getMessage() {
                return "<!DOCTYPE html>" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Fluence Project</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            background-color: skyblue;\n" +
                "            color: black;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            font-family: Arial, sans-serif;\n" +
                "        }\n" +
                "        header, footer {\n" +
                "            background-color: black;\n" +
                "            color: white;\n" +
                "            padding: 30px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        .content {\n" +
                "            text-align: center;\n" +
                "            margin-top: 50px;\n" +
                "        }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<header>\n" +
                "    <a href=\"#\">Products</a> |\n" +
                "    <a href=\"#\">Sign up</a> |\n" +
                "    <a href=\"#\">Login</a> |\n" +
                "    <a href=\"#\">Team Size</a> |\n" +
                "    <a href=\"#\">About us</a> |\n" +
                "    <a href=\"#\">Contact</a>\n" +
                "</header>\n" +
                "<div class=\"content\">\n" +
                "    <h1>Hello Team, Welcome to Fluence Project</h1>\n" +
                "    <p>This is a DEMO Application</p>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
        }

        public static void main(String[] args) {
                SpringApplication.run(SpringBootDockerApplication.class, args);
        }

}

// #######  OLD CODE FOR TESTING ####################
/*package com.javatechie.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello world!! This is Java Application";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}*/


