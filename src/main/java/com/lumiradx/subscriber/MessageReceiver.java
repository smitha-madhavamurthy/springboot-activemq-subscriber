package com.lumiradx.subscriber;

import com.lumiradx.LumiraMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver
{
    private static Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    @JmsListener(destination = "${careprogram.enrol.topic.name}")
    public void receive(LumiraMessage lumiraMessage)
    {
        log.info("Message Received []" + lumiraMessage);
    }
}
