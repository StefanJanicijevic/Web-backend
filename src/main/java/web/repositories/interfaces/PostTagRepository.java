package web.repositories.interfaces;

public interface PostTagRepository {
    public void addPostTag(long postId, long tagId);

    public void removePostFromTag(long postId);
}
