
public class Post {


    String title;  // Title String Variable
    String content;  // Content String Variable
    int authorID;    // Author ID Integer Variable

    public Post(String title, String content, int authorID) {    // Post Method for Permanent Variable Storage
        this.title = title;    // Move Title from Temp to Perma Variable
        this.content = content;    // Move Content from Temp to Perma Variable
        this.authorID = authorID;    // Move Author ID from Temp to Perma Variable
    }


    
}

