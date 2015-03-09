import stackoverflow_28908151.Team

class BootStrap {

    def init = { servletContext ->

        if (Team.count == 0) {
            new Team(name: "Team 1").save(flush: true)
            new Team(name: "Team 2").save(flush: true)
            new Team(name: "Team 3").save(flush: true)
            new Team(name: "Team 4").save(flush: true)
            new Team(name: "Team 5").save(flush: true)
        }
    }
    def destroy = {
    }
}
