public class UrlFixer {

    public static void main(String... args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        System.out.println("Not good: " + url);

        String url2 = "https://www.reddit.com/r/nevertellmethebots";

        System.out.println("Very good: " + url2.replace("bots", "odds"));

        System.out.println("What was the missing link: " + url2.charAt(5));

        System.out.println("Does the URL contains colon? " + url.contains(":"));
    }
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crutial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

}