class Person<T>(_name: String, _phone: T) {
    private val name = _name
    val phone = _phone
    fun printInfo(){
        println("name = $name, phone = $phone")
    }
}