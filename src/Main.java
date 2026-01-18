
public class Main {
    
    public static void main(String[] args) { // Main

        PostServices ps = new PostServices(); // Create Object for PostServices
  
        Post post = ps.createPost(); //Create post using Post as holder
        
        
        System.out.println(post.title);   // Print Title Variable
        System.out.println(post.content);  // Print Content Variable
        System.out.println(post.authorID);  // Print authorID Variable





    }
}
