package pl.sevet.zeglarskarest.service;

import pl.sevet.zeglarskarest.dto.BlogPostDto;
import pl.sevet.zeglarskarest.dto.BlogPostShortDto;
import pl.sevet.zeglarskarest.dto.ImageDto;

import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;

public interface BlogService {
    Optional<List<BlogPostShortDto>> getAllShorts(String category, int page, boolean fetchImages, boolean fetchDescriptions);

    Optional<List<BlogPostDto>> getBlogPost(int blogPostId);

    Optional<List<String>> getCategories();

    Integer createPost(BlogPostDto blogPostDto);

    Boolean createPostCategory(String category);

    Optional<Integer> addPostGalleryImage(ImageDto imageDto);

    Boolean updatePost(BlogPostDto blogPostDto);

    Boolean deletePost(int postId);

    Optional<List<ImageDto>> getPostGallery(int postId);

    Optional<ImageDto> getPostImage(int imgId);
}
