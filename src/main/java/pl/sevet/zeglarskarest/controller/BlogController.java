package pl.sevet.zeglarskarest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sevet.zeglarskarest.dto.BlogPostDto;
import pl.sevet.zeglarskarest.dto.BlogPostShortDto;
import pl.sevet.zeglarskarest.dto.ImageDto;
import pl.sevet.zeglarskarest.service.BlogService;

import javax.print.attribute.standard.Media;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blog")
public class BlogController {

    private final BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(path = "/getAllShorts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BlogPostShortDto>> getAllShorts
            (@RequestParam(required = false) int page, @RequestParam(required = false)String category,
             @RequestParam(required = false) boolean fetchImages, @RequestParam(required = false) boolean fetchDescriptions) {

        return blogService.getAllShorts(category,page,fetchImages,fetchDescriptions)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }


    @GetMapping(path = "/getPost", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BlogPostDto>> getBlogPost(@RequestParam int blogPostId){

        return blogService.getBlogPost(blogPostId)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping(path = "/getCategories", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getCategories(){

        return blogService.getCategories()
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @GetMapping(path = "/getPostGallery", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ImageDto>> getPostGallery(@RequestParam int postId) {
        return blogService.getPostGallery(postId)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NO_CONTENT).build());
    }

    @GetMapping(path = "/getPostImage", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ImageDto> getPostImage(@RequestParam int imgId) {
        return blogService.getPostImage(imgId)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping(path = "/createPost")
    public ResponseEntity<Integer> createPost(@RequestBody BlogPostDto blogPostDto) {
        return ResponseEntity.ok(blogService.createPost(blogPostDto));
    }

    @PostMapping(path = "/createPostCategory")
    public ResponseEntity<Boolean> createPostCategory(@RequestParam String category) {
        return ResponseEntity.ok(blogService.createPostCategory(category));
    }

    @PostMapping(path = "/addPostGalleryImage")
    public ResponseEntity<Integer> addPostGalleryImage(@RequestBody ImageDto imageDto){
        return blogService.addPostGalleryImage(imageDto)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.status(HttpStatus.NOT_MODIFIED).build());
    }

    @PatchMapping(path = "/updatePost")
    public ResponseEntity<Boolean> updatePost(@RequestBody BlogPostDto blogPostDto) {
        if(blogService.updatePost(blogPostDto))
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }

    @DeleteMapping(path = "/deletePost")
    public ResponseEntity<Boolean> deletePost(@RequestParam int postId) {

        if(blogService.deletePost(postId))
            return ResponseEntity.ok(true);
        else
            return ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }


}
