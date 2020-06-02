class Player(val id: Int, val name: String, val hp: Int = 100){

    companion object{
        var Id = 0
        fun create(name : String):Player{
            return Player(++Id, name)
        }
    }
}

