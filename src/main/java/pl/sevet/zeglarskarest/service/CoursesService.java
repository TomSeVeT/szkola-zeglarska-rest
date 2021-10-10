package pl.sevet.zeglarskarest.service;

import pl.sevet.zeglarskarest.dto.CourseCategoryDto;
import pl.sevet.zeglarskarest.dto.CourseDto;
import pl.sevet.zeglarskarest.dto.CourseListDto;
import pl.sevet.zeglarskarest.dto.CourseShortDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public interface CoursesService {
    Optional<CourseDto> getCourse(int courseId, Optional<Boolean> fetchCalendar);

    Optional<List<CourseShortDto>> getAllShorts(String category);

    Optional<List<CourseListDto>> getListWithCategory(String category);

    Integer createCourse(CourseDto courseDto);

    Integer createCourseCategory(CourseCategoryDto courseCategory);

    Boolean updateCourse(CourseDto courseDto);

    Boolean deletePost(int courseId);
}
