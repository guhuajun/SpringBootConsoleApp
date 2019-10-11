package com.hanulhan.consoleApp;

import static java.lang.System.exit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsoleAppApplication implements CommandLineRunner{

    @Autowired
    private HelloMessageService helloService;
    
    public static void main(String[] args) {
        SpringApplication.run(ConsoleAppApplication.class, args);
    }
    // Put your logic here.

    @Override
    public void run(String... args) throws Exception {

        if (args.length > 0) {
            System.out.println(helloService.getMessage(args[0].toString()));
        } else {
            System.out.println(helloService.getMessage());
        }

        exit(0);
    }

}
