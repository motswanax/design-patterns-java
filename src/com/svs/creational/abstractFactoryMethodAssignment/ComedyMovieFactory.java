package com.svs.creational.abstractFactoryMethodAssignment;

public class ComedyMovieFactory implements IMovieFactory {
    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }
}
