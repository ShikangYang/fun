package com.vipjoy.joy.client.mail;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

@Component
public class EmailClient {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromEmail; //读取配置文件中的参数

    public void send(String toEmail, String username) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(fromEmail);
            helper.setTo(toEmail);
            helper.setSubject("标题：测试邮件");

            StringBuffer sb = new StringBuffer();
            sb.append("<h1>测试邮件</h1>")
                    .append("<p style='color:#F00'>你好," + username + "</p>")
                    .append("<p style='text-align:right'>哈韩哈啊哈</p>");
            helper.setText(sb.toString(), true);
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("e = {}", e);
        }

    }
}
