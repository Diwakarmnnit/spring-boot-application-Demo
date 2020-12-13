package Demo.entity

import net.bytebuddy.asm.Advice
import javax.annotation.Generated
import java.util.*
import javax.persistence.*
@Entity
@Table (name = "product_table")
class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int = 0
    var name: String? = null
    var quantity: Int = 0
    var price: Double = 0.0

}