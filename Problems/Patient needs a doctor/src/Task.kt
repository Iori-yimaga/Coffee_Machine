class Patient(var name: String) {

    // write the say method here
    fun say(){
        this.name = name
        print("Hello, my name is $name, I need a doctor.")
    }
}
