package app.learn.spring.basicspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author I Wayan Vendy Wiranatha
 */

@Component
public class BaseConfig {

  @Bean
  public Message helloWord() {
    return new Message("hello world!");
  }
}
