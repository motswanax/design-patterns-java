package com.svs.creational.abstractFactoryMethodAssignment;

public class Client {

    public static void main(String[] args) {
        IMovieFactory actionMovies = FactoryProducer.getFactory("ACTION");

        IHollywoodMovie hAction = actionMovies.getHollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();

        hAction.getMovieName();
        bAction.getMovieName();

        // comedy movies
        IMovieFactory comedyMovies = FactoryProducer.getFactory("COMEDY");

        IHollywoodMovie hComedy = comedyMovies.getHollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();

        hComedy.getMovieName();
        bComedy.getMovieName();
    }
}
