

class TicTacToe {
    //Player one is Nought and player two is Cross
    //You have to justify using this representation later 

    sealed trait Player {
        def name: String
    }
    case class Nought( name: String = "Nought") extends Player
    case class Cross( name: String = "Cross") extends Player

    
    val state = List(9)

    val winningCombo = List(
                                List(0,1,2), List(3,4,5), List(6,7,8),
                                List(0,3,6), List(1,4,7), List(2,5,8),
                                List(2,4,6), List(0,4,8)
                            )
    
    


}