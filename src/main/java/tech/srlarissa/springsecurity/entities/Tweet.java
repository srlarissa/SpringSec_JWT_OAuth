package tech.srlarissa.springsecurity.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;
    private User user;
    private String content;
    private Instant createdAt;
}
