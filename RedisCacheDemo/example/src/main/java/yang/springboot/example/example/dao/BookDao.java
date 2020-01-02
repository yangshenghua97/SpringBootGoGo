package yang.springboot.example.example.dao;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import yang.springboot.example.example.entry.Book;

@Repository
@CacheConfig(cacheNames = "book_cache")
public class BookDao {
    @Cacheable
    public Book getBookById(Integer id){
        System.out.println("getBookById");
        Book book = new Book();
        book.setId(id);
        book.setName("yangshenghua");
        book.setAuthor("平凡的世界");
        return book;
    }
    @CachePut(key = "#book.id")
    public Book updateBookById(Book book){
        System.out.println("updateBookById");
        book.setName("当下的力量");
        return book;
    }
    @CacheEvict(key = "#id")
    public void deleteBookById(Integer id){
        System.out.println("deleteBookById");
    }
}
