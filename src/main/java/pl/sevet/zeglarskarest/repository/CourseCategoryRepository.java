package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.CourseCategory;

public interface CourseCategoryRepository extends CrudRepository<CourseCategory, Long> {
}
