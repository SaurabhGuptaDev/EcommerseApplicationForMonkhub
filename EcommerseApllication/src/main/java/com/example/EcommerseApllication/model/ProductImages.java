com.example.EcommerseApllication.model;
import javax.persistence;

@Entity
@Table(name="product_images")
@Data
public class ProductImages{
    @Id
    @GenratedValue(strategy =GenrationType.IDENTITY)

    private Long id;

    private String imageUrl;

    private boolean isDefaultImage;

    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name="product_id")

    private Product product;
}