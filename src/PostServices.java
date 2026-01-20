
public class PostServices {


    public Post createPost(String title, String content, int authorID) {
        Post p = new Post(title, content, authorID );   // Create Post through object creation
        return p;       // Return Post Data




    }



}


