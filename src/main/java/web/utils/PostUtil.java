package web.utils;

import web.DTO.Post;

public class PostUtil {
    public static boolean isEmpty(Post post) {
        return post == null || post.getId() == 0;
    }
}
