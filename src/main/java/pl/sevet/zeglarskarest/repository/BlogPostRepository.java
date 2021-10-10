package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.BlogPost;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}
