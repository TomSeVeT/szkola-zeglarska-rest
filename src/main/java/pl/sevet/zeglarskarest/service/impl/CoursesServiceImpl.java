package pl.sevet.zeglarskarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sevet.zeglarskarest.dto.CourseCategoryDto;
import pl.sevet.zeglarskarest.dto.CourseDto;
import pl.sevet.zeglarskarest.dto.CourseListDto;
import pl.sevet.zeglarskarest.dto.CourseShortDto;
import pl.sevet.zeglarskarest.repository.CourseCategoryRepository;
import pl.sevet.zeglarskarest.repository.CourseRepository;
import pl.sevet.zeglarskarest.repository.UserRepository;
import pl.sevet.zeglarskarest.service.CoursesService;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesServiceImpl implements CoursesService {

    private final CourseRepository coursesService;
    private final CourseCategoryRepository courseCategoryRepository;
    private final UserRepository userRepository;

    @Autowired
    public CoursesServiceImpl(CourseRepository coursesService, CourseCategoryRepository courseCategoryRepository, UserRepository userRepository) {
        this.coursesService = coursesService;
        this.courseCategoryRepository = courseCategoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<CourseDto> getCourse(int courseId, Optional<Boolean> fetchCalendar) {
        return Optional.empty();
    }

    @Override
    public Optional<List<CourseShortDto>> getAllShorts(String category) {
        return Optional.empty();
    }

    @Override
    public Optional<List<CourseListDto>> getListWithCategory(String category) {
        return Optional.empty();
    }

    @Override
    public Integer createCourse(CourseDto courseDto) {
        return null;
    }

    @Override
    public Integer createCourseCategory(CourseCategoryDto courseCategory) {
        return null;
    }

    @Override
    public Boolean updateCourse(CourseDto courseDto) {
        return null;
    }

    @Override
    public Boolean deletePost(int courseId) {
        return null;
    }
}
