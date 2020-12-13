package Demo.controller
import Demo.entity.Product
import Demo.service.Productservice
import org.springframework.web.bind.annotation.*
import java.util.*
import org.springframework.web.bind.annotation.RequestMapping




@RestController
class ProductController(private val service: Productservice){

    @PostMapping("/addProduct")
    fun  addProduct(@RequestBody product: Product): Product {
        return service.saveproduct(product)
    }

    @PostMapping("/addProducts")
    fun  addProducts(@RequestBody product:Product): Product {
        return service.saveproduct(product)
    }

    @RequestMapping("/home")
     fun home(): String? {
        return "Hello World!"
    }
    @GetMapping("/products")
    fun  findAllProduct(): List<Product>{
        return service.getProduct()
    }

    @GetMapping("/findProductById/{id}")
    fun  findProductById(@PathVariable id :Int): Optional<Product> {
        return service.getProductById(id)
    }

    @GetMapping("/findProductByName/{name}")
    fun  findProductByName(@PathVariable name :String): Product {
        return service.getProductByName(name)
    }
    @DeleteMapping("/delete/{id}")
    fun deleteProduct(@PathVariable id: Int) : String{
        return service.deleteProduct(id)
    }

















}