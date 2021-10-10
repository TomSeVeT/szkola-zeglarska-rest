package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
