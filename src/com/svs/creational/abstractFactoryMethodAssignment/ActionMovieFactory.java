package com.svs.creational.abstractFactoryMethodAssignment;

public class ActionMovieFactory implements  IMovieFactory {
    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }
}
