package com.api.project.processor;

import com.api.project.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductProcessor implements ItemProcessor<Product,Product> {

    @Override
    public Product process(Product item) throws Exception {
        return item;
    }
}
