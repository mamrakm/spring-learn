package cz.mamrakm.spring.learn

import cz.mamrakm.spring.learn.Lol.test
import scala.annotation.unused

//noinspection ScalaFileName
//import org.springframework.boot.SpringApplication
//import org.springframework.boot.autoconfigure.SpringBootApplication
case class User(name: String)

object SpringLearnApplication extends App:

  private val fetos: User = User("Dusan")
  test(this)
  trait Equa[T]:
    def isEqual(a: T, b: T): Boolean

  implicit object UserEquality extends Equa[User]:
    override def isEqual(p1: User, p2: User): Boolean = p1.name.equals(p2.name)

  object Equa:
    def apply[T](implicit eq: Equa[T]): Equa[T] = eq

    @unused
    def isEqual[T](a: T, b: T)(implicit equalizer: Equa[T]): Boolean = equalizer.isEqual(a, b)

  println(Equa[User].isEqual(fetos, User("Jebek")))
  println("kokutek")

//  SpringApplication.run(classOf[BootOptions]);

//@SpringBootApplication
//class BootOptions
