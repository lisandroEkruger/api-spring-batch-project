package com.api.project.processor;

import com.api.project.domain.Product;
import com.api.project.domain.ProductDTO;
import com.api.project.domain.ProductDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductDTOProcessor implements ItemProcessor<Product, ProductDTO> {

    private final ProductDTOMapper mapper;

    @Override
    public ProductDTO process(Product item) {

        return mapper.apply(item);
    }
}
