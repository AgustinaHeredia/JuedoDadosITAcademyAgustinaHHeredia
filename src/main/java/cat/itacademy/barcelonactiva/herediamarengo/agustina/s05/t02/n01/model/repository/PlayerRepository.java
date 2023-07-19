package cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01.model.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("SELECT p FROM Player p ORDER BY p.winPercentage ASC NULLS FIRST")
    Player findPlayerWithLowestWinPercentage();

    @Query("SELECT p FROM Player p ORDER BY p.winPercentage DESC NULLS LAST")
    Player findPlayerWithHighestWinPercentage();
}
