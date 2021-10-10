package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.BlogPostCategory;

public interface BlogPostCategoryRepository extends CrudRepository<BlogPostCategory, Long> {
}
