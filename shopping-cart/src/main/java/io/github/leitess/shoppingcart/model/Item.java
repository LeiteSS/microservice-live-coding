package io.github.leitess.shoppingcart.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash ("item")
@Data
public class Item 
{
    private Long productId;
    
    private Integer amount;
}
