/*
  SINGLETON

  What is it?
  A singleton is a class that is designed to only have one instance, providing
  global access to it.

  In this class, the single instance is a private static attribute, and has a
  corresponding public static accessor function for that class.
  In the accessor function of this class, we do 'lazy instantiaion' which means
  creation of the object is done at first use.
  All constructors are protected or private.
  Only the accessor function can be used to manipulate the singleton.

  Since a singleton is supposed to be global, we want to prevent race
  conditions from occuring where two threads try to access the get instance
  method while another thread is already in there.

*/

public class Main {

}
