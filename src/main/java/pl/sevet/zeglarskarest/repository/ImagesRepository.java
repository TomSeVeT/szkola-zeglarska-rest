package pl.sevet.zeglarskarest.repository;

import org.springframework.data.repository.CrudRepository;
import pl.sevet.zeglarskarest.model.Images;

public interface ImagesRepository extends CrudRepository<Images, Long> {
}