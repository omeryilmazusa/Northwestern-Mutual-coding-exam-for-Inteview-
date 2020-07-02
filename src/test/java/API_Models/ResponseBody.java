package API_Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;


@Data
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class ResponseBody {

        List<Comment> comments;
        List<Photo> photos;
        List<Album> albums;
        List<Post> posts;
        List<User> users;
        List<Todo> todos;

        // JSON == ResponseBody


    }

