package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.CourseDate;

public interface CourseDateRepository extends CrudRepository<CourseDate, Long> {
}
