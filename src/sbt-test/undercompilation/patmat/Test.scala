package test

object Test extends App {
  Getter.get match {
    case Some(Customer2(x)) => x
  }
}


