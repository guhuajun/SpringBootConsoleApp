package com.hanulhan.consoleApp;

import static java.lang.System.exit;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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

        Random rand = new Random();

        if (args.length > 0) {
            System.out.println(helloService.getMessage(args[0].toString()));
        } else {
            while (true) {
                // System.out.println(helloService.getMessage());
                String number = String.valueOf(rand.nextInt(50) + 1);
                System.out.println(String.format("Consumed %s messages.", number));
                TimeUnit.SECONDS.sleep(1);
            }
        }

        exit(0);
    }

}
