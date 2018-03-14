Springboot-activemq-subscriber service demonstrates the minimal functionality to subscribe to a topic in ActiveMQ.

Some basics on how this is configured and what it means:
Spring boot automatically configures connectionfactory if it detects ActiveMQ on the classpath.
It makes use of an embedded broker if does not find any ActiveMQ custom configurations in application.properties.

spring-boot-starter-activemq : It provides all the required dependencies to integrate JMS and activemq with spring boot.

activemq-broker : This provides embedded activemq in spring boot application. But since, we will be configuring our activemq outside the application ,we will not be adding this as  a dependency in our service.

spring-boot-maven-plugin : It will collect all the jar files present in the classpath and create a single executable jar.

With Subcriber application, we configure jmsListenerContainerFactory bean in ActiveMQConfig.

@JmsListener:It marks a method to be the target of a JMS messagelistener on the specified destination. In our case the destination  is a topic whose name is set in the property 'careprogram.enrol.topic.name'.
The Receiver class is responsible to listen to messages in the topic and process the same.

To integrate a topic in Spring JMS, we need to manually configure spring to enable the framework to work with ActiveMQ.
We need to set the boolean flag 'pubSubDomain' to true for the bean definition of DefaultJmsListenerContainerFactory and the property to be set in application.properties 'spring.jms.pub-sub-domain' to true.

ActiveMq by default exposes a broker url tcp://localhost:61616 and an admin console on tcp://localhost:61616 with userId and password as admin and admin.

NOTE: LumiraMessage is a common Message model which needs to be handled by publisher and subscriber. Hence this model object will need to belong to a centralized library which both the services can use.
Once all applications in the platform can use Nexus as the artifact repo, these  common libraries will be published to Nexus.# springboot-activemq-subscriber
