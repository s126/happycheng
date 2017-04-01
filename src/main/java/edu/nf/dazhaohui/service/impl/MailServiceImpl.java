package edu.nf.dazhaohui.service.impl;

import edu.nf.dazhaohui.service.MailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MailServiceImpl implements MailService {

    @Value("${mail.from}")
    private String myEmailAddress;

    @Resource
    private MailSender mailSender;

    @Override
    public void sendMailByQQ(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(myEmailAddress);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        mailSender.send(message);
    }


}
