package com.epam.training.tasks.third.entities;

public interface Observer {

    public void update(CubeObservable cube);
}
//
//public class LazyInitializedSingleton {
//    private static com.epam.training.tasks.third.LazyInitializedSingleton instance;
  //  private LazyInitializedSingleton() {
//
  //  }
    //public static com.epam.training.tasks.third.LazyInitializedSingleton getInstance() {
      //  if (instance == null) {
        //    instance = new com.epam.training.tasks.third.LazyInitializedSingleton();
        //}
       // return instance;
    //}
//}