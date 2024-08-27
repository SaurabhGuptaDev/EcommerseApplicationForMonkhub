com.example.EcommerseApllication.model;
import javax.persistence;

@Entity
@Table(name="products")
@Data
public class Product{
    @Id
    @GenratedValue(strategy =GenrationType.IDENTITY)

    private Long id;
    private String title;
    private String description;
    private Double price;

    @column(name="date_created")
    private LocalDateTime dateCreated;

    
    @column(name="date_updated")
    private LocalDateTime dateUpdated;


    @OneToMany(mappedBy ="product" ,cascade =CascadeType.ALL,orphanRemoval =true)

    private List<ProductImages> ProductImages;

    @PrePersist

    protected void onCreate(){
        dateCreated =LocalDateTime.now();
    }
    
    protected void onUpdate(){
        dateUpdated =LocalDateTime.now();
    }
}