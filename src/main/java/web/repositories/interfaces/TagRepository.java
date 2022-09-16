package web.repositories.interfaces;

import web.DTO.Tag;

import java.util.List;

public interface TagRepository {
    public Tag createTagIfNameNotExist(Tag tag);

    public List<Tag> findTagsByPostId(long postId);
}
