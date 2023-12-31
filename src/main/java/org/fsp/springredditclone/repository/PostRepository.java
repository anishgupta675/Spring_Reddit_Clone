package org.fsp.springredditclone.repository;

import org.fsp.springredditclone.model.Post;
import org.fsp.springredditclone.model.Subreddit;
import org.fsp.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
