package demo

/**
 * Document me please
 * User: wfijarczyk
 * Date: 2015-01-12
 */
class HelloTest extends spock.lang.Specification {
    def "SayHello"() {
        expect: hello == "Hello"

        where: hello = new Hello().sayHello()

    }
}
