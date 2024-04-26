//############ NEW CODE FOR FLUENCE DEMO PURPOSE.. #####################

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
                "            background-color: white;\n" +
                "            color: black;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "            font-family: Arial, sans-serif;\n" +
                "        }\n" +
                "        header {\n" +
                "            background-color: gray;\n" +
                "            color: white;\n" +
                "            padding: 10px;\n" +
                "            text-align: left;\n" +
                "            width: 100%;\n" +
                "            z-index: 1000;\n" +
                "        }\n" +
                "        .logo {\n" +
                "            position: fixed;\n" +
                "            top: 10px;\n" +
                "            right: 10px;\n" +
                "        }\n" +
                "        .content {\n" +
                "            text-align: center;\n" +
                "            margin-top: 100px;\n" +
                "            padding: 20px;\n" +
                "        }\n" +
                "        .box {\n" +
                "            background-color: lightblue;\n" +
                "            padding: 20px;\n" +
                "            margin-top: 20px;\n" +
                "            border-radius: 5px;\n" +
                "            font-size: 24px; /* Increased font size */\n" +
                "        }\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<header>\n" +
                "    <h1>Fluence Project</h1>\n" +
                "</header>\n" +
                "<div class=\"logo\">\n" +
                "    <img src=\"./src/einfochips.png\" alt=\"Your Logo\">\n" +
                "</div>\n" +
                "<div class=\"content\">\n" +
                "    <h1>Hello Team, Welcome to Fluence Project</h1>\n" +
                "    <p>This is a DEMO 2 Application</p>\n" +
                "    <div class=\"box\">\n" +
                "        <h2>End to End CI/CD setup using CircleCI, JFrog, ArgoCD, and EKS</h2>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}
