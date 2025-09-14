package tech.srlarissa.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.srlarissa.springsecurity.entities.Tweet;


@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
