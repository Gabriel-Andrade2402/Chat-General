package com.example.web.socket.SocketChat.kafka;

import org.springframework.context.annotation.Configuration;

//@EnableKafka
@Configuration
public class KafkaConfig {
	/*@Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }
    
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("topic-new")
				.partitions(10)
				.replicas(1)
				.build();
	}
	
	@KafkaListener(id="id", topics="topic-new")
	public void listen(String in) {
		System.out.println(in);
	}*/
}
