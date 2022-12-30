package com.bridgelabz.javamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaMailSenderApplication {
@Autowired
private EmailSenderService senderService;
    public static void main(String[] args) {
        SpringApplication.run(JavaMailSenderApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        senderService.sendEmail("rroshni.mali@bridgelabz.com",
                "This is subject","Hello Mam, Code is Working..!! ");
    }

}
