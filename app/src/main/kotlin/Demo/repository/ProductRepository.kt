package Demo.repository
import Demo.entity.Product
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
@Repository
public interface ProductRepository : JpaRepository<Product, Int> {
    fun findByName(name: String): Product

}