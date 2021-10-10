package pl.sevet.zeglarskarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sevet.zeglarskarest.dto.*;
import pl.sevet.zeglarskarest.service.CoursesService;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    private final CoursesService coursesService;

    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }


    @GetMapping(path = "/getCourse", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CourseDto> getCourse(@RequestParam int courseId, @RequestParam Optional<Boolean> fetchCalendar) {
        return coursesService.getCourse(courseId, fetchCalendar)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping(path = "/getAllShorts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CourseShortDto>> getAllShorts
            (@RequestParam(required = false)String category) {

        return coursesService.getAllShorts(category)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @GetMapping(path = "/getListWithCategory", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CourseListDto>> getListWithCategory
            (@RequestParam(required = false)String category) {

        return coursesService.getListWithCategory(category)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @PostMapping(path = "/createCourse")
    public ResponseEntity<Integer> createCourse(@RequestBody CourseDto courseDto) {
        return ResponseEntity.ok(coursesService.createCourse(courseDto));
    }

    @PostMapping(path = "/createCourseCategory")
    public ResponseEntity<Integer> createCourseCategory(@RequestBody CourseCategoryDto courseCategory) {
        return ResponseEntity.ok(coursesService.createCourseCategory(courseCategory));
    }

    @PatchMapping(path = "/updateCourse")
    public ResponseEntity<Boolean> updateCourse(@RequestBody CourseDto courseDto) {
        if(coursesService.updateCourse(courseDto))
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @DeleteMapping(path = "/deleteCourse")
    public ResponseEntity<Boolean> deletePost(@RequestParam int courseId) {

        if(coursesService.deletePost(courseId))
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

}
