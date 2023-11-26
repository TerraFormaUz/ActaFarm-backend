package terraforma.example.actafarm.repository;


import terraforma.example.actafarm.model.Comment;
import terraforma.example.actafarm.model.Post;
import terraforma.example.actafarm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
