package com.api.project.listener;

import com.api.project.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.item.Chunk;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class WriterListener implements ItemWriteListener<Product> {

    @Override
    public void beforeWrite(Chunk items) {
        //ItemWriteListener.super.beforeWrite(items);
    }

    @Override
    public void afterWrite(Chunk items) {

    }

    @Override
    public void onWriteError(Exception exception, Chunk items) {

    }
}
