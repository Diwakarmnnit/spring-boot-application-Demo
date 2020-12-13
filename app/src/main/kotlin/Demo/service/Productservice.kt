package Demo.service
import Demo.entity.Product
import Demo.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class Productservice( private val repository: ProductRepository) {
      //post
      fun saveproduct(product : Product): Product {
          return repository.save(product)
      }
      fun saveProducts(product: List<Product>): List<Product>{
          return repository.saveAll(product)
      }
      //get
      fun getProduct(): List<Product> {
          return repository.findAll()
      }

      fun getProductById(id : Int): Optional<Product> {
         return repository.findById(id)
        }

      fun getProductByName(name: String): Product {
        return repository.findByName(name)
    }

     fun deleteProduct(id : Int): String {
         repository.deleteById(id)
         return "$id \n\n  product removed"
     }
}