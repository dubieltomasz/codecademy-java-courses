public class TweetCounter {
  
	public static void main(String[] args) {
    String tweet = "Liz Lemon, ninjas are kind of cool... I just dont know any personally. Get on that.";  

    // What's the character count?
    if(tweet.length() < 280) {
      System.out.println(tweet.length());
    }
  }
}
