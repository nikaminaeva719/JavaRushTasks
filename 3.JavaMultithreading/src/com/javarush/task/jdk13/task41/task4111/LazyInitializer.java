package com.javarush.task.jdk13.task41.task4111;

import java.util.Objects;

public class LazyInitializer implements Entity {
    private int id;
    private VeryHeavyEntity entity;

    public LazyInitializer(int id) {
        this.id = id;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String find(String query) {
        if (Objects.isNull(entity)) {
            entity = VeryHeavyEntity.load(id);
        }
        return entity.find(query);
    }
}
