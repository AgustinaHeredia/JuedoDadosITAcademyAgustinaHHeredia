package cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01.model.entity.Player;
import cat.itacademy.barcelonactiva.herediamarengo.agustina.s05.t02.n01.model.services.PlayerService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/")
    public ModelAndView showHomePage() {
        return new ModelAndView("home");
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> createPlayer(@ModelAttribute Player player) {
        playerService.createPlayer(player);
        return ResponseEntity.ok("Player created successfully");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updatePlayer(@PathVariable Long id, @RequestParam String name) {
        playerService.updatePlayerName(id, name);
        return ResponseEntity.ok("Player updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return ResponseEntity.ok("Player deleted successfully");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Player> getPlayer(@PathVariable Long id) {
        Player player = playerService.getPlayer(id);
        return ResponseEntity.ok(player);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        return ResponseEntity.ok(players);
    }

    @GetMapping("/players")
    public ModelAndView showAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        ModelAndView modelAndView = new ModelAndView("player-list");
        modelAndView.addObject("players", players);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreatePlayerForm() {
        return new ModelAndView("create-player");
    }

    @GetMapping("/update/{id}")
    public ModelAndView showUpdatePlayerForm(@PathVariable Long id) {
        Player player = playerService.getPlayer(id);
        ModelAndView modelAndView = new ModelAndView("update-player");
        modelAndView.addObject("player", player);
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeletePlayerConfirmation(@PathVariable Long id) {
        Player player = playerService.getPlayer(id);
        ModelAndView modelAndView = new ModelAndView("delete-player");
        modelAndView.addObject("player", player);
        return modelAndView;
    }

    @GetMapping("/getOneForm/{id}")
    public ModelAndView showPlayerDetailsForm(@PathVariable Long id) {
        Player player = playerService.getPlayer(id);
        ModelAndView modelAndView = new ModelAndView("get-player");
        modelAndView.addObject("player", player);
        return modelAndView;
    }
}
