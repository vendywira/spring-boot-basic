package app.learn.spring.basicspringboot;

/**
 * @author I Wayan Vendy Wiranatha
 */
public class Message {
  private String message;

  public Message(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
