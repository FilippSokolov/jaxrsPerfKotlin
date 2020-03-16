import javax.ws.rs.Path

@Path("/helloExtended")
class EndpointsExtended : Endpoints(), Cloneable {
    override fun say1(): String? {
        return super.say1()
    }

    override fun say2(): String {
        return super.say2()
    }

    override fun say3(): String? {
        return super.say3()
    }

    override fun say11(): String? {
        return super.say11()
    }

    override fun say7(): String? {
        return super.say7()
    }

    override fun say8(): String? {
        return super.say8()
    }

    override fun say10(): String? {
        return super.say10()
    }

    override fun doSayHello(name: String): String? {
        return super.doSayHello(name)
    }

    override fun doSayAge(name: String): String? {
        return super.doSayAge(name)
    }

    override fun doSayHelloWithFormParam(name: String): String? {
        return super.doSayHelloWithFormParam(name)
    }

    override fun say12(): String? {
        return super.say12()
    }

    override val test133: String?
        get() = super.test133

    override val test122: String
        get() = super.test122!!

    override fun say4(): String? {
        return super.say4()
    }

    override fun doSayHello2(name: String): String? {
        return super.doSayHello2(name)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(obj: Any?): Boolean {
        return super.equals(obj)
    }

    @Throws(CloneNotSupportedException::class)
    override fun clone(): Any {
        return super.clone()
    }

    override fun toString(): String {
        return super.toString()
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        super.test()
    }
}