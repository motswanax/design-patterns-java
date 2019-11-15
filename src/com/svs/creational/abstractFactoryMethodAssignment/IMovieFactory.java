package com.svs.creational.abstractFactoryMethodAssignment;

public interface IMovieFactory {
    IBollywoodMovie getBollywoodMovie();

    IHollywoodMovie getHollywoodMovie();
}
