
interface Virus{
    fun mutate()
    fun spread()
}
enum class VirusType{
    corona, influenza, HIV

}
class CoronaVirus:Virus{
    override fun mutate() {
        println("CoronaVirus class ")
    }
    override fun spread() {
        println(" CoronaVirus class ")
    }

}
class InfluenzaVirus:Virus{
    override fun mutate() {
        println(" InfluenzaVirus class ")
    }
    override fun spread() {
        println(" InfluenzaVirus class ")
    }

}
class HIVVirus:Virus{
    override fun mutate() {
        println(" HIVVirus class ")
    }
    override fun spread() {
        println(" HIVVirus class ")
    }

}
class VirusFactory{


    fun makeVirus(virusType:VirusType):Virus{
        var  x:Virus?
        if(virusType==VirusType.corona)
            x= CoronaVirus()
        else if(virusType==VirusType.influenza)
            x=InfluenzaVirus()
        else x=HIVVirus()
        return x;


    }
}