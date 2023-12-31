package terraforma.example.actafarm.repository;


import terraforma.example.actafarm.model.Post;
import terraforma.example.actafarm.model.User;
import terraforma.example.actafarm.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
