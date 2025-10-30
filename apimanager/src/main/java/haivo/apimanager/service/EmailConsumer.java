package haivo.apimanager.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class EmailConsumer {
    @Autowired
    private JavaMailSender mailSender;

    @KafkaListener(topics = "api-events", groupId = "email-consumer")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        sendEmail("test@example.com", "Kafka Notification", message);
    }

    private void sendEmail(String to, String subject, String text) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to); // Chỉ cần email người nhận
        msg.setSubject(subject);
        msg.setText(text);
        mailSender.send(msg);
        System.out.println("Email sent to: " + to);
    }
}
