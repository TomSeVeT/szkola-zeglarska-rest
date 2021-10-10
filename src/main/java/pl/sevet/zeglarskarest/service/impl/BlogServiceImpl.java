package pl.sevet.zeglarskarest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sevet.zeglarskarest.dto.BlogPostDto;
import pl.sevet.zeglarskarest.dto.BlogPostShortDto;
import pl.sevet.zeglarskarest.dto.ImageDto;
import pl.sevet.zeglarskarest.repository.BlogPostCategoryRepository;
import pl.sevet.zeglarskarest.repository.BlogPostRepository;
import pl.sevet.zeglarskarest.repository.UserRepository;
import pl.sevet.zeglarskarest.service.BlogService;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    private final BlogPostRepository blogPostRepository;
    private final BlogPostCategoryRepository blogPostCategoryRepository;
    private final UserRepository userRepository;

    @Autowired
    public BlogServiceImpl(BlogPostRepository blogPostRepository, BlogPostCategoryRepository blogPostCategoryRepository, UserRepository userRepository) {
        this.blogPostRepository = blogPostRepository;
        this.blogPostCategoryRepository = blogPostCategoryRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Optional<List<BlogPostShortDto>> getAllShorts(String category, int page, boolean fetchImages, boolean fetchDescriptions) {
        return Optional.empty();
    }

    @Override
    public Optional<List<BlogPostDto>> getBlogPost(int blogPostId) {
        return Optional.empty();
    }

    @Override
    public Optional<List<String>> getCategories() {
        return Optional.empty();
    }

    @Override
    public Integer createPost(BlogPostDto blogPostDto) {
        return null;
    }

    @Override
    public Boolean createPostCategory(String category) {
        return null;
    }

    @Override
    public Optional<Integer> addPostGalleryImage(ImageDto imageDto) {
        return Optional.empty();
    }

    @Override
    public Boolean updatePost(BlogPostDto blogPostDto) {
        return null;
    }

    @Override
    public Boolean deletePost(int postId) {
        return null;
    }

    @Override
    public Optional<List<ImageDto>> getPostGallery(int postId) {
        return Optional.empty();
    }

    @Override
    public Optional<ImageDto> getPostImage(int imgId) {
        return Optional.empty();
    }
}
