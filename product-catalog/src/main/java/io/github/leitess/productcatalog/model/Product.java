package io.github.leitess.productcatalog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "product")
public class Product 
{
    @Id
    private Integer id;

    private String name;

    private Integer amount;   
}
