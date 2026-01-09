package org.example.service;

import org.example.model.Adestrador;
import org.example.model.Pokemon;
import org.example.repository.AdestradorRepository;
import org.example.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepo;

    private final AdestradorRepository adestradorRepo;

    public PokemonService(PokemonRepository pokemonRepo, AdestradorRepository adestradorRepo) {

        this.pokemonRepo = pokemonRepo;
        this.adestradorRepo = adestradorRepo;

    }

    //insertar pokemon na base de datos
    public void crearPokemon(Pokemon p) {
        pokemonRepo.save(p);

    }

    //buscar pokemon por id
    public Pokemon buscarPokemon(String id) {
        return pokemonRepo.findById(id).orElse(null);

    }

    //listar todos os pokemons
    public List<Pokemon> buscarPokemons() {
        return pokemonRepo.findAll();
    }

    //Buscar adestrador de pokemon

    public Adestrador buscarAdestradorDePokemon(String idPokemon) {
        Pokemon pokemon = buscarPokemon(idPokemon);
        if (pokemon == null) return null;

        Adestrador adestrador = adestradorRepo.findById(pokemon.getAdestradorId()).orElse(null);

        return adestrador;
    }
}
